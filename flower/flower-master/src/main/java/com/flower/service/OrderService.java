package com.flower.service;

import com.flower.bean.Comment;
import com.flower.dto.OrderQuery;
import com.flower.dto.ResponseDto;
import org.springframework.stereotype.Service;

public interface OrderService {
    ResponseDto getOrderByType(OrderQuery orderQuery);
    ResponseDto deleteOrderById(Integer orderId);
}
