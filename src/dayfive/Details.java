package dayfive;

import java.util.*;

public class Details {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		
		String name;
		char initial;
		int mark1,mark2;
		float cgpa;
		
		System.out.println("Enter the details:");
		
		name =s.nextLine();
		initial=s.next().charAt(0);
		mark1=s.nextInt();
		mark2=s.nextInt();
		cgpa=s.nextFloat();
		
		System.out.println("Initial:  "+initial);
		System.out.print("Name : "+name+"\n"+"Mark1 :"+mark1+"\n");
		System.out.print("Mark2 : "+mark2+"\n"+"Cgpa :"+cgpa);
	}

}
