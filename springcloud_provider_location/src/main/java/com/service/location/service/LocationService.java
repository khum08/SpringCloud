package com.service.location.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.funong.global.UrlStatic;
import com.funong.utils.EncodeUtil;
import com.service.location.model.response.iplocation.IpLocationResp;

@Service
public class LocationService implements ILocationService{

	@Autowired
	private RestTemplate restTemplate;
	
	//http://api.map.baidu.com/location/ip?ip=xx.xx.xx.xx&ak=您的AK&coor=bd09ll
	@Override
	public IpLocationResp getAddressByIp(String ip) {
		//todo 使用redis做緩存
		StringBuilder sb = new StringBuilder();
		sb.append(UrlStatic.BAIDU_URL)
			.append(ip)
			.append(UrlStatic.BAIDU_IP_SEARCH);
		IpLocationResp address = restTemplate.getForObject(sb.toString(), IpLocationResp.class);
		return address;
	}

	// http://tcc.taobao.com/cc/json/mobile_tel_segment.htm?tel=15850781443
	@Override
	public String getAddressByPhone(String phone) {
		String url = UrlStatic.TAOBAO_PHONE_SEARCH+phone;
		String result = restTemplate.getForObject(url, String.class);
		return EncodeUtil.gb2312ToUtf8(result);
	}

}
