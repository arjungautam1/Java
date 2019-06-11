package variable;

public class LocalVariableAccessingOutside {

	public void studentAge()
	{
		//local Variable
		int age=0;
		age=age+5;
		
	}
	public static void main(String[] args) {
	//System.out.println("Age is:"+age);			//scope of  age is only inside the block
	}
}
