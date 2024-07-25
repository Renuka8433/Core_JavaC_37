package dayfour.secondpackage;

import dayfour.firstpackage.Base;
public class Executor {

	public static void main(String[] args) 
	{
		Base b1 = new Base();//Accessing different package class
		
		//Private,default and protected  members  can't access
		
		/*b1.methodDefault();
		b1.methodPrivate();
		b1.methodProtected();*/
		
		b1.methodPublic();
		

	}

}
