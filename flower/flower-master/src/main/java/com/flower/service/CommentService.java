package com.flower.service;

import com.flower.bean.Comment;
import com.flower.dto.ResponseDto;
import org.springframework.stereotype.Service;

public interface CommentService {
    ResponseDto evaluate(Comment comment);
}
