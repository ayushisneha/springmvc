package com.ayushi.dao;

import java.util.List;

import com.ayushi.model.Category;
import com.ayushi.model.Location;
import com.ayushi.model.User;

public interface Categorydao {
	public List<Category> getallcat();
	public void addCat(Category category);
	public List<User> getallusers();

}
