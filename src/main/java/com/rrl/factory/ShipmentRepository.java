package com.rrl.factory;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rrl.model.Item;
import com.rrl.model.Shipment;

@Qualifier("ShipmentRepository")
public interface ShipmentRepository extends JpaRepository<Shipment,Long> {

	// @Query("SELECT shipment FROM RFS_SHIPMENT shipment WHERE shipment.ShipmentNo =:id")
		public  List<Shipment> getShipmentByShipmentNo(@Param("id") String id);

		public  List<Shipment> findFirst1OrderByShipmentNo(@Param("id") String id);

}