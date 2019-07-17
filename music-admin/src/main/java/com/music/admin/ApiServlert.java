package com.music.admin;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.music.admin.dao.SongDao;
import com.music.admin.formBean.SongFormBean;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by donald.tang on 2019/7/17.
 */
public class ApiServlert extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/json; charset=utf-8");
        PrintWriter out = response.getWriter();

        SongDao songDao = new SongDao();
        List<SongFormBean> songList = null;
        songList = songDao.list();

        JSONArray ja = new JSONArray();

        if(songList != null && songList.size() > 0){

            for(SongFormBean song : songList){
                JSONObject jo = new JSONObject();
                jo.put("song_name",song.getSongName());
                jo.put("song_url",song.getSongPath());
                jo.put("singer_name",song.getSingerName());
                jo.put("lrc_url",song.getLrcPath());
                ja.add(jo);
            }
        }

        out.print(ja);
    }
}
