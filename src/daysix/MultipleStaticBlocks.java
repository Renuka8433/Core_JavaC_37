package daysix;

public class MultipleStaticBlocks 
{

	//InstanceBlocks
	{
		System.out.println("InstanceBlock-1");
	}
	{
		System.out.println("InstanceBlock-2");
	}
	//Static Blocks
	static{
		System.out.println("Static Block-1");
	}
	static{
		System.out.println("Static Block-2");
	}
	
	public static void main(String[] args) 
	{
		new MultipleStaticBlocks();
	}

}
