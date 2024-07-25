package dayfour.firstpackage;

import java.util.Scanner;

public class PersonDemo 
{

	public static void main(String[] args) 
	{
		Person p1 = new Person();
		
		Scanner s = new Scanner(System.in);
		
		String name,city;
		int age;
		System.out.println("Enter person details : Name,Age,City");
		
		name=s.nextLine();
		age=s.nextInt();
		s.nextLine();
		city=s.nextLine();
		
		p1.setPersonName(name);
		p1.setPersonAge(age);
		p1.setPersonCity(city);
		
		
		System.out.println("Person details:"+"Name : "+p1.getPersonName()+"Age: "
				+ p1.getPersonAge()+"City: "+p1.getPersonCity());
		
		s.close();
	}

}
