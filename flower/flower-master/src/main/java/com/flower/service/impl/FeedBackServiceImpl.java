package com.flower.service.impl;

import com.flower.bean.FeedBack;
import com.flower.dao.FeedBackDao;
import com.flower.dto.ResponseDto;
import com.flower.service.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Equator on 2019/5/27
 **/

@Service
public class FeedBackServiceImpl implements FeedBackService {
    @Autowired
    private FeedBackDao feedBackDao;

    @Override
    public ResponseDto addFeedback(FeedBack feedBack) {
        feedBack.setFeedbackTime(new Date());
        if (feedBackDao.insert(feedBack)>0){
            return new ResponseDto("200","反馈提交成功",null);
        }else {
            return new ResponseDto("500","反馈失败",null);
        }
    }
}
