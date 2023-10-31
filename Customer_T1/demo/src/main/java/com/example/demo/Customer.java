package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
 private int ID;
 private String name;
 private String orderid;
 private String phone;
 private String email;

public Customer() {
	super();
}
public Customer(int ID, String name, String orderid, String phone,String email) {
	super();
	this.ID = ID;
	this.name = name;
	this.orderid = orderid;
	this.phone = phone;
	this.email = email;
	}
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
public int getId() {
	return ID;
}
public void setId(int ID) {
	this.ID = ID;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getOrderid() {
	return orderid;
}
public void setOrderid(String orderid) {
	this.orderid = orderid;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Customer [id=" + ID + ", Name=" + name + ", orderid=" + orderid + ", Phone="
			+ phone +", Email="+email+ "]";
}

 
}

