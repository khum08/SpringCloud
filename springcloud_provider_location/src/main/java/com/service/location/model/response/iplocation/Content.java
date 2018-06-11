package com.service.location.model.response.iplocation;

import com.fasterxml.jackson.annotation.JsonCreator;

public class Content {
	public String address;
	public AddressDetail address_detail;
	public Point point;
	@JsonCreator
	public Content() {
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public AddressDetail getAddress_detail() {
		return address_detail;
	}
	public void setAddress_detail(AddressDetail address_detail) {
		this.address_detail = address_detail;
	}
	public Point getPoint() {
		return point;
	}
	public void setPoint(Point point) {
		this.point = point;
	}
	
}