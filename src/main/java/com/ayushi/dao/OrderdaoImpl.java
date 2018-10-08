package com.ayushi.dao;

import com.ayushi.model.Order;

public class OrderdaoImpl implements Orderdao{

	public void placeOrder(Order order) {
		String sql="insert into orders set uid=?,iid=?,quantity=?,price=?";
		Object[] object= {order.getuid(),order.getIid(),order.getOrderId(),order.get};
		
	}

}
