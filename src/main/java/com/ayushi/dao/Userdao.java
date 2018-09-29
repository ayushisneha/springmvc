package com.ayushi.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.ayushi.model.User;

public interface Userdao{
	@Autowired
	public void saveOrUpdate(User user);
	public void delete(String username);
	public User getUser(String username);
}