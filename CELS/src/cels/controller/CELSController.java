package cels.controller;

import cels.entity.BaseTerm;
import cels.entity.TestRecord;
import cels.entity.Vocabulary;
import cels.entity.Word;
import cels.exceptions.NoTestRecordException;
import cels.service.impl.BrowserServiceImpl;
import cels.service.impl.GameServiceImpl;
import cels.service.impl.TestingServiceImpl;
import cels.util.StringUtil;
import cels.view.CELSView;
import cels.view.PageBean;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


/**
 * Created by donald.tang on 2019/5/30.
 */
public class CELSController {

    private CELSView view = new CELSView();

    BrowserServiceImpl browserService = new BrowserServiceImpl();
    GameServiceImpl gameService = new GameServiceImpl();
    TestingServiceImpl testingService = new TestingServiceImpl();

    private void start(){

        boolean running = true;
        view.welcome();
        while(running){
            view.mainMenu();
            System.out.println("please input:");
            int choose = inputInt();
            switch (choose){
                case 0 :
                    System.out.println("exit");
                    running = false;
                    break;
                case 1 :
                    view.showBrowserSubMenu();
                    int browserChoose = inputInt();
                    browserMenuChoose(browserChoose);
                    break;
                case 2 :
                    view.showGameSubMenu();
                    int gameChoose = inputInt();
                    gameMenuChoose(gameChoose);
                    break;
                case 3 :
                    view.showTestingSubMenu();
                    int testChoose = inputInt();
                    testMenuChoose(testChoose);
                    break;
                default:
                    System.out.println("error choose");
            }
        }

    }

    private void browserMenuChoose(int choose){
        switch (choose){
            case 0 : break;
            case 1 :
                Map<Character, Set<Word>> wordMap = browserService.getFirstMap();
                view.showWordBrowserFirstChooseView(wordMap);
                String wordChoose = inputLetter();
                Set<Word> wordSet = wordMap.get(wordChoose.charAt(0));
                view.showWordBrowserItemsView(wordSet);
                break;
            case 2 :
                for(;;){
                    Set<Vocabulary> vocabularies = browserService.getAllVocabularies();
                    PageBean pageBean = new PageBean(10,vocabularies);
                    view.showVocabularyBrowserPageInfoView(pageBean);
                    //choose page
                    int vocabularyPageChoose = inputInt();
                    if(vocabularyPageChoose > pageBean.getPages() || vocabularyPageChoose == 0)break;
                    view.showVocabularyBrowserItemsView(pageBean.getShowData(vocabularyPageChoose));
                }
                break;
        }
    }

    private void gameMenuChoose(int choose){
        switch (choose){
            case 0 : break;
            case 1 :
                Map<String, String> en2cnMap = gameService.en2cn();
                startGame(en2cnMap,true);
                break;
            case 2 :
                Map<String, String> cn2enMap = gameService.cn2en();
                startGame(cn2enMap,false);
                break;

        }
    }

    private void testMenuChoose(int choose){
        switch (choose){
            case 0 : break;
            case 1 :
                System.out.println("请输入要测试的题目数量:");
                int size = inputInt();
                List<BaseTerm> testingData = testingService.generateTestingData(size);
                startTesting(testingData);
                break;
            case 2 :
                List<TestRecord> records;
                try {
                    records = testingService.reviewTestRecord();
                } catch (NoTestRecordException e) {
                    System.out.println(e.getMessage());
                    break;
                }
                for(int i = 0; i < records.size(); ++i) {
                    if(i != 2) {
                        System.out.println(records.get(i));
                    } else {
                        System.out.print("[y or n]是否要继续? >");
                        String letter = this.inputLetter();
                        if(letter.toLowerCase().charAt(0) == 110) {
                            break;
                        }
                    }
                }
                break;

        }
    }

