package main.java.cels.dao.impl;

import main.java.cels.dao.IBaseTermDao;
import main.java.cels.entity.Vocabulary;
import main.java.cels.entity.Word;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Set;

/**
 * Created by donald.tang on 2019/5/30.
 */
public class BaseTermDaoImpl implements IBaseTermDao {

    public static void main(String[] args) {

        BaseTermDaoImpl baseTermDao = new BaseTermDaoImpl();
//        baseTermDao.getAllWords();

    }

    public Object read(String filePath) {

        File file = new File(filePath);

        Object result = null;

        if(!file.exists()){
            System.out.println("WARNING:库文件不存在!");
        }else {
            ObjectInputStream ois = null;
            try {
                ois = new ObjectInputStream(new FileInputStream(file));
                result = ois.readObject();
            } catch (ClassNotFoundException | IOException e) {
                e.printStackTrace();
            } finally {
                if(ois!=null)
                    try {
                        ois.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
            }
        }

        return result;
    }

    @Override
    public Set<Word> readWordFile() {
        return (Set<Word>) read(IBaseTermDao.WORD_FILE);
    }

    @Override
    public Set<Vocabulary> readVocabularyFile() {
        return (Set<Vocabulary>) read(IBaseTermDao.VOCABULARY_FILE);
    }

    @Override
    public void writeFile(String fileType) {

    }
}
