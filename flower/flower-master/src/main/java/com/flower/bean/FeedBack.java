package com.flower.bean;

import java.util.Date;

/**
 * Created by Equator on 2019/5/27
 **/
public class FeedBack {
    private Integer id;
    private Integer userId;
    private Date feedbackTime;
    private String content;

    public FeedBack() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getFeedbackTime() {
        return feedbackTime;
    }

    public void setFeedbackTime(Date feedbackTime) {
        this.feedbackTime = feedbackTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
