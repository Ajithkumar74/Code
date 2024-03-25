package com.hibernate.OnetooneRelationship.beans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="employeeaddress")
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int addressId;
	@Column(length=20)
	private String addressLine1,city,state,country;
	@Column
	private int pincode;

	@OneToOne(targetEntity=EmployeeDetails.class)
	private EmployeeDetails employee;
	
	public void setAddressId(int addressid) {
		this.addressId=addressId;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public EmployeeDetails getEmployee() {
		return employee;
	}
	public void setEmployee(EmployeeDetails employee) {
		this.employee = employee;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	
}
