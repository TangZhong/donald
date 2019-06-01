package com.ssh.shop.dao;

import com.ssh.shop.entity.Menu;

import java.util.List;


public interface MenuDao extends BaseDao<Menu> {

    public List<Menu> getAllMenu();

}
