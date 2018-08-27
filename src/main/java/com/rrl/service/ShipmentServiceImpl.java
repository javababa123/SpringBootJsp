package com.rrl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rrl.dao.ItemDao;
import com.rrl.dao.ShipmentDao;
import com.rrl.model.Item;
import com.rrl.model.Shipment;

@Service
@Qualifier("ShipmentServiceImpl")
public class ShipmentServiceImpl implements ShipmentService {

	 @Autowired
	//  @Qualifier("ShipmentDaoImpl")   
	 ShipmentDao shipmentDao;
	
	
	ShipmentServiceImpl()
	{
		
		System.out.println("constructor item");
	}

	@Override
	public List<Shipment> getShipmentInfo() {
		
		return shipmentDao.getShipmentDetails();
	}

	@Override
	public List<Shipment> getShipmentByShipmentNo(String id) {
		// TODO Auto-generated method stub
		return shipmentDao.getShipmentByShipmentNo(id);
	}
	
}
