package cels.dao.impl;

import cels.Constant;
import cels.dao.IBaseTermDao;
import cels.entity.Vocabulary;
import cels.entity.Word;
import cels.util.IOUtil;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by donald.tang on 2019/5/30.
 */
public class BaseTermDaoImpl implements IBaseTermDao {

    public static void main(String[] args) {

        BaseTermDaoImpl baseTermDao = new BaseTermDaoImpl();
        baseTermDao.writeWordFile();
//        baseTermDao.writeVocabularyFile();

    }

    @Override
    public Set<Word> readWordFile() {
        return (Set<Word>) IOUtil.readObject(Constant.WORD_OBJECT_FILE);
    }

    @Override
    public Set<Vocabulary> readVocabularyFile() {
        return (Set<Vocabulary>) IOUtil.readObject(Constant.VOCABULARY_OBJECT_FILE);
    }

    @Override
    public void writeWordFile() {
        //读原始文件
        List<String> lines = IOUtil.readLines(Constant.WORD_ORIGIN_FILE);
        //转换成对象
        Set<Word> wordSet = new HashSet<>();
        for(String line : lines){
            Word word = new Word();
            String [] encnArray = line.split(" ");
            word.setEn(encnArray[0]);
            word.setFirst(encnArray[0].charAt(0));
            word.setCn(encnArray[1].split(":"));
            wordSet.add(word);
            System.out.println(word);
        }

        //写入对象文件
        IOUtil.write(Constant.WORD_OBJECT_FILE,wordSet);
    }

    @Override
    public void writeVocabularyFile() {

        //读原始文件
        List<String> lines = IOUtil.readLines(Constant.VOCABULARY_ORIGIN_FILE);
        //转换成对象
        Set<Vocabulary> vocabularySet = new HashSet<>();
        for(String line : lines){
            Vocabulary vocabulary = new Vocabulary();
            String [] encnArray = line.split("#");
            vocabulary.setEn(encnArray[0]);
            vocabulary.setCn(encnArray[1].split(":"));
            vocabularySet.add(vocabulary);
            System.out.println(vocabulary);
        }

        IOUtil.write(Constant.VOCABULARY_OBJECT_FILE,vocabularySet);
    }


}