    private void startGame(Map<String, String> map, boolean flag) {
        int count = 0;
        double correct = 0.0D;
        String tip;
        if(flag) {
            tip = "中文";
        } else {
            tip = "英文";
        }

        long start = System.currentTimeMillis();

        for(String key : map.keySet()){
            String value = map.get(key);
            System.out.printf("【退出: e or q】〖%s〗的%s是： ", key,tip);
            String answer = this.inputString();
            if(answer.equalsIgnoreCase("e") || answer.equalsIgnoreCase("q")) {
                break;
            }

            ++count;
            if(this.isRight(answer, StringUtil.toStringArray(value), flag)) {
                ++correct;
                System.out.printf("√ 回答正确, 完整解释是：【%s】\n", value);
                System.out.println("————————————————");
            } else {
                System.out.printf("〤回答错误,完整解释是：【%s】\n", value);
                System.out.println("————————————————");
            }
        }

        long end = System.currentTimeMillis();

        double correctRate = correct / (double)count;
        System.out.printf("本次游戏共回答了【%d】次，正确个数【%.0f】,正确率 【%.1f%%】, 共花费时长：【%s】.\n", count, correct, correctRate * 100.0D, ((end - start) / 1000L));
        if(correctRate < 0.6D) {
            System.out.println("计算机英文水平较差哦  :(  :(  :(\n");
        } else {
            System.out.println(":)  :)  :) 哎哟！不错哦\n");
        }

    }

    private void startTesting(List<BaseTerm> testDatas) {
        Date d = new Date();
        long start = System.currentTimeMillis();
        int correct = 0;
        int error = 0;
        int total = testDatas.size();
        int count = 0;
        TestRecord record = new TestRecord();
        List<BaseTerm> tested = new ArrayList<>();

        for (BaseTerm bt : testDatas) {
            String en = bt.getEn();
            System.out.printf("【退出: e or q】 %d〖%s〗的中文含义是： ", count + 1, en);
            String answer = this.inputString();
            if (answer.equalsIgnoreCase("e") || answer.equalsIgnoreCase("q")) {
                break;
            }

            tested.add(bt);
            ++count;
            String[] cn = bt.getCn();
            if (this.isRight(answer, bt.getCn(), true)) {
                ++correct;
                System.out.printf("√ 回答正确, 完整解释是：【%s】\n", StringUtil.toString(cn));
                System.out.println("————————————————");
            } else {
                ++error;
                System.out.printf("〤回答错误,完整解释是：【%s】\n", StringUtil.toString(cn));
                System.out.println("————————————————");
            }
        }

        long end = System.currentTimeMillis();
        if(tested.size() > 0) {
            record.setDatas(tested);
            record.setCorrect(correct);
            record.setCount(count);
            record.setError(error);
            record.setTotal(total);
            record.setSeconds((end - start) / 1000L);
            record.setTestDate(d);
            this.testingService.saveTestRecord(record);
            double correctRate = (double)correct / (double)count;
            System.out.printf("本测试共有【%d】个题目，回答了【%d】个，正确【%d】个, 错误【%d】个, 正确率 【%.1f%%】, 共花费时长：【%s】.\n", total, count, correct, error, correctRate * 100.0D, (end - start) / 1000L);
            if(correctRate < 0.6D) {
                System.out.println("考得太差了，加油哦  :(  :(  :(\n");
            } else {
                System.out.println(":)  :)  :) 哎哟！考得不错哦\n");
            }
        } else {
            System.out.println("本次考试一题都没有答，将不会保存记录.");
        }

    }

    private boolean isRight(String answer, String[] valueArr, boolean flag) {
        int i;
        if(flag) {
            for(i = 0; i < valueArr.length; ++i) {
                if(valueArr[i].contains(answer)) {
                    return true;
                }
            }
        } else {
            for(i = 0; i < valueArr.length; ++i) {
                if(answer.equalsIgnoreCase(valueArr[i])) {
                    return true;
                }
            }
        }

        return false;
    }

    private int inputInt() {
        Scanner scan = new Scanner(System.in);

        try {
            return scan.nextInt();
        } catch (RuntimeException var3) {
            System.out.println("输入有误");
            System.out.print("请重新输入>");
            return this.inputInt();
        }
    }

    private String inputLetter() {
        Scanner scan = new Scanner(System.in);

        try {
            String str = scan.nextLine();
            if(str.toLowerCase().charAt(0) >= 97 && str.toLowerCase().charAt(0) <= 122) {
                return str;
            } else {
                System.out.println("输入的不是字母");
                System.out.print("请重新输入>");
                return this.inputLetter();
            }
        } catch (RuntimeException var3) {
            System.out.println("输入有误");
            System.out.print("请重新输入>");
            return this.inputLetter();
        }
    }

    private String inputString() {
        BufferedReader br;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            String result = br.readLine();
            result = result.trim();
            return result;
        } catch (IOException var3) {
            System.out.println("输入有错..");
            return this.inputString();
        }
    }

    public static void main(String[] args) {

        CELSController celsController = new CELSController();

        celsController.start();

    }

}
