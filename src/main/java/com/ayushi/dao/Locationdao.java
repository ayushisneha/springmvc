package com.ayushi.dao;

import java.util.List;

import com.ayushi.model.BLocation;
import com.ayushi.model.Cart;
import com.ayushi.model.Event;
import com.ayushi.model.GetOrder;
import com.ayushi.model.Location;
import com.ayushi.model.Order;

public interface Locationdao {
	public List<Location> getallloc();
	public List<Location> getlocbydate(String bdate);
	public void book(int lid,String uid,  Cart cart,String bdate);
	public List<Event> addevent();
	public void booklocation(String uid,int lid,String bdate,String event);
	public List<BLocation> getlocbyuser(String uid);
	public void placeorder(String uid,int bid);
	public void placeitem(int iid,int quantity,float tprice,int bid);
	public List<Order> getorder(String uid);
	public List<GetOrder> getorder2(int bid,int cid);
	public List<Order> getadminorder();
	public List<Location> getadminlocation();
}
