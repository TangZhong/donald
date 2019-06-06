package com.flower.service;

import com.flower.dto.ResponseDto;
import org.springframework.stereotype.Service;

public interface ProductService {
   ResponseDto searchByWord(String word);

   ResponseDto searchByType(String type);

   ResponseDto findOne(int id);
}
