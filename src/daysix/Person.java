//program to demonstrate the  Hierarchical inheritance -Base class
package daysix;

public class Person 
{
		private String name;
		private String city;
		
		//Constructor 
		 public Person()
		 {
			System.out.println("Person class default  constructor");
			name="Anu";
			city="Bangalore";
		 }
		 //Parametrized  constructor
		public Person(String name, String city)
		{
			
			this.name = name;
			this.city = city;
		}
		//Getters and Setters

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		
		public String toString() {
			return "Person [name=" + name + ", city=" + city + "]";
		}
		 
}			
		
