package com.rrl.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.rrl.factory.ItemRepository;
import com.rrl.factory.ShipmentRepository;
import com.rrl.model.Item;
import com.rrl.model.Shipment;

@Component
@Qualifier("ShipmentDaoImpl")
public class ShipmentDaoImpl implements ShipmentDao {

	
	@Autowired
	@Qualifier("ShipmentRepository")
	ShipmentRepository shipmentRepository;
	
	@Override
	@Transactional
	public List<Shipment> getShipmentDetails() {
		return shipmentRepository.findAll();
	}

	@Override
	@Transactional
	public List<Shipment> getShipmentByShipmentNo(String id) {
		return shipmentRepository.getShipmentByShipmentNo(id);
	}


	
}
