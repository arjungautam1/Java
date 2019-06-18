package crashing_java;
abstract class Human		//sabstraact class
{
	abstract void character();	//abstract class
}

class Man extends Human
{
	void character()			//Declared earlier but wasn't instantiated/defined
	{
		System.out.println("Man can walk.");
	}
}
public class AbstractClass {
	public static void main(String[] args) {
		Man obj=new Man();
		obj.character();
	}

}
