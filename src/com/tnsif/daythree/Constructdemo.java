package com.tnsif.daythree;
import java.util.Scanner;

public class Constructdemo {
	public static void main(String[] args)
	{
		Scanner  s =  new  Scanner(System.in);
		String name,city;
		int id;
		
		System.out.println("Enter the customerId:");
		id=s.nextInt();

		System.out.println("Enter the customerName:");
		name =s.next();
		
		System.out.println("Enter the customerCity:");
		city=s.next();
		
		Customer c =  new Customer();//default constructor
		c.setCustomerName(name);
		c.setCustomerCity(city);
		c.setCustomerId(id);
		
		System.out.println(c);
	}

}
