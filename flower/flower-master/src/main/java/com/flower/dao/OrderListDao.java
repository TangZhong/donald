package com.flower.dao;

import com.flower.bean.OrderList;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface OrderListDao {
    List<OrderList> findOrderListAll();

    List<OrderList> findOrderListByCondition(Map map);

    List<OrderList> findOrderListByIds(List list);

    int insertOrderList(Map map);

    int insertOrderLists(List<OrderList> OrderLists);

    int updateOrderList(Map map);

    int updateOrderLists(List<OrderList> OrderLists);

    int deleteOrderListById(int id);

    int deleteOrderListByIds(List ids);
}
