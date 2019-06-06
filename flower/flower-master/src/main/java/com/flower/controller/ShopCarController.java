package com.flower.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.flower.bean.ShopCar;
import com.flower.dto.ResponseDto;
import com.flower.service.ShopCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class ShopCarController {

    @Autowired
    ShopCarService shopCarService;

    //添加购物车
    @RequestMapping(value = "/shopCar/addShopCar")
    public ResponseDto addShopCar(ShopCar shopCar){
        return shopCarService.addShopCar(shopCar);
    }

    //移除购物车
    @RequestMapping(value = "/shopCar/deleteShopCar")
    public ResponseDto deleteShopCar(ShopCar shopCar){
        return shopCarService.deleteShopCar(shopCar);
    }
    //修改购物车
    @RequestMapping(value = "/shopCar/updateShopCar")
    public ResponseDto updateShopCar(ShopCar shopCar){
        return shopCarService.updateShopCar(shopCar);
    }
    //获取所有购物车项
    @RequestMapping(value = "/shopCar")
    public ResponseDto getAll(int id){
        return shopCarService.getAllShopCar(id);
    }
}
