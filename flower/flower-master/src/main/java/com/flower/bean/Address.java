package com.flower.bean;
public class Address implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -2967265278881978790L;

    /** 地址唯一标识id */
    private Integer id;

    /** 外键，userId */
    private Integer userId;

    /** 手机号码 */
    private String phone;

    /** 姓名 */
    private String name;

    /** 是否默认地址，1默认，2非默认 */
    private Integer isDefault;

    /** 省份，如：江西 */
    private String province;

    /** 城市，如：南昌 */
    private String city;

    /** 区，如：高新开发区 */
    private String area;

    /** 详细地址 */
    private String detail;

    /**
     * 获取地址唯一标识id
     * 
     * @return 地址唯一标识id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * 设置地址唯一标识id
     * 
     * @param id
     *          地址唯一标识id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取外键，userId
     * 
     * @return 外键
     */
    public Integer getUserId() {
        return this.userId;
    }

    /**
     * 设置外键，userId
     * 
     * @param userId
     *          外键
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取手机号码
     * 
     * @return 手机号码
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * 设置手机号码
     * 
     * @param phone
     *          手机号码
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取姓名
     * 
     * @return 姓名
     */
    public String getName() {
        return this.name;
    }

    /**
     * 设置姓名
     * 
     * @param name
     *          姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取是否默认地址，1默认，2非默认
     * 
     * @return 是否默认地址
     */
    public Integer getIsDefault() {
        return this.isDefault;
    }

    /**
     * 设置是否默认地址，1默认，2非默认
     * 
     * @param isDefault
     *          是否默认地址
     */
    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * 获取省份，如：江西
     * 
     * @return 省份
     */
    public String getProvince() {
        return this.province;
    }

    /**
     * 设置省份，如：江西
     * 
     * @param province
     *          省份
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取城市，如：南昌
     * 
     * @return 城市
     */
    public String getCity() {
        return this.city;
    }

    /**
     * 设置城市，如：南昌
     * 
     * @param city
     *          城市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取区，如：高新开发区
     * 
     * @return 区，如
     */
    public String getArea() {
        return this.area;
    }

    /**
     * 设置区，如：高新开发区
     * 
     * @param area
     *          区，如
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * 获取详细地址
     * 
     * @return 详细地址
     */
    public String getDetail() {
        return this.detail;
    }

    /**
     * 设置详细地址
     * 
     * @param detail
     *          详细地址
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }
}