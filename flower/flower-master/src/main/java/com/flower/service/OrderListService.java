package com.flower.service;

import com.flower.dto.ResponseDto;
import org.springframework.stereotype.Service;

public interface OrderListService {
    ResponseDto getOrderListByOrderId(Integer orderId);
}
