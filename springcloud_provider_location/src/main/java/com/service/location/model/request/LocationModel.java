package com.service.location.model.request;

import com.funong.model.RequestEntity;

/**
 * @author khum
 *
 */
public class LocationModel implements RequestEntity{
	
	public String ip;
	public String phone;
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	
	
}
