package com.weather.ActifyData.entity;

public class Output {

	private float temperature;
	private float windSpeed;
	private float humidity;
	private String country;
	private String cityName;

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(float windSpeed) {
		this.windSpeed = windSpeed;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Output() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Output [temperature=" + temperature + ", windSpeed=" + windSpeed + ", humidity=" + humidity
				+ ", country=" + country + ", cityName=" + cityName + "]";
	}

	public Output(float temperature, int windSpeed, float humidity, String country, String cityName) {
		this.temperature = temperature;
		this.windSpeed = windSpeed;
		this.humidity = humidity;
		this.country = country;
		this.cityName = cityName;
	}

}
