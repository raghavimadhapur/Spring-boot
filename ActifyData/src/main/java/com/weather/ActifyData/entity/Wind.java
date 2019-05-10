package com.weather.ActifyData.entity;

public class Wind {
	private float speed;
	private float deg;

	public Wind() {
		// TODO Auto-generated constructor stub
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Wind [speed=" + speed + ", deg=" + deg + "]";
	}

	public float getDeg() {
		return deg;
	}

	public void setDeg(float deg) {
		this.deg = deg;
	}

}
