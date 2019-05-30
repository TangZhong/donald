package main.java.cels.view;

import main.java.cels.entity.Vocabulary;
import main.java.cels.entity.Word;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by donald.tang on 2019/5/30.
 */
public class CELSView {

    public void welcome(){

        System.out.println("welcome");

    }

    public void mainMenu(){
        System.out.println("1.浏览词库");
        System.out.println("2.做游戏");
        System.out.println("3.测试");
        System.out.println("0.退出");
    }


    public void showBrowserSubMenu(){
        System.out.println("1.浏览单词");
        System.out.println("2.浏览词汇");
        System.out.println("0.返回上一级");
    }

    public void showWordBrowserFirstChooseView(Map<Character, Set<Word>> wordMap){
        for(Character firstWord : wordMap.keySet()){
            System.out.print(firstWord + " [" + wordMap.get(firstWord).size() + "]  ");
        }
    }

    public void showWordBrowserItemsView(Set<Word> wordSet){
        for(Word word : wordSet){
            System.out.println(word.getEn());
        }
    }

    public void showVocabularyBrowserItemsView(List<Vocabulary> vocabularies){
        for(Vocabulary vocabulary : vocabularies){
            System.out.println(vocabulary.getEn());
        }
    }

    public void showVocabularyBrowserPageInfoView(PageBean pb){
        System.out.printf("每页【%d】行 ※ 共计【%d】页 ※ 词汇量总数: 【%d】.   返回上一级  0 \n", new Object[]{Integer.valueOf(pb.getSize()), Integer.valueOf(pb.getPages()), Integer.valueOf(pb.getTotal())});
        System.out.println("——————————");
        System.out.printf("请选择页码【%d ~ %d】>", new Object[]{Integer.valueOf(pb.getFirst()), Integer.valueOf(pb.getPages())});
    }

    public void showGameSubMenu(){
        System.out.println("1.回答中文");
        System.out.println("2.回答英文");
        System.out.println("0.返回上一级");
    }

    public void showTestingSubMenu(){
        System.out.println("1.开始测试");
        System.out.println("2.查看测试记录");
        System.out.println("0.返回上一级");
    }


}
