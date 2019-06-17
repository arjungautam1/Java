package crashing_java;
class OuterClass
{
	int a;
	public void show()
	{
		System.out.println("Outer class .");
	}
	class InnerClass					//inner class 
	{
		public void display()
		{
			System.out.println("This is a method from inner class ");
		}
	}
}
public class InnerClass {

	public static void main(String[] args) {
		OuterClass obj=new OuterClass();
		obj.show();
		OuterClass.InnerClass obj1=obj.new InnerClass();				//way to call Inner class 
		obj1.display();
	
	}

}
