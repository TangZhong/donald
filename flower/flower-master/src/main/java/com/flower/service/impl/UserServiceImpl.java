package com.flower.service.impl;

import com.flower.bean.User;
import com.flower.dao.UserDao;
import com.flower.dto.ResponseDto;
import com.flower.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    /**
     * 1.先判断用户名密码是否匹配
     * 2.匹配则登录成功，不匹配则判断是密码错误或者是未注册
     *
     * 1.由于不需要判断用户名密码，直接使用openid判断用户身份
     * 2.数据库存在openid则登录成功，否则把openid等用户信息插入数据库
     * @param user
     * @return
     */
    @Override
    public ResponseDto login(User user) {
        Map map = new HashMap();
        map.put("openid",user.getOpenid());
        List<User> users = userDao.findUserByCondition(map);
        if (null != users && users.size()!=0){
            //用户存在
            return new ResponseDto("200","",users);
        }else {
            int id = userDao.insertUser(user);
            List list = new ArrayList();
            if (user.getId()!=0){
                list.add(user);
                return new ResponseDto("200","",list);
            }else
                return new ResponseDto("500","注册新用户出错");
        }
    }
}
