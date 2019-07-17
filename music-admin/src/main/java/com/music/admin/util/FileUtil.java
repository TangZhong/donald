package com.music.admin.util;

import jdk.internal.util.xml.impl.Input;

import java.io.*;

/**
 * Created by donald.tang on 2019/7/17.
 */
public class FileUtil {

    private static final String BASE_PATH = System.getProperty("java.io.tmpdir") + File.separator + "music";

    private static final String FILE_TYPE_AUDIO = "audio";
    private static final String FILE_TYPE_LRC = "lrc";
    private static final String FILE_TYPE_IMG = "image";

    public static String saveSongFile(InputStream inputStream,String fileName){
        return saveFile(inputStream,fileName,FILE_TYPE_AUDIO);
    }

    public static String saveLrcFile(InputStream inputStream,String fileName){
        return saveFile(inputStream,fileName,FILE_TYPE_LRC);
    }

    private static String saveFile(InputStream inputStream,String fileName,String fileType){
        FileOutputStream out = null;
        try {
            String outPath = BASE_PATH + File.separator + fileType + File.separator + fileName;
            File outFile = new File(outPath);

            if(!outFile.getParentFile().exists())
                outFile.getParentFile().mkdirs();

            out = new FileOutputStream(outPath);

            byte[] bf = new byte[1024];
            int len = 0;
            while ((len = inputStream.read()) > 0){
                out.write(bf,0,len);
            }
            return outPath;
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally {
            if(inputStream != null)
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if(out != null)
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

}
