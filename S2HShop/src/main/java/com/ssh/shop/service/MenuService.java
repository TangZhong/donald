package com.ssh.shop.service;

import com.ssh.shop.entity.Menu;

import java.util.List;

public interface MenuService extends BaseService<Menu> {
    public List<Menu> getAllMenu();
}
