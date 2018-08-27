package com.rrl.factory;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rrl.model.Item;

@Qualifier("ItemRepository")
public interface ItemRepository extends JpaRepository<Item,Long> {

	 @Query("SELECT item FROM Item item WHERE item.itemID =:id")
	public  List<Item> getItemByItemID(@Param("id") String id);

}
