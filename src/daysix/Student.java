//Program to demonstrate single level inheritance
package daysix;
//dervied  class
public class Student extends Citizen
{
	private int rollNo;
	private String collegeName;
	
	
	
	public Student() 
	{
		super();//Keyword
		
	}
	public Student(String name, String aadharno, String address,
			long phno, int  rollNo, String collegeName) 
	{
		super(name, aadharno, address, phno);// Accessing it from the parent class
		this.rollNo=rollNo;
		this.collegeName=collegeName;
		
		
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName +"]";
	}
	
	
	
	
	
	
}
