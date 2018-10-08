package com.ayushi.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.ayushi.dao.Cartdao;
import com.ayushi.model.Cart;
import com.ayushi.model.Category;
import com.ayushi.model.Items;
import com.ayushi.model.User;
public class CartdaoImpl implements Cartdao{
	@Autowired
	DataSource datasource;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void addtocart(int iid,String uid, Cart cart) {
		// TODO Auto-generated method stub
		String s="select * from cart where uid='"+uid+"'and iid='"+iid+"'";
		if(jdbcTemplate.query(s, new ResultSetExtractor<Cart>() {
			public Cart extractData(ResultSet rs) throws SQLException
			{
				if(rs.next())
				{
					Cart cart=new Cart();
					return cart;
				}
				return null;
			}
		})==null)
		{
			String sql="insert into cart set uid=?,iid=?";
			Object object[]= {uid,iid};
			jdbcTemplate.update(sql,object);
		}
	}
	public List<Cart> getcart(String uid) {
		// TODO Auto-generated method stub
		List<Cart> list;
//		String sql2="select * from items,cart where items.iid=cart.iid and cart.uid='"+uid+"'";
		String sql="select items.iid,cart.quantity,cart.tprice,items.name,items.price from items inner join cart on items.iid=cart.iid where cart.uid='"+uid+"'";
		list=(List<Cart>) jdbcTemplate.query(sql, new BeanPropertyRowMapper<Cart>(Cart.class));
		return list;
	}
	public void addquantity(int quantity,int iid,String uid,Cart cart) {
		// TODO Auto-generated method stub
		String p = "select price from items where iid="+iid;
		//float p= Float.parseFloat(s);
		float price=jdbcTemplate.query(p, new ResultSetExtractor<Items>() {
			public Items extractData(ResultSet rs) throws SQLException
			{
				if(rs.next())
				{
					Items it=new Items();
					it.setPrice(rs.getFloat("price"));
					return it;
				}
				return null;
			}
		}).getPrice();
		price=price*quantity;
		String sql="update cart set quantity="+quantity+",tprice="+price+"where iid="+iid+" and uid='"+uid+"'";
		jdbcTemplate.execute(sql);
	}
	public void deleteItem(int itemId) {
		// TODO Auto-generated method stub
		String sql="delete from cart where iid="+itemId;
		jdbcTemplate.update(sql);
	}
	public float gettotal(String uid) {
		// TODO Auto-generated method stub
		String sql="select sum(tprice) from cart where uid='"+uid+"'";
		Cart total=jdbcTemplate.query(sql, new ResultSetExtractor<Cart>() {
			public Cart extractData(ResultSet rs) throws SQLException
			{
				if(rs.next())
				{
					Cart cart=new Cart();
					cart.setTprice(rs.getFloat("sum(tprice)"));
					return cart;
				}
				return null;
		}});
		if(total!=null)
			return total.getTprice();
		
		return 0;
	}
	

}
