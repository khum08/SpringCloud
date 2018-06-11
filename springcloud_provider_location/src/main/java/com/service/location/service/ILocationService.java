package com.service.location.service;

import com.service.location.model.response.iplocation.IpLocationResp;

public interface ILocationService {
	
	/**
	 * 根据ip查询地址
	 * @param ip
	 * @return
	 */
	IpLocationResp getAddressByIp(String ip);
	
	/**
	 * 根据手机号查询地址
	 * @param ip
	 * @return
	 */
	String getAddressByPhone(String phone);
}

