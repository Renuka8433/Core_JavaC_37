//Program to demonstrate single level inheritance
package daysix;

public class SLInheritance 
{

	public static void main(String[] args) 
	{
		
		Student  s = new Student("Anu","1234567789","Bangalore",987123456L,10,"CityCollege");
	
		System.out.println(s);
		
		Citizen c=new Citizen("Anu","1234567789","Bangalore",987123456L);
		System.out.print(c);
	}

}
