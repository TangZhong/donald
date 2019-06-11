package com.dao;

import com.domain.RegistUserVo;
import com.domain.User;


public interface UserMapper {
	
	public User selectUserByName(String username);
	public void updateUserById(User user);
	public User selectUserById(long userid);
	public void InserUser(RegistUserVo user);
	
}
