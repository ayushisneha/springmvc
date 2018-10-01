package com.ayushi;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ayushi.dao.Categorydao;
import com.ayushi.model.Category;
import com.ayushi.model.Item;
import com.ayushi.model.Location;

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
	@RequestMapping("location")
	public String location(Model model)
	{
		List<Location> list=categorydao.getallloc();
		model.addAttribute("list",list);
		return "location";
	}
	@RequestMapping("admin/allcat")
	public String categoryadmin(Model model)
	{
		List<Category> list=categorydao.getallcat();
		model.addAttribute("list",list);
		return "admin/admincategory";
	}
	@RequestMapping(value="admin/addcat",method=RequestMethod.GET)
	public String addcat(Model model)
	{
		Category category=new Category();
		model.addAttribute("category",category);
		return "admin/addcategory";
	}
	@RequestMapping(value="admin/addcat",method=RequestMethod.POST)
	public String addItem(@Valid @ModelAttribute("Category") Category category,BindingResult result,Model model) 
	{
		if(result.hasErrors())
		{
			model.addAttribute("category",category);
			return "admin/addcategory";
		}
		else {
			categorydao.addCat(category);
			return "redirect:/admin";
		}
	}

}
