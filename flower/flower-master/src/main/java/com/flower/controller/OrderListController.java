package com.flower.controller;

import com.flower.dto.OrderQuery;
import com.flower.dto.ResponseDto;
import com.flower.service.impl.OrderListServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Equator on 2019/5/27
 **/
@RestController
@RequestMapping("/orderList")
public class OrderListController {
    @Autowired
    private OrderListServiceImpl orderListService;

    @RequestMapping("/getOrderListByOrderId")
    public ResponseDto getOrderListByOrderId(OrderQuery orderQuery){
        return orderListService.getOrderListByOrderId(orderQuery.getOrderId());
    }
}
