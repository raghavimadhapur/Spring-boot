package com.weather.ActifyData.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class RegisterEntity {
	@Id
	private String email;
	private String name;
	private Long phoneNumber;
	private String password;
	RegisterEntity()
	{
		System.out.println("created...");
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "RegisterEntity [email=" + email + ", name=" + name + ", phoneNumber=" + phoneNumber + ", password="
				+ password + "]";
	}
	public RegisterEntity(String email, String name, Long phoneNumber, String password) {
		this.email = email;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.password = password;
	}
	
	

}
