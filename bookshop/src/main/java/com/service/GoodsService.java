package com.service;

import java.util.List;

import com.domain.Goods;


public interface GoodsService {
	public List<Goods> selectRandomGoods();
	public List<Goods> selectNewGoods();
	public List<Goods> selectPromotionGoods();
	public List<Goods> selectSpecialGoods();
	public Goods selectGoodsById(String id);
	public List<Goods> selectGoodsByPageNumber(int pageNumber);
	public int seletCountGoods();
	List<Goods> selectAll();
	void addBook(Goods goods);
	void editBook(Goods goods);
	void deleteBook(int id);
}
