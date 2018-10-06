package com.ayushi.dao;

import java.util.List;

import com.ayushi.model.Cart;

public interface Cartdao {
	public void addtocart(int iid,String uid,Cart cart);
	public List<Cart> getcart(String uid);
	public void addquantity(int quantity,int iid,String uid,Cart cart);

}
