package com.serviceimpl;

import java.util.List;

import com.dao.FeedBackMapper;
import com.domain.FeedBack;
import org.springframework.beans.factory.annotation.Autowired;

import com.service.FeedBackService;

public class FeedBackServiceImpl implements FeedBackService{
		@Autowired
		private FeedBackMapper feedBackMapper;
		public List<FeedBack> SelectLeaveMessage()
		{
			return feedBackMapper.SelectLeaveMessage();
			
		}
		@Override
		public void saveFeedBack(FeedBack feedback) {
			 feedBackMapper.saveFeedBack(feedback);
			
		}
}
