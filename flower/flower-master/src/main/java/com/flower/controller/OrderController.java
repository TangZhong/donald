package com.flower.controller;

import com.flower.dto.OrderQuery;
import com.flower.dto.ResponseDto;
import com.flower.service.impl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderServiceImpl orderService;

    //查询订单
    @RequestMapping("/getOrderByType")
    public ResponseDto getOrderByType(@RequestBody OrderQuery orderQuery){
        return orderService.getOrderByType(orderQuery);
    }

    @RequestMapping("/deleteOrder")
    public ResponseDto deleteOrder(@RequestBody OrderQuery orderQuery){
        return orderService.deleteOrderById(orderQuery.getOrderId());
    }
}
