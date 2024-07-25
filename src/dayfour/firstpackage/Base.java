//program to demonstrate package and access modifiers

package dayfour.firstpackage;

public class Base 
{
		
		int varDefault=10;
		public int varPublic=20;
		private int varPrivate=30;
		protected int varProtected=40;
		
		
		void methodDefault()
		{
			System.out.println("Default Access Modifier");
			System.out.println("Default Variable: "+varDefault);
		}
		public void methodPublic()
		{
			System.out.println("public Access Modifier");
			System.out.println("Public Variable: "+varPublic);
		}
		void methodPrivate()
		{
			System.out.println("Private Access Modifier");
			System.out.println("Private Variable: "+varPrivate);
		}
		void methodProtected()
		{
			System.out.println("Protected Access Modifier");
			System.out.println("Protected Variable: "+varProtected);
		}
}
