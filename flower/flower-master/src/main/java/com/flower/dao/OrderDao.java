package com.flower.dao;

import com.flower.bean.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface OrderDao {
    List<Order> findOrderAll();

    List<Order> findOrderByCondition(Map map);

    List<Order> findOrderByIds(List list);

    Order findOrderById(@Param("orderId") Integer orderId);

    int insertOrder(Map map);

    int insertOrders(List<Order> Orders);

    int updateOrder(Map map);

    int updateOrders(List<Order> Orders);

    int deleteOrderById(int id);

    int deleteOrderByIds(List ids);
}
