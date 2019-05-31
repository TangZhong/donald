package cels.service;

import cels.entity.Vocabulary;
import cels.entity.Word;

import java.util.Map;
import java.util.Set;

/**
 * Created by donald.tang on 2019/5/30.
 */
public interface IBrowserService {

    Set<Word> getAllWords();

    Set<Vocabulary> getAllVocabularies();

    Map<Character, Set<Word>> getFirstMap();
}
