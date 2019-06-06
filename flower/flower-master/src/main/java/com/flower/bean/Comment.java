package com.flower.bean;
import java.util.Date;

/**
 * T_COMMENT
 * 
 * @author bianj
 * @version 1.0.0 2019-04-30
 */
public class Comment implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -5009925027113165057L;

    /** 评论唯一标识id */
    private Integer id;

    /** 外键，用户id */
    private Integer userId;

    /** 外键，产品id */
    private Integer productId;

    /** 内容 */
    private String content;

    /** 评价图片 */
    private String picture;

    /** 赞 */
    private Integer praise;

    /** 评论时间 */
    private Date startTime;

    /** 评论状态：1正常，2审核，3已删除 */
    private Integer status;

    /**
     * 获取评论唯一标识id
     * 
     * @return 评论唯一标识id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * 设置评论唯一标识id
     * 
     * @param id
     *          评论唯一标识id
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

    /**
     * 获取内容
     * 
     * @return 内容
     */
    public String getContent() {
        return this.content;
    }

    /**
     * 设置内容
     * 
     * @param content
     *          内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取评价图片
     * 
     * @return 评价图片
     */
    public String getPicture() {
        return this.picture;
    }

    /**
     * 设置评价图片
     * 
     * @param picture
     *          评价图片
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     * 获取赞
     * 
     * @return 赞
     */
    public Integer getPraise() {
        return this.praise;
    }

    /**
     * 设置赞
     * 
     * @param praise
     *          赞
     */
    public void setPraise(Integer praise) {
        this.praise = praise;
    }

    /**
     * 获取评论时间
     * 
     * @return 评论时间
     */
    public Date getStartTime() {
        return this.startTime;
    }

    /**
     * 设置评论时间
     * 
     * @param startTime
     *          评论时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取评论状态：1正常，2审核，3已删除
     * 
     * @return 评论状态：1正常
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * 设置评论状态：1正常，2审核，3已删除
     * 
     * @param status
     *          评论状态：1正常
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}