package com.flower.service;

import com.flower.bean.FeedBack;
import com.flower.dto.ResponseDto;

/**
 * Created by Equator on 2019/5/27
 **/
public interface FeedBackService {
    ResponseDto addFeedback(FeedBack feedBack);
}
