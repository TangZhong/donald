package com.controller;

import com.domain.Goods;
import com.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/manage/book")
public class ManageBookController {

	@Autowired
	private GoodsService goodsService;

	@RequestMapping(value="/list")
	public String list(Model model,HttpSession Session)
	{
		List<Goods> goodsList = goodsService.selectAll();
		model.addAttribute("goodsList",goodsList);
		return "manage/booklist";
	}

	@RequestMapping(value="/add")
	public String add(Model model, @ModelAttribute Goods goods)
	{
		goodsService.addBook(goods);
		return "manage/booklist";
	}

	@RequestMapping(value="/edit")
	public String edit(Model model,@ModelAttribute Goods goods)
	{
		goodsService.editBook(goods);
		return "manage/booklist";
	}

	@RequestMapping(value="/delete")
	public String delete(Model model,int bookId)
	{
		goodsService.deleteBook(bookId);
		return "manage/booklist";
	}
}
