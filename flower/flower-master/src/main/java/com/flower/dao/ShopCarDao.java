package com.flower.dao;

import com.flower.bean.ShopCar;
import com.flower.dto.ShopCarDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface ShopCarDao {
    List<ShopCarDto> findShopCarAll();

    List<ShopCar> findShopCarByCondition(Map map);

    List<ShopCarDto> findShopCarByUserIds(List list);

    int insertShopCar(Map map);

    int insertShopCars(List<ShopCar> shopCars);

    int updateShopCar(Map map);

    int updateShopCars(List<ShopCar> shopCars);

    int deleteShopCarById(int id);

    int deleteShopCarByIds(List ids);
}
