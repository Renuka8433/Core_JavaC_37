//program to demonstrate the  Hierarchical inheritance  - Main class
package daysix;

public class HierarchicalDemo
{

	public static void main(String[] args) 
	{
		Person p = new Person();//
		System.out.println("Person Details:");
		System.out.println(p);
		
		Person p1;
		p1= new Person("Dhruv","Chennai");
		
		if(p1 instanceof Person)//true
			System.out.println("Person Details : "+p1);
		
		
		p1= new Employee("Nikila","Bangalore",101,50000,"Analyst");
		
		if(p1 instanceof Employee)//true
			System.out.println("Employee Details : "+p1);
		
		p1= new Studen("A",70);
		if(p1 instanceof Studen)//true
			System.out.println("Student Details : "+p1);
		
	}

}
