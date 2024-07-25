package dayseven;

public class Test
{
	
	int a=100;//Instance or Global  variable
	static int data=300;//Static variable
	
	public static void main(String[] args) 
	{
		int b=200; //local variable 
		System.out.println(b);
		
		Test t= new Test();
		System.out.println(t.a);
		
		System.out.println(Test.data);//with classname
		System.out.println(data);//direct access
		System.out.println(t.data);//with  object 
		
	}

}
