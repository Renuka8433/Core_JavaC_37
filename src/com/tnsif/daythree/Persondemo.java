package com.tnsif.daythree;
import java.util.Scanner;

public class Persondemo {

	public static void main(String[] args)
	{
		Scanner s  = new Scanner(System.in);
		String name;
		System.out.println("Enter the  name:");
		name=s.next();
		int income;
		System.out.println("Enter the income:");
		income=s.nextInt();
		int age;
		System.out.println("Enter the age:");
		age=s.nextInt();
		s.nextLine();
		String gender;
		System.out.println("Enter the gender:");
		gender=s.nextLine();
		int tax;
		System.out.println("Enter the tax:");
		tax=s.nextInt();
		
		//Person object and initialize values using setter
		Person  person = new  Person();
		person.setName(name);
		person.setIncome(income);
		person.setAge(age);
		person.setGender(gender);
		person.setTax(tax);
		
		
		//Display
		System.out.println(person);

	}

}



