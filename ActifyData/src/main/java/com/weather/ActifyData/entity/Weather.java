package com.weather.ActifyData.entity;

public class Weather {

	private Main main;
	private String name;
	private Sys sys;
	private Wind wind;
	
	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public Sys getSys() {
		return sys;
	}

	public void setSys(Sys sys) {
		this.sys = sys;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Weather() {
		// TODO Auto-generated constructor stub
	}

	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	@Override
	public String toString() {
		return "Weather [main=" + main + ", name=" + name + ", sys=" + sys + ", wind=" + wind + "]";
	}


	
}
