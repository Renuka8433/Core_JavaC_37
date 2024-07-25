package com.tnsif.daytwo;

public class Operatorsdemo {
	public static void main(String[] args) 
	{
		int a =10;
		int b =20;
		
		int x=10;
		System.out.println("a and b value before the operations:"+a + " "+b);
		
		++a;//pre increment ==>a=a+1=>a=10+1=11
		
		int  c=++a + b;
		/*c= ++a + b
		 * =12+20= 32
		 */
		System.out.println("C value : "+c);
	
		//Ternary Operator
		x=(10==x)?1:0;
		System.out.println(x);
	}

}
