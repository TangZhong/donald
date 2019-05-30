package main.java.cels.dao;

import main.java.cels.entity.Vocabulary;
import main.java.cels.entity.Word;

import java.util.Set;

/**
 * Created by donald.tang on 2019/5/30.
 */
public interface IBaseTermDao {

    String WORD_FILE = "datas/dic/w.dic";
    String VOCABULARY_FILE = "datas/dic/v.dic";

    Set<Word> readWordFile();

    Set<Vocabulary> readVocabularyFile();

    void writeFile(String fileType);

}
