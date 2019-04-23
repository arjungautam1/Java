import java.io.*;

public class FileOutputStreamDemo {
	public static void main(String[] args) 
			 {
		methodCall1();
	}

	static void methodCall1() 
			 {
		startOperation();
	}
	private static void startOperation() 
			 {
		FileOutputStream fout;
		try {
			fout = new FileOutputStream("aboutkarishma.txt");
			String valueToWrite = "Karishma is a nice girl.";
			byte[] b = valueToWrite.getBytes();
			fout.write(b);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
