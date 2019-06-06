package com.flower.service.impl;

import com.flower.bean.ShopCar;
import com.flower.dao.ShopCarDao;
import com.flower.dto.ResponseDto;
import com.flower.dto.ShopCarDto;
import com.flower.service.ShopCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ShopCarServiceImpl implements ShopCarService {

    @Autowired
    ShopCarDao shopCarDao;

    @Override
    public ResponseDto addShopCar(ShopCar shopCar) {
        Map map = new HashMap();
        map.put("productId", shopCar.getProductId());
        map.put("userId",shopCar.getUserId());
        List<ShopCar> shopCarItem = shopCarDao.findShopCarByCondition(map);
        if (null != shopCarItem && shopCarItem.size()!=0){
            map.put("id",shopCarItem.get(0).getId());
            map.put("number", shopCar.getNumber()+shopCarItem.get(0).getNumber());
//            map.put("selected",shopCar.getSelected());
            shopCarDao.updateShopCar(map);
        }else {
            map.put("number", shopCar.getNumber());
            map.put("selected",shopCar.getSelected());
            shopCarDao.insertShopCar(map);
        }
        return new ResponseDto("200","");
    }

    @Override
    public ResponseDto updateShopCar(ShopCar shopCar) {
        Map map = new HashMap();
        map.put("id",shopCar.getId());
        map.put("productId", shopCar.getProductId());
        map.put("userId",shopCar.getUserId());
        map.put("number", shopCar.getNumber());
        map.put("selected",shopCar.getSelected());
        shopCarDao.updateShopCar(map);
        return new ResponseDto("200","");
    }

    @Override
    public ResponseDto getAllShopCar(int userId) {
        List list = new ArrayList();
        list.add(userId);
        List<ShopCarDto> shopCarByCondition = shopCarDao.findShopCarByUserIds(list);
        return new ResponseDto("200","", shopCarByCondition);
    }

    @Override
    public ResponseDto deleteShopCar(ShopCar shopCar) {
        shopCarDao.deleteShopCarById(shopCar.getId());
        return new ResponseDto("200","");
    }


}
