package variable;
//Example illustrating the use of instance variable
class Marks
{
	//inside class -outside any method ,constructor 
	 int engMarks;
	 int mathMarks;
	 int javaMarks;
}


public class InstanceVariable {
	public static void main(String[] args) {
		Marks obj=new Marks();
		obj.engMarks=10;
		obj.mathMarks=30;
		obj.javaMarks=40;
		
		System.out.println("Marks obtained in English ="+obj.engMarks);
		System.out.println("Marks obtained in English ="+obj.mathMarks);
		System.out.println("Marks obtained in English ="+obj.javaMarks);
		
	}

}
