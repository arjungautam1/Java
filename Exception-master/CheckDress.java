import exception.OutDressException;
import java.lang.String;
public class CheckDress extends Object{
	public static void main(String[] args) {
		Student student = new Student(" karishma ");
		if(student.isValidDress() == false)
			throw new OutDressException
			(student.studentName+" has not dressed properly.");
		System.out.println
			(student.studentName+" has dressed properly.");
		System.out.println("Enter class room.");
	}
}
class Student {
	String studentName;
	public Student(String name) {
		this.studentName = name;
	}
	public boolean isValidDress() {
		if (studentName.trim().equalsIgnoreCase("Karishma"))
			return false;
		else
			return true;
	}
}