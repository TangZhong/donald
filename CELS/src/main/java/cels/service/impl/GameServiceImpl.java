package main.java.cels.service.impl;

import main.java.cels.dao.IBaseTermDao;
import main.java.cels.dao.impl.BaseTermDaoImpl;
import main.java.cels.entity.Word;
import main.java.cels.service.IGameService;
import main.java.cels.util.StringUtil;

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

        //todo 词汇map

        return en2cnMap;
    }

    @Override
    public Map<String, String> cn2en() {
        return null;
    }
}
