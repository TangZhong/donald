package com.dao;

import java.util.List;

import com.domain.FeedBack;

public interface FeedBackMapper {

	List<FeedBack> SelectLeaveMessage();

	void saveFeedBack(FeedBack feedback);

}
