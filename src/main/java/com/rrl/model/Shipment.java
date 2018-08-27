package com.rrl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RFS_SHIPMENT",schema="ransingh")
public class Shipment { 
	
	@Id	
	@Column(name = "ShipmentKey")
	String shipmentKey;
	
	@Column(name = "ShipmentNo")
	String shipmentNo;
	
	@Column(name = "TenantId")
	String tenantId;
	
	
	@Column(name = "DcCode")
	String dcCode;
	
	@Column(name = "ShipmentType")
	String shipmentType;
	
	
	@Column(name = "Scac")
	String scac;
	
	
	@Column(name = "OrderNo")
	String orderNo;
	
	
	@Column(name = "AwbNo")
	String awbNo;
	
	@Column(name = "ContainerScm")
	String containerScm;
	
	@Column(name = "ContainerType")
	String containerType;
	
	@Column(name = "ManifestNo")
	String manifestNo;
	
	
	@Column(name = "Status")
	String status;
	
	@Column(name = "TotalAmount")
	double totalAmount;
	
	@Column(name = "PaymentType")
	String paymentType;
		
	
	@Column(name = "EwaybillNo")
	int ewaybillNo;
	
	@Column(name = "AddressLine1")
	String addressLine1No;
	
	@Column(name = "AddressLine2")
	String addressLine2;
	
	@Column(name = "AddressLine3")
	String addressLine3;
	
	@Column(name = "AddressLine4")
	String addressLine4;
	
	@Column(name = "City")
	String city;
	
	@Column(name = "State")
	String state;
	
	@Column(name = "ZipCode")
	String zipCode;
	
	@Column(name = "Country")
	String country;
	
	@Column(name = "CreatedAt")
	String reatedAt;
	
	@Column(name = "CreatedBy")
	String createdBy;

	@Column(name = "ModifiedAt")
	String modifiedAt;

	@Column(name = "ModifiedBy")
	String modifiedBy;

	public String getShipmentKey() {
		return shipmentKey;
	}

	public void setShipmentKey(String shipmentKey) {
		this.shipmentKey = shipmentKey;
	}

	public String getShipmentNo() {
		return shipmentNo;
	}

	public void setShipmentNo(String shipmentNo) {
		this.shipmentNo = shipmentNo;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getDcCode() {
		return dcCode;
	}

	public void setDcCode(String dcCode) {
		this.dcCode = dcCode;
	}

	public String getShipmentType() {
		return shipmentType;
	}

	public void setShipmentType(String shipmentType) {
		this.shipmentType = shipmentType;
	}

	public String getScac() {
		return scac;
	}

	public void setScac(String scac) {
		this.scac = scac;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getAwbNo() {
		return awbNo;
	}

	public void setAwbNo(String awbNo) {
		this.awbNo = awbNo;
	}

	public String getContainerScm() {
		return containerScm;
	}

	public void setContainerScm(String containerScm) {
		this.containerScm = containerScm;
	}

	public String getContainerType() {
		return containerType;
	}

	public void setContainerType(String containerType) {
		this.containerType = containerType;
	}

	public String getManifestNo() {
		return manifestNo;
	}

	public void setManifestNo(String manifestNo) {
		this.manifestNo = manifestNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public int getEwaybillNo() {
		return ewaybillNo;
	}

	public void setEwaybillNo(int ewaybillNo) {
		this.ewaybillNo = ewaybillNo;
	}

	public String getAddressLine1No() {
		return addressLine1No;
	}

	public void setAddressLine1No(String addressLine1No) {
		this.addressLine1No = addressLine1No;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getAddressLine4() {
		return addressLine4;
	}

	public void setAddressLine4(String addressLine4) {
		this.addressLine4 = addressLine4;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getReatedAt() {
		return reatedAt;
	}

	public void setReatedAt(String reatedAt) {
		this.reatedAt = reatedAt;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(String modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@Override
	public String toString() {
		return "Shipment [shipmentKey=" + shipmentKey + ", shipmentNo=" + shipmentNo + ", tenantId=" + tenantId
				+ ", dcCode=" + dcCode + ", shipmentType=" + shipmentType + ", scac=" + scac + ", orderNo=" + orderNo
				+ ", awbNo=" + awbNo + ", containerScm=" + containerScm + ", containerType=" + containerType
				+ ", manifestNo=" + manifestNo + ", status=" + status + ", totalAmount=" + totalAmount
				+ ", paymentType=" + paymentType + ", ewaybillNo=" + ewaybillNo + ", addressLine1No=" + addressLine1No
				+ ", addressLine2=" + addressLine2 + ", addressLine3=" + addressLine3 + ", addressLine4=" + addressLine4
				+ ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + ", country=" + country
				+ ", reatedAt=" + reatedAt + ", createdBy=" + createdBy + ", modifiedAt=" + modifiedAt + ", modifiedBy="
				+ modifiedBy + "]";
	}

}
