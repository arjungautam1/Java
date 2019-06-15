package pdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.*;

public class PdfWithTable {
	public static void main(String[] args) throws Exception  {
		
	
	String file_name="/home/laserarjun/firstpdf.pdf";
	Document document=new Document();
	
	PdfWriter.getInstance(document, new FileOutputStream(file_name));
	document.open();
	
	Paragraph para=new Paragraph("This is my first pdf");
	document.add(para);
	System.out.println("pdf created successfully");
	
	//for space 
	document.add(new Paragraph("  "));
	
	//Table
	PdfPTable table=new PdfPTable(3);
	PdfPCell c1=new PdfPCell(new Phrase("Name"));
	table.addCell(c1);
	
	c1=new PdfPCell(new Phrase("Address"));
	table.addCell(c1);
	
	c1=new PdfPCell(new Phrase("Profession "));
	table.addCell(c1);
	table.setHeaderRows(1);
	
table.addCell("1.0");
	table.addCell("1.1");
	table.addCell("1.2");
//	table.addCell("2.1");
//	table.addCell("2.2");
//	table.addCell("2.3");
	document.add(table);
	
	System.out.println("Table also created");
	//add Image 
	document.add(new Paragraph("  "));
	document.add(Image.getInstance("/home/laserarjun/Documents/logo-2x.png"));
	
	document.close();
	}
}
