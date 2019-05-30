package main.java.cels.service;

import java.util.Map;

/**
 * Created by donald.tang on 2019/5/30.
 */
public interface IGameService {

    String EN_TO_CN_BACKUP = "en2cn_history.dic";
    String CN_TO_EN_BACKUP = "cn2en_history.dic";
    String HISTROY_DIR = "datas/histroy";

    Map<String, String> en2cn();

    Map<String, String> cn2en();

}
