package package2;
class Parent 
{
	int i=10;
}
class Child extends Parent {
	int i=20;
	void m1()
	{
	System.out.println("The value of i from Child class :"+i);
	System.out.println("The value of i from Parent class :"+super.i);
	}
}

public class Super {

	public static void main(String[] args) {
		Child obj=new Child();
		obj.m1();
	

	}

}
