package variable;
//static variable 
class Employee
{
	public static double salary;	//static variable 
	public static String name="Arjun Gautam.";
}

public class StaticVariable {
public static void main(String[] args) {

	Employee.salary=10000000;								//classname.variablename
	System.out.println("Salary of Employee is "+Employee.salary);   	
	System.out.println("Name of Employee is "+Employee.name);
	
}
}
