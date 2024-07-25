package com.tnsif.daythree;

import java.util.Scanner;

public class Employeedemo {

	public static void main(String[] args) {
		Scanner  s =  new  Scanner(System.in);
		String name,jobdescribtion;
		int id;
		
		System.out.println("Enter the id:");
		id=s.nextInt();
		s.nextLine();

		System.out.println("Enter the name:");
		name =s.nextLine();
		
		System.out.println("job describtion:");
		jobdescribtion=s.nextLine();
		
		Employee c =  new Employee();//default constructor
		c.setId(id);
		c.setName(name);
		
		c.setJobdescribtion(jobdescribtion);
		
		System.out.println(c);
		// TODO Auto-generated method stub

	}

}
