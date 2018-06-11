package com.service.location.model.response.iplocation;

import com.fasterxml.jackson.annotation.JsonCreator;

public class Point {
	public String x;
	public String y;
	
	@JsonCreator
	public Point() {
	}
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}
	
	
}
