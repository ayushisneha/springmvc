package com.ayushi.dao;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ayushi.dao.Cartdao;
import com.ayushi.model.Cart;
import com.ayushi.model.Category;
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
		String sql="insert into cart set uid=?,iid=?";
		Object object[]= {uid,iid};
		jdbcTemplate.update(sql,object);
		
	}
	public List<Cart> getcart(String uid) {
		// TODO Auto-generated method stub
		List<Cart> list;
		String sql="select * from cart where uid= uid";
		list=(List<Cart>) jdbcTemplate.query(sql, new BeanPropertyRowMapper<Cart>(Cart.class));
		return list;
	}
	

}
