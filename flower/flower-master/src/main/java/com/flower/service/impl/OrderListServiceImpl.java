package com.flower.service.impl;

import com.flower.bean.OrderList;
import com.flower.dao.OrderListDao;
import com.flower.dao.ProductDao;
import com.flower.dto.ResponseDto;
import com.flower.service.OrderListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Equator on 2019/5/27
 **/

@Service
public class OrderListServiceImpl implements OrderListService {
    @Autowired
    private OrderListDao orderListDao;
    @Autowired
    private ProductDao productDao;

    @Override
    public ResponseDto getOrderListByOrderId(Integer orderId) {
        Map map = new HashMap();
        map.put("orderId",orderId);
        List<OrderList> orderLists = orderListDao.findOrderListByCondition(map).stream().map(a->{
            Map temp = new HashMap();
            temp.put("id",a.getProductId());
            a.setProduct(productDao.findProductById(a.getProductId()));
            return a;
        }).collect(Collectors.toList());
        return null;
    }
}
