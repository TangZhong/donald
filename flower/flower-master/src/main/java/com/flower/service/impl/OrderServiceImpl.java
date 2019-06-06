package com.flower.service.impl;

import com.flower.bean.Order;
import com.flower.bean.OrderList;
import com.flower.dao.OrderDao;
import com.flower.dao.OrderListDao;
import com.flower.dao.ProductDao;
import com.flower.dto.OrderQuery;
import com.flower.dto.ResponseDto;
import com.flower.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Equator on 2019/5/27
 **/
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;
    @Autowired
    private OrderListDao orderListDao;
    @Autowired
    private ProductDao productDao;

    @Override
    public ResponseDto getOrderByType(OrderQuery orderQuery) {
        Map map = new HashMap();
        map.put("userId",orderQuery.getUserId());
        if (orderQuery.getQueryType()==null){
        }else {
            map.put("status",orderQuery.getQueryType());
        }
        List<Order> orders = orderDao.findOrderByCondition(map);
        if (orders.size()==0){
            return new ResponseDto("201","没有数据",null);
        }else {
            return new ResponseDto("200","获取成功",orders.stream().map(o->{
                o.setOrderLists(this.getOrderListByOrderId(o.getId()));
                return o;
            }).collect(Collectors.toList()));
        }
    }

    public List<OrderList> getOrderListByOrderId(Integer orderId) {
        Map map = new HashMap();
        map.put("orderId",orderId);
        List<OrderList> orderLists = orderListDao.findOrderListByCondition(map).stream().map(a->{
            Map temp = new HashMap();
            temp.put("id",a.getProductId());
            a.setProduct(productDao.findProductById(a.getProductId()));
            return a;
        }).collect(Collectors.toList());
        return orderLists;
    }

    @Override
    public ResponseDto deleteOrderById(Integer orderId) {
        Order order = orderDao.findOrderById(orderId);
        if (order.getStatus()!=1){
            return new ResponseDto("400","该订单已不可取消",null);
        }else {
            Map map = new HashMap();
            map.put("id",orderId);
            map.put("status",0);
            if (orderDao.updateOrder(map)>0){
                return new ResponseDto("200","订单取消成功",null);
            }else {
                return new ResponseDto("500","订单取消失败",null);
            }
        }
    }

}
