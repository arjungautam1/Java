package package6;
public class SubjectFormat implements CsitSyllabus{
	public void firstSem() {
		
		System.out.println("\n First Semester:\n\n1.Introduction of Information Technology\r\n" + 
				"2.Fundamentals of Computer Programming\r\n" + 
				"3.Statistics\r\n" + 
				"4.Calculus and Analytical Geometry\n"+
				"5.Digital Logic.\n");
		
	}

	@Override
	public void secondSem() {
		System.out.println("\n Second Semester:\n\n1.Digital Logic\r\n" + 
				"2.Discrete Structure\r\n" + 
				"3.Microprocessor\r\n" + 
				"4.Data Structures and Algorithms\r\n" + 
				"5.Linear Algebra");
		
	}

	@Override
	public void thirdSem() {
		System.out.println("\n Third Semester:\n\n1.Computer Architecture\r\n" + 
				"2.Object Oriented Programming Language\r\n" + 
				"3.Operating Systems\r\n" + 
				"4.Numerical Methods\r\n" + 
				"5.Introduction to Management");
		
		
	}

	@Override
	public void fourthSem() {
		// TODO Auto-generated method stub
		System.out.println("\n Fourth Semester:\n\n1.Theory of Computation\r\n" + 
				"2.System Analysis and Design\r\n" + 
				"3.Database Management System\r\n" + 
				"4.Computer Graphics\r\n" + 
				"5.Introduction of Cognitive Science\r\n" + 
				"6.Technical Writing");
		
	}

	@Override
	public void fifthSem() {
		// TODO Auto-generated method stub
		System.out.println("\n Fifth Semester:\n\n1.Computer Networks\r\n" + 
				"2.Simulation and Modeling\r\n" + 
				"3.Design and Analysis of Algorithms\r\n" + 
				"4.Artificial Intelligence");
		
	}

	@Override
	public void sixthSem() {
		// TODO Auto-generated method stub
		System.out.println("\n Sixth Semster:\n\n1.Software Engineering\r\n" + 
				"2.Compiler Design and Construction\r\n" + 
				"3.Web Technologies\r\n" + 
				"4.Real Time System");
		
	}

	@Override
	public void seventhSem() {
		// TODO Auto-generated method stub
		System.out.println("\n\nSeventh Semester:\n\nCSC-401: Advanced Database Management System\r\n" + 
				"CSC-402: Internet Technology\r\n" + 
				"CSC-403: Advanced Java Programming\r\n" + 
				"CSC-404: Project Work\r\n" + 
				"Computer Science Elective 3");
	}

	@Override
	public void eighthSem() {
		// TODO Auto-generated method stub
		System.out.println("\n Eighth Semester:\n\nCSC-451: Data Warehousing and Data Mining\r\n" + 
				"CSC-452: Internship\r\n" + 
				"CSC-453:Computer Science Elective 4\r\n" + 
				"CSC-454:Computer Science Elective 5");
		
	}
}
