import java.io.*;
public class FileReaderDemo {
	public static void main(String[] args) throws IOException  {
		FileReader fileReader = null;
		try {
			fileReader = new FileReader("aboutkarishma.txt");
			int i = 0;
			while((i=fileReader.read())!=-1) {
				System.out.print(i);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			fileReader.close();
		}
	}
}
