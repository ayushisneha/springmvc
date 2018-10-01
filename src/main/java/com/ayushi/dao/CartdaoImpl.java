package com.ayushi.dao;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ayushi.dao.Cartdao;
import com.ayushi.model.Cart;
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
	

}
