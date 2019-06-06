package com.flower.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.flower.bean.User;
import com.flower.bean.WXSession;
import com.flower.dto.ResponseDto;
import com.flower.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

@Controller
public class UserController {

    String appid = "wxed17f4e0d2311cfe".trim();
    String secret = "d981b9656a499cea2fca041271a0e470".trim();

    @Autowired
    UserService userService;
    @ResponseBody
    @PostMapping("/user/login")
    public ResponseDto login(User user, HttpSession session) throws IOException {
        System.out.println(user.getOpenid());
        //GET https://api.weixin.qq.com/sns/jscode2session?appid=APPID&secret=SECRET&js_code=JSCODE&grant_type=authorization_code
        StringBuilder json = new StringBuilder();
        try {
            URL url = new URL("https://api.weixin.qq.com/sns/jscode2session?appid="+appid+"&secret="+secret+"&js_code="+user.getOpenid()+"&grant_type=authorization_code");
            InputStream in =url.openStream();
            InputStreamReader isr = new InputStreamReader(in);
            BufferedReader bufr = new BufferedReader(isr);
            String str;
            while ((str = bufr.readLine()) != null) {
                System.out.println(str);
                json.append(str);
            }
            bufr.close();
            isr.close();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //{"session_key":"ySkVwL\/rVdqhg0tdyHhkTg==","openid":"opD6m5KMupHYZrrO1dvOBODSEt0w"}
        session.setAttribute("session_key", json);

        ObjectMapper mapper = new ObjectMapper();
        WXSession wxSession = mapper.readValue(json.toString(), WXSession.class);
        user.setOpenid(wxSession.getOpenid());
        //https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/login.html
        //会话密钥 session_key 是对用户数据进行 加密签名 的密钥。
        //为了应用自身的数据安全，开发者服务器不应该把会话密钥下发到小程序，也不应该对外提供这个密钥。

        //判断数据库中是否存在openid即用户是否注册过，未注册则用微信信息--名字和openid等进行注册
        //若已存在则读取数据库中的信息进行登录响应
        ResponseDto responseDto = userService.login(user);
        User user1 = ((User) responseDto.getData().get(0));
        session.setAttribute("userId",((User) responseDto.getData().get(0)).getId());
        System.out.println(user1);
        return responseDto;
    }


}
