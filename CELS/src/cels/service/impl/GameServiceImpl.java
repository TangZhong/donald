package cels.service.impl;

import cels.dao.IBaseTermDao;
import cels.dao.impl.BaseTermDaoImpl;
import cels.entity.Word;
import cels.service.IGameService;
import cels.util.StringUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by donald.tang on 2019/5/30.
 */
public class GameServiceImpl implements IGameService {

    private IBaseTermDao termDao;

    public GameServiceImpl() {
        termDao = new BaseTermDaoImpl();
    }

    @Override
    public Map<String, String> en2cn() {

        Map<String, String> en2cnMap = new HashMap<>();

        Set<Word> wordSet = termDao.readWordFile();

        for(Word word : wordSet){
            en2cnMap.put(word.getEn(), StringUtil.join(word.getCn(), ',',0,word.getCn().length));
        }

        return en2cnMap;
    }

    @Override
    public Map<String, String> cn2en() {

        Map<String,String> cn2enMap = new HashMap<>();

        Set<Word> wordSet = termDao.readWordFile();

        for(Word word : wordSet){
            cn2enMap.put(StringUtil.join(word.getCn(),',',0,word.getCn().length),word.getEn());
        }

        return cn2enMap;

    }
}
