package com.rrl.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.rrl.model.Shipment;

@Component
public interface ShipmentDao {

	public List<Shipment> getShipmentDetails();
	public List<Shipment> getShipmentByShipmentNo(String id);

	
	
}
