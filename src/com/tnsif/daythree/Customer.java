package com.tnsif.daythree;

public class Customer {
	//DATAMEMBERS
	
private String customerName;
private int customerId;
private  String customerCity;


//Default Constructor
public Customer()
{
	System.out.println("Default Consrtuctor");
}

//parameterized Constructor
public Customer(String customerName, int customerId, String customerCity) 
{
	
	this();//Calling default constructor
	System.out.println("Parameterized Consrtuctor");
	this.customerName = customerName;
	this.customerId = customerId;
	this.customerCity = customerCity;
}
//getter and setter

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public int getCustomerId() {
	return customerId;
}

public void setCustomerId(int customerId) {
	this.customerId = customerId;
}

public String getCustomerCity() {
	return customerCity;
}

public void setCustomerCity(String customerCity) {
	this.customerCity = customerCity;
}


public String toString() {
	return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customerCity="
			+ customerCity + "]";
}





}



