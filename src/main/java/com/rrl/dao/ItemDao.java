package com.rrl.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.rrl.model.Item;

@Component
public interface ItemDao {

	public List<Item> getItemDetails();
	public boolean updateItemInfo();
	public  List<Item> getItemById(String id);
	public boolean setItemInfo(Item item);
	
}
