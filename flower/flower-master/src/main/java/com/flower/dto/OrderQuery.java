package com.flower.dto;

/**
 * Created by Equator on 2019/5/27
 **/
public class OrderQuery {
    /** 外键，用户id */
    private Integer userId;

    /** 订单状态,0已取消，1待支付，2待发货，3待收货，4待评价，5已评价，null 查询全部*/
    private Integer queryType;

    private Integer orderId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getQueryType() {
        return queryType;
    }

    public void setQueryType(Integer queryType) {
        this.queryType = queryType;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}
