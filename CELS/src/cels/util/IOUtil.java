package cels.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by donald.tang on 2019/5/31.
 */
public class IOUtil {

    public static List<String> readLines(String filePath){
        File file = new File(filePath);

        BufferedReader reader = null;

        List<String> result = new ArrayList<>();
        try {
            reader = new BufferedReader(new FileReader(file));

            String line = reader.readLine();
            while (line != null) {
                result.add(line);
                line = reader.readLine();
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(reader != null)
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        return result;
    }

    public static Object readObject(File file) {
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

    public static Object readObject(String filePath) {

        File file = new File(filePath);

        return readObject(file);
    }

    public static void write(String filePath,Object object) {

        File file = new File(filePath);

        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("写入文件目录不存在");
            }
        }

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(oos!=null)
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

    }

}
