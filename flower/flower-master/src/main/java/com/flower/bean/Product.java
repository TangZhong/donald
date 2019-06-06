package com.flower.bean;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Product implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -2351509732843262172L;

    /** 产品唯一标识id */
    private Integer id;

    /** 商品名称 */
    private String name;

    /** 商品类型：1鲜花，2绿植，3饰品，4永生花(假花) */
    private Integer type;

    /** json字符串数组组成的，可存储多个商品图片 */
    private String[] image;

    /** 价格——人民币 */
    private Double price;

    /** 运费 */
    private Double freight;

    /** 已销售多少件 */
    private Integer sold;

    /** 额外字段 */
    private String extra;

    /** 商品介绍 */
    private String introduce;

    /** 状态：1正在出售，2已下架 */
    private Integer status;

    /** 库存量 */
    private Integer inventory;

    /**
     * 获取产品唯一标识id
     * 
     * @return 产品唯一标识id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * 设置产品唯一标识id
     * 
     * @param id
     *          产品唯一标识id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取商品名称
     * 
     * @return 商品名称
     */
    public String getName() {
        return this.name;
    }

    /**
     * 设置商品名称
     * 
     * @param name
     *          商品名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取商品类型：1鲜花，2绿植，3饰品，4永生花(假花)
     * 
     * @return 商品类型：1鲜花
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * 设置商品类型：1鲜花，2绿植，3饰品，4永生花(假花)
     * 
     * @param type
     *          商品类型：1鲜花
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取json字符串数组组成的，可存储多个商品图片
     * 
     * @return json字符串数组组成的
     */
    public String[] getImage() {
        return this.image;
    }

    /**
     * 设置json字符串数组组成的，可存储多个商品图片
     * 
     * @param image
     *          json字符串数组组成的
     */
    public void setImage(String image) {
        String[] sp = image.split(",");
        String[] sp2 = new String[sp.length];
        for (int i = 0; i<sp.length; i++){
            sp2[i] = "http://localhost/flower"+sp[i];
        }
        this.image =sp2;

    }

    /**
     * 获取价格——人民币
     * 
     * @return 价格——人民币
     */
    public Double getPrice() {
        return this.price;
    }

    /**
     * 设置价格——人民币
     * 
     * @param price
     *          价格——人民币
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 获取运费
     * 
     * @return 运费
     */
    public Double getFreight() {
        return this.freight;
    }

    /**
     * 设置运费
     * 
     * @param freight
     *          运费
     */
    public void setFreight(Double freight) {
        this.freight = freight;
    }

    /**
     * 获取已销售多少件
     * 
     * @return 已销售多少件
     */
    public Integer getSold() {
        return this.sold;
    }

    /**
     * 设置已销售多少件
     * 
     * @param sold
     *          已销售多少件
     */
    public void setSold(Integer sold) {
        this.sold = sold;
    }

    /**
     * 获取额外字段
     * 
     * @return 额外字段
     */
    public String getExtra() {
        return this.extra;
    }

    /**
     * 设置额外字段
     * 
     * @param extra
     *          额外字段
     */
    public void setExtra(String extra) {
        this.extra = extra;
    }

    /**
     * 获取商品介绍
     * 
     * @return 商品介绍
     */
    public String getIntroduce() {
        return this.introduce;
    }

    /**
     * 设置商品介绍
     * 
     * @param introduce
     *          商品介绍
     */
    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    /**
     * 获取状态：1正在出售，2已下架
     * 
     * @return 状态：1正在出售
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * 设置状态：1正在出售，2已下架
     * 
     * @param status
     *          状态：1正在出售
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取库存量
     * 
     * @return 库存量
     */
    public Integer getInventory() {
        return this.inventory;
    }

    /**
     * 设置库存量
     * 
     * @param inventory
     *          库存量
     */
    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }
}