package com.flower.dao;

import com.flower.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface UserDao {
    //查找所有用户
    List<User> findUserAll();

    List<User> findUserByCondition(Map map);

    List<User> findUserByIds(List list);

    int insertUser(User user);

    int insertUsers(List<User> users);

    int updateUser(Map map);

    int updateUsers(List<User> users);

    int deleteUserById(int id);

    int deleteUserByIds(List ids);
}
