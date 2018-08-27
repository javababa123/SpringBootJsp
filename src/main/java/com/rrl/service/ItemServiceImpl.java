package com.rrl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rrl.dao.ItemDao;
import com.rrl.model.Item;

@Service
@Qualifier("ItemServiceImpl")
public class ItemServiceImpl implements ItemService {

	 @Autowired
	// @Qualifier("ItemDaoImpl")   
	 ItemDao itemDao;
	
	
	ItemServiceImpl()
	{
		
		System.out.println("constructor item");
	}

	@Override
	public List<Item> getItemInfo() {
		
		return itemDao.getItemDetails();
	}
	
	
	@Override
	public  List<Item> getItemById(String id) {
		return itemDao.getItemById(id);
	}

	

	@Override
	public boolean setItemInfo(Item item) {
		
		return itemDao.setItemInfo(item);
	}

}
