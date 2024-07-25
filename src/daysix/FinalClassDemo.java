//Program to demonstrate the final class

package daysix;
final class FinalClass
{
	//method
	void show()
	{
		System.out.println("Final class  can't be inherited");
	}
}
//we can't create child class  from  my final class
//String,Wrapper classes,System,Scanner ,Number are final classes
/* FinalChildClass  extends FinalClass
{
	
}*/
public class FinalClassDemo 
{
	public static void main(String[] args) 
	{
		
		FinalClass  fc = new FinalClass();
		fc.show();

	}

}
