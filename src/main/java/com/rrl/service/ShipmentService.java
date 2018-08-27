package com.rrl.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rrl.model.Item;
import com.rrl.model.Shipment;

@Service
public interface ShipmentService {
	public List<Shipment> getShipmentInfo();
	public List<Shipment> getShipmentByShipmentNo(String id);

}
