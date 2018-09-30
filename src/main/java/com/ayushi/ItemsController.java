package com.ayushi;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ayushi.dao.Itemsdao;
import com.ayushi.model.Category;
import com.ayushi.model.Items;

@Controller
public class ItemsController {
	@Autowired
	Itemsdao itemsdao;
	@RequestMapping("buyitem/{catid}")
	public String getitems(@PathVariable(value="catid") int catid,Model model,HttpServletRequest request) 
	{
		List<Items> list=itemsdao.getitembycat(catid);
		model.addAttribute("list",list);
		return "items";
	}
	@RequestMapping(value="admin/adminbuyitem/{catid}")
	public String additems(@PathVariable(value="catid") int catid,Model model,HttpServletRequest request)
	{
		List<Items> list=itemsdao.getitembycat(catid);
		model.addAttribute("list",list);
		model.addAttribute("catid",catid);
		return "admin/adminitems";
	}
	@RequestMapping(value="admin/adminbuyitem/additems/{catid}",method=RequestMethod.GET)
	public String addcat(Model model,@PathVariable(value="catid") int catid)
	{
		Items items=new Items();
		model.addAttribute("items",items);
		model.addAttribute("catid",catid);
		return "admin/additems";
	}
	@RequestMapping(value="admin/adminbuyitem/additems/{catid}",method=RequestMethod.POST)
	public String addItem(@Valid @ModelAttribute("Items") Items items,BindingResult result,Model model,@PathVariable(value="catid") int catid) 
	{
		if(result.hasErrors())
		{
			model.addAttribute("items",items);
			return "admin/additems";
		}
		else {
			itemsdao.addItems(catid, items);
			return "redirect:/admin";
		}
	}

}
