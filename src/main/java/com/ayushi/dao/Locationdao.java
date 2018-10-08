package com.ayushi.dao;

import java.util.List;

import com.ayushi.model.Cart;
import com.ayushi.model.Location;

public interface Locationdao {
	public List<Location> getallloc();
	public List<Location> getlocbydate(String bdate);
public void book(int lid,String uid,  Cart cart,String bdate);
}
