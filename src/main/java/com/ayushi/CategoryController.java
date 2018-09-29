package com.ayushi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ayushi.dao.Categorydao;
import com.ayushi.model.Category;

@Controller
public class CategoryController {
	@Autowired
	Categorydao categorydao;
	@RequestMapping("allcat")
	public String category(Model model)
	{
		List<Category> list=categorydao.getallcat();
		model.addAttribute("list",list);
		return "category";
	}

}
