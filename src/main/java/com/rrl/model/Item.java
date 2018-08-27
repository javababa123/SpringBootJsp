package com.rrl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Item",schema="ransingh")
public class Item { 
	@Id
	@Column(name = "ItemKey")
	int itemKey;
	
	
	@Column(name = "ItemID")
	String itemID;
	
	@Column(name = "ItemName")	
	String itemName;
	
	@Column(name = "ItemDesc")	
	String itemDesc;
	
	@Column(name = "Createts")	
	String createts;

	@Column(name = "Modifyts")	
	String modifyts;
	public int getItemKey() {
		return itemKey;
	}

	public void setItemKey(int itemKey) {
		this.itemKey = itemKey;
	}

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public String getCreates() {
		return createts;
	}

	public void setCreates(String createts) {
		this.createts = createts;
	}

	public String getModifyts() {
		return modifyts;
	}

	public void setModify(String modifyts) {
		this.modifyts = modifyts;
	}



	@Override
	public String toString() {
		return "Item [itemKey=" + itemKey + ", itemID=" + itemID + ", itemName=" + itemName + ", itemDesc=" + itemDesc
				+ ", creates=" + createts + ", modify=" + modifyts + "]";
	}
	

}
