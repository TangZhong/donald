package com.flower.service;

import com.flower.bean.ShopCar;
import com.flower.dto.ResponseDto;
import org.springframework.stereotype.Service;

public interface ShopCarService {
    ResponseDto addShopCar(ShopCar shopCar);

    ResponseDto updateShopCar(ShopCar shopCar);

    ResponseDto getAllShopCar(int userId);

    ResponseDto deleteShopCar(ShopCar shopCar);
}
