package com.flower.controller;

import com.flower.bean.FeedBack;
import com.flower.dto.ResponseDto;
import com.flower.service.impl.FeedBackServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Equator on 2019/5/27
 **/
@RestController
@RequestMapping("/feedback")
public class FeedBackController {
    @Autowired
    private FeedBackServiceImpl feedBackService;

    @RequestMapping("/addFeedback")
    public ResponseDto addFeedBack(@RequestBody FeedBack feedBack){
        return feedBackService.addFeedback(feedBack);
    }
}
