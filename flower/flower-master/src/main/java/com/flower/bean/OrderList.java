package com.flower.bean;
public class OrderList implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 3483970441212258512L;

    /** 订单项唯一标识id */
    private Integer id;

    /** 外键，订单id */
    private Integer orderId;

    /** 外键，产品id */
    private Integer productId;

    private Product product;

    /** 外键，用户id */
    private Integer userId;

    /** 购买数量 */
    private Integer number;

    /**
     * 获取订单项唯一标识id
     * 
     * @return 订单项唯一标识id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * 设置订单项唯一标识id
     * 
     * @param id
     *          订单项唯一标识id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取外键，订单id
     * 
     * @return 外键
     */
    public Integer getOrderId() {
        return this.orderId;
    }

    /**
     * 设置外键，订单id
     * 
     * @param orderId
     *          外键
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取外键，产品id
     * 
     * @return 外键
     */
    public Integer getProductId() {
        return this.productId;
    }

    /**
     * 设置外键，产品id
     * 
     * @param productId
     *          外键
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
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
     * 获取购买数量
     * 
     * @return 购买数量
     */
    public Integer getNumber() {
        return this.number;
    }

    /**
     * 设置购买数量
     * 
     * @param number
     *          购买数量
     */
    public void setNumber(Integer number) {
        this.number = number;
    }
}