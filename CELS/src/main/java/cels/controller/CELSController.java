package main.java.cels.controller;

import main.java.cels.entity.Vocabulary;
import main.java.cels.entity.Word;
import main.java.cels.service.impl.BrowserServiceImpl;
import main.java.cels.service.impl.GameServiceImpl;
import main.java.cels.service.impl.TestingServiceImpl;
import main.java.cels.view.CELSView;
import main.java.cels.view.PageBean;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by donald.tang on 2019/5/30.
 */
public class CELSController {

    private CELSView view = new CELSView();

    BrowserServiceImpl browserService = new BrowserServiceImpl();
    GameServiceImpl gameService = new GameServiceImpl();
    TestingServiceImpl testingService = new TestingServiceImpl();

    void start(){

        view.welcome();
        while(true){
            view.mainMenu();
            System.out.println("please input:");
            int choose = inputInt();
            switch (choose){
                case 0 :
                    System.out.println("exit");break;
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

    void browserMenuChoose(int choose){
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
                Set<Vocabulary> vocabularies = browserService.getAllVocabularies();
                PageBean pageBean = new PageBean(10,vocabularies);
                view.showVocabularyBrowserPageInfoView(pageBean);
                //choose page
                int vocabularyPageChoose = inputInt();
                view.showVocabularyBrowserItemsView(pageBean.getShowData(vocabularyPageChoose));
                break;
        }
    }

    void gameMenuChoose(int choose){

    }

    void testMenuChoose(int choose){

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
        BufferedReader br = null;

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
