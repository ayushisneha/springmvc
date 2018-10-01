package com.ayushi;

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
@Controller
public class CartController {
	@Autowired
	Cartdao cartdao;
	@RequestMapping(value="buyitem/addtocart/{iid}",method=RequestMethod.GET)
	public String addtocart(Model model,@PathVariable(value="iid") int iid,HttpServletRequest request) 
	{
		String uid=request.getUserPrincipal().getName();
		Cart cart=new Cart();
		cartdao.addtocart(iid, uid, cart);
		return "cart";
	}
	

}
