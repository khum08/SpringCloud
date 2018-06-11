package com.service.location.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.funong.model.Response;
import com.funong.utils.ResponseFormatUtil;
import com.service.location.model.request.LocationModel;
import com.service.location.model.response.iplocation.IpLocationResp;
import com.service.location.service.ILocationService;

@RestController()
public class LocationController {

	@Autowired
	ILocationService service;
	
	@PostMapping("/ip")
	public Response whereIpis(HttpEntity<LocationModel> request) {
		LocationModel body = request.getBody();
		IpLocationResp address = service.getAddressByIp(body.getIp());
		return ResponseFormatUtil.success(address);
	}
	
	@PostMapping("/phone")
	public Response wherePhoneIs(HttpEntity<LocationModel> request){
		LocationModel body = request.getBody();
		String phone = service.getAddressByPhone(body.getPhone());
		return ResponseFormatUtil.success(phone);
	}
	
	@Value("${test.data}")
	private String test;
	
	@GetMapping("/test")
	public Response test(){
		return ResponseFormatUtil.success();
	}
}
