package variable;

public class LocalVariable {
	public void studentAge()
	{
		int age=0;	//local variable
		age=age+5;
		System.out.println("Age of the student is ="+age);
		
	}
	public static void main(String[] args) {
		
		LocalVariable obj=new LocalVariable();
		obj.studentAge();
	}

}
