package com.service;

import java.util.List;

import com.domain.FeedBack;

public interface FeedBackService {
	public List<FeedBack> SelectLeaveMessage();

	public void saveFeedBack(FeedBack feedback);
}
