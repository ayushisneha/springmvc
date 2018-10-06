package com.ayushi.dao;

import java.util.List;
import com.ayushi.model.Items;

public interface Itemsdao {
	public List<Items> getitembycat(int catid);
	public void addItems(int catid,Items items);
	public List<Items> admingetitembycat(int catid);
	public void deleteItem(int itemId);
	

}
