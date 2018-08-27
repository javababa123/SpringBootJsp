package com.rrl.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rrl.model.Item;

@Service
public interface ItemService {
	public List<Item> getItemInfo();
	public boolean setItemInfo(Item item);
	public  List<Item> getItemById(String id);
	
	
}
