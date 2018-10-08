package com.ayushi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.ayushi.model.Cart;
import com.ayushi.model.Event;
import com.ayushi.model.Location;

public class LocationdaoImpl implements Locationdao {
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

	public List<Location> getallloc() {
		// TODO Auto-generated method stub
		List<Location> list;
		String sql="select * from location order by lname";
		list=(List<Location>) jdbcTemplate.query(sql, new BeanPropertyRowMapper<Location>(Location.class));
		return list;
	}
	public List<Location> getlocbydate(String bdate) {
		// TODO Auto-generated method stub
		List<Location> list;
		String sql="select * from location where lid not in (select lid from booked_location where bdate='"+bdate+"')";
		list=(List<Location>) jdbcTemplate.query(sql, new BeanPropertyRowMapper<Location>(Location.class));
		return list;
	}
	public void book(int lid, String uid, Cart cart, String bdate) {
		String s="select * from cart where uid='"+uid+"'and lid='"+lid+"'";
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
			String sql="insert into cart set uid=?,lid=?";
			Object object[]= {uid,lid};
			jdbcTemplate.update(sql,object);
		}
		
	}
	public List<Event> addevent() {
		// TODO Auto-generated method stub
		List<Event> list;
		String sql="select * from events";
		list=(List<Event>) jdbcTemplate.query(sql, new BeanPropertyRowMapper<Event>(Event.class));
		return list;
	}
	public void booklocation(String uid, int lid, String bdate, String event) {
		// TODO Auto-generated method stub
		String sql="insert into booked_location set uid=?,lid=?,bdate=?,event=?";
		Object object[]= {uid,lid,bdate,event};
		jdbcTemplate.update(sql,object);
	}

}
