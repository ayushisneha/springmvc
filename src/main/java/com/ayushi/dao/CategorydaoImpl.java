package com.ayushi.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ayushi.model.Category;

public class CategorydaoImpl implements Categorydao {
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
	public List<Category> getallcat() {
		// TODO Auto-generated method stub
		List<Category> list;
		String sql="select * from category";
		list=(List<Category>) jdbcTemplate.query(sql, new BeanPropertyRowMapper<Category>(Category.class));
		return list;
	}
	

}
