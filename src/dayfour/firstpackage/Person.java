package dayfour.firstpackage;

public class Person 
{
			//Data Members
			private String personName;
			private int personAge;
			private String personCity;
			
			//Getters and Setters
			
			public String getPersonName() {
				return personName;
			}
			public void setPersonName(String personName) {
				this.personName = personName;
			}
			public int getPersonAge() {
				return personAge;
			}
			public void setPersonAge(int personAge) {
				this.personAge = personAge;
			}
			public String getPersonCity() {
				return personCity;
			}
			public void setPersonCity(String personCity) {
				this.personCity = personCity;
			}
			//Constructors 
			public Person()
			{
				System.out.println("Default Constructor");
			}
			//Parametrized Constructor
			public Person(String personName, int personAge, String personCity) {
			
				System.out.println("Parametrized Constructor");
				this.personName = personName;
				this.personAge = personAge;
				this.personCity = personCity;
			}
			
			
			
			
}
