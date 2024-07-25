package dayfive;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arraylistdemo 
{

	public static void main(String[] args)
	{

		// creates empty raw ArrayList (allows heterogeneous elements)
		List list1 = new ArrayList();
		System.out.println("Size : "+list1.size());
		System.out.println("Is list empty? "+list1.isEmpty());
		
		list1.add(10, list1);
		list1.add(20, list1);
		list1.add(list1);
		list1.add(20,list1);
		list1.add("Hello");
		list1.add(list1);
		list1.add(20,list1);
		list1.add('A',list1);
		list1.add(5, "Hi");
		list1.add(20,list1);
		
		System.out.println("List is "+list1);

		//System.out.println("Is list contains 15? "+list1.contains());

		list1.remove(0);
		System.out.println("List is "+list1);
	}
}
 
