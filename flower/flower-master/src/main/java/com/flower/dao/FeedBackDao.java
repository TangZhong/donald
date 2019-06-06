package com.flower.dao;

import com.flower.bean.FeedBack;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Equator on 2019/5/27
 **/
public interface FeedBackDao {
    int insert(FeedBack feedBack);
}
