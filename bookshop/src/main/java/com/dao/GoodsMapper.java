package com.dao;

import java.util.List;

import com.domain.Goods;


public interface GoodsMapper {

	Goods selectGoodsByID(String id);
	int selectCountGoods();
	List<Goods> selectNewGoods();
	List<Goods> selectPromotionGoods();
	List<Goods> selectSpecialGoods();
	List<Goods> selectGoodsByPageNumber(int pageNumber);
	List<Goods> selectAll();
	void addBook(Goods goods);
	void editBook(Goods goods);
	void deleteBook(int id);
}
