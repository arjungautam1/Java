package package2;

class super1 
{
super1()
	{
		System.out.println("Hello");
	}
}
class child2 extends super1
{
	 child2()
	{super();
	}
}

public class SuperConstructor {
	public static void main(String []args)
	{
	child2 obj=new child2();
	}
}