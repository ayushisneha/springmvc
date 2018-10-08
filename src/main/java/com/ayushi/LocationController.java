package com.ayushi;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.ayushi.dao.Locationdao;
import com.ayushi.model.Cart;
import com.ayushi.model.Location;

@Controller
public class LocationController {
	@Autowired
	Locationdao locationdao;
	@RequestMapping("location")
	public String location(Model model)
	{
		List<Location> list=locationdao.getallloc();
		model.addAttribute("list",list);
		return "location";
	}
	@RequestMapping("getlocation")
	public String locationt(Model model,HttpServletRequest request)
	{
		Calendar cal=Calendar.getInstance();
		model.addAttribute("date",LocalDate.now());
		System.out.println(LocalDate.now());
		List<Location> list=locationdao.getlocbydate(request.getParameter("bdate"));
		model.addAttribute("list",list);
		return "locmodfy";
	}
	@RequestMapping(value="book/{lid}",method=RequestMethod.GET)
	public String addtocart(Model model,@PathVariable(value="lid") int lid,HttpServletRequest request) 
	{
		String uid=request.getUserPrincipal().getName();
		Cart cart=new Cart();
		locationdao.book(lid, uid, cart,request.getParameter("bdate"));
		return "redirect:/allcat";
	}
	@RequestMapping(value="upload",method=RequestMethod.POST)
	public String upload(Model model,@RequestParam CommonsMultipartFile file)
	{
		byte[] barr=file.getBytes();
		return "";
	}
	@RequestMapping("uploadform")
	public String upload()
	{
		return "upload";
	}
	
}
