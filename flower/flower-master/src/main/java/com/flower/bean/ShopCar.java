package com.flower.bean;
public class ShopCar implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 3039602794064943001L;

    /** 购物车项唯一标识id */
    private Integer id;

    /** 外键，商品id */
    private Integer productId;

    /** 外键，用户id */
    private Integer userId;

    /** 购买数量 */
    private Integer number;

    /** 是否被选中，0未选中，1选中 */
    private Integer selected;

    /**
     * 获取购物车项唯一标识id
     * 
     * @return 购物车项唯一标识id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * 设置购物车项唯一标识id
     * 
     * @param id
     *          购物车项唯一标识id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取外键，商品id
     * 
     * @return 外键
     */
    public Integer getProductId() {
        return this.productId;
    }

    /**
     * 设置外键，商品id
     * 
     * @param productId
     *          外键
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
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

    /**
     * 获取是否被选中，0未选中，1选中
     * 
     * @return 是否被选中
     */
    public Integer getSelected() {
        return this.selected;
    }

    /**
     * 设置是否被选中，0未选中，1选中
     * 
     * @param selected
     *          是否被选中
     */
    public void setSelected(Integer selected) {
        this.selected = selected;
    }
}