package cels.service.impl;

import cels.dao.IBaseTermDao;
import cels.dao.impl.BaseTermDaoImpl;
import cels.entity.Vocabulary;
import cels.entity.Word;
import cels.service.IBrowserService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by donald.tang on 2019/5/30.
 */
public class BrowserServiceImpl implements IBrowserService {

    private IBaseTermDao termDao;

    public BrowserServiceImpl(){
        termDao = new BaseTermDaoImpl();
    }

    @Override
    public Set<Word> getAllWords() {
        return termDao.readWordFile();
    }

    @Override
    public Set<Vocabulary> getAllVocabularies() {
        return termDao.readVocabularyFile();
    }

    @Override
    public Map<Character, Set<Word>> getFirstMap() {

        Map<Character, Set<Word>> result = new HashMap<>();

        Set<Word> wordSet = termDao.readWordFile();

        for(Word word : wordSet){
            char first = word.getFirst();

            if(result.containsKey(first)){
                result.get(first).add(word);
            }else {
                Set<Word> newSet = new HashSet<>();
                newSet.add(word);
                result.put(first,newSet);
            }

        }

        return result;
    }
}
