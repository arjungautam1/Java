import java.io.*;
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("aboutkarishma.txt");
		int i = 0;
		while((i=fis.read())!=-1) {
			System.out.print(i);
			System.out.println((char)fis.read());
		}
		
	}
}
