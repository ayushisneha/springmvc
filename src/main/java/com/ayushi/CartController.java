package com.ayushi;


import com.ayushi.dao.Categorydao;
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

import com.ayushi.dao.Cartdao;
import com.ayushi.model.Items;
import com.ayushi.model.Cart;
import com.ayushi.model.Category;
@Controller
public class CartController {
	@Autowired
	Cartdao cartdao;
	@Autowired
	Categorydao categorydao;
	@RequestMapping(value="buyitem/addtocart/{iid}",method=RequestMethod.GET)
	public String addtocart(Model model,@PathVariable(value="iid") int iid,HttpServletRequest request) 
	{
		String uid=request.getUserPrincipal().getName();
		Cart cart=new Cart();
		cartdao.addtocart(iid, uid, cart);
		return "redirect:/allcat";
	}
	@RequestMapping(value="buyitem/cart")
	public String showcart(Model model,HttpServletRequest request)
	{
		String uid=request.getUserPrincipal().getName();
		List<Cart> list=cartdao.getcart(uid);
		Float total=cartdao.gettotal(uid);
		model.addAttribute("list", list);
		model.addAttribute("total",total);
		return "cart";
	}
	@RequestMapping(value="buyitem/update/{iid}")
	public String addquant(Model model,@PathVariable(value="iid") int iid,HttpServletRequest request)
	{
		String uid=request.getUserPrincipal().getName();
		Cart cart = new Cart();
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		cartdao.addquantity(quantity, iid, uid,cart);
		return "redirect:/buyitem/cart";
	}
	@RequestMapping("buyitem/deleteitems/{itemId}")
	public String deleteItem(@PathVariable(value="itemId") int itemId)
	{
		cartdao.deleteItem(itemId);
		return "redirect:/buyitem/cart";
	}

}
