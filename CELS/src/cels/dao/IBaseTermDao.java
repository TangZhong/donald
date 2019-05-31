package cels.dao;

import cels.entity.Vocabulary;
import cels.entity.Word;

import java.util.Set;

/**
 * Created by donald.tang on 2019/5/30.
 */
public interface IBaseTermDao {

    Set<Word> readWordFile();

    Set<Vocabulary> readVocabularyFile();

    void writeWordFile();

    void writeVocabularyFile();

}
