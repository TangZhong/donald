package com.ssh.shop.service.impl;

import com.ssh.shop.entity.Goods;
import com.ssh.shop.service.GoodsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("goodsService")
public class GoodsServiceImpl extends BaseServiceImpl<Goods> implements GoodsService {

    @Override
    public List<Goods> queryToGoods(String name, int page, int size) {
        return goodsDao.queryToGoods(name, page, size);
    }

    @Override
    public Goods queryToGoods(int id) {
        return goodsDao.queryToGoods(id);
    }

    @Override
    public void updateGoods(int id, String name, String samary, Double price, String type) {
        goodsDao.updateGoods(id, name, samary, price, type);
    }

    @Override
    public Long getCount(String name) {
        return goodsDao.getCount(name);
    }
}
