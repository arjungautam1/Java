import java.io.*;
import java.sql.SQLException;
public class FileWriterDemo extends Object {
	public static void main(String[] args) 
			throws IOException, SQLException {
		FileWriter fw = new FileWriter("d:/aboutarjun.txt");
		fw.write("Arjun is gental man.");
		fw.close();
	}
}
