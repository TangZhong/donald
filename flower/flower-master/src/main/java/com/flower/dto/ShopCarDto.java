package com.flower.dto;

import com.flower.bean.ShopCar;

public class ShopCarDto extends ShopCar {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String[] getImage() {
        return image;
    }

    public void setImage(String image) {
        String[] sp = image.split(",");
        String[] sp2 = new String[sp.length];
        for (int i = 0; i<sp.length; i++){
            sp2[i] = "http://localhost"+sp[i];
        }
        this.image =sp2;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getFreight() {
        return freight;
    }

    public void setFreight(Double freight) {
        this.freight = freight;
    }

    public Integer getSold() {
        return sold;
    }

    public void setSold(Integer sold) {
        this.sold = sold;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }
}
