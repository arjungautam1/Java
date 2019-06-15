package pdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.*;

public class PdfItext {
	public static void main(String[] args) throws FileNotFoundException, DocumentException  {
		
	
	String file_name="/home/laserarjun/firstpdf.pdf";
	Document document=new Document();
	
	PdfWriter.getInstance(document, new FileOutputStream(file_name));
	document.open();
	
	Paragraph para=new Paragraph("This is my first pdf");
	document.add(para);
	System.out.println("pdf created successfully");
	
	document.close();
	}
}

