package com.service.location.model.response.iplocation;

import com.fasterxml.jackson.annotation.JsonCreator;

public class IpLocationResp {
	
	public String address;
	public int status;
	public Content content;
	
	@JsonCreator
	public IpLocationResp(){}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
	}


}
