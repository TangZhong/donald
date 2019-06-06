package com.flower.bean;
import java.util.Date;
import java.util.List;

/**
 * T_ORDER
 * 
 * @author bianj
 * @version 1.0.0 2019-04-30
 */
public class Order implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 782992056292219895L;

    /** 订单唯一标识id */
    private Integer id;

    /** 外键，用户id */
    private Integer userId;

    /** 订单描述 */
    private String detail;

    /** 订单总价格 */
    private Double price;

    /** 订单状态,0已取消，1待支付，2待发货，3待收货，4待评价，5已评价 */
    private Integer status;

    /** 下单时间 */
    private Date startDate;

    /** 外键，地址id */
    private Integer addressId;

    /** 备注 */
    private String remark;

    /** 流水号 */
    private Integer orderNumber;

    private List<OrderList> orderLists;

    /**
     * 获取订单唯一标识id
     * 
     * @return 订单唯一标识id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * 设置订单唯一标识id
     * 
     * @param id
     *          订单唯一标识id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取外键，用户id
     * 
     * @return 外键
     */
    public Integer getUserId() {
        return this.userId;
    }

    /**
     * 设置外键，用户id
     * 
     * @param userId
     *          外键
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取订单描述
     * 
     * @return 订单描述
     */
    public String getDetail() {
        return this.detail;
    }

    /**
     * 设置订单描述
     * 
     * @param detail
     *          订单描述
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * 获取订单总价格
     * 
     * @return 订单总价格
     */
    public Double getPrice() {
        return this.price;
    }

    /**
     * 设置订单总价格
     * 
     * @param price
     *          订单总价格
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 获取订单状态,0已取消，1待支付，2待发货，3待收货，4待评价，5已评价
     * 
     * @return 订单状态,0已取消
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * 设置订单状态,0已取消，1待支付，2待发货，3待收货，4待评价，5已评价
     * 
     * @param status
     *          订单状态,0已取消
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取下单时间
     * 
     * @return 下单时间
     */
    public Date getStartDate() {
        return this.startDate;
    }

    /**
     * 设置下单时间
     * 
     * @param startDate
     *          下单时间
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 获取外键，地址id
     * 
     * @return 外键
     */
    public Integer getAddressId() {
        return this.addressId;
    }

    /**
     * 设置外键，地址id
     * 
     * @param addressId
     *          外键
     */
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    /**
     * 获取备注
     * 
     * @return 备注
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * 设置备注
     * 
     * @param remark
     *          备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取流水号
     * 
     * @return 流水号
     */
    public Integer getOrderNumber() {
        return this.orderNumber;
    }

    /**
     * 设置流水号
     * 
     * @param orderNumber
     *          流水号
     */
    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public List<OrderList> getOrderLists() {
        return orderLists;
    }

    public void setOrderLists(List<OrderList> orderLists) {
        this.orderLists = orderLists;
    }
}