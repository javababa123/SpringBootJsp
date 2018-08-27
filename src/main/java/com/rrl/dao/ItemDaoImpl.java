package com.rrl.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.rrl.factory.ItemRepository;
import com.rrl.model.Item;

@Component
@Qualifier("ItemDaoImpl")
public class ItemDaoImpl implements ItemDao {

	
	@Autowired
	@Qualifier("ItemRepository")
	ItemRepository itemRepository;
	
	@Override
	@Transactional
	public List<Item> getItemDetails() {
		return itemRepository.findAll();
	}


	@Override
	@Transactional
	public  List<Item> getItemById(String id){	
		System.out.println("Custom Query");
		return itemRepository.getItemByItemID(id);		
	}
	
	@Override
	public boolean updateItemInfo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean setItemInfo(Item item) {
		// TODO Auto-generated method stub
		try{
		  itemRepository.save(item);	
		}catch(Exception e)
		{
			
			e.printStackTrace();
			
			return false;
		}
		  return true;
	}
}
