package pdf;

import com.itextpdf.text.Document;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.*;
import java.sql.*;

public class MySqlConnection {
	public static void main(String[] args) throws Exception  {
		
	
	String file_name="/home/laserarjun/hello.pdf";
	Document document=new Document();
	
	PdfWriter.getInstance(document, new FileOutputStream(file_name));
	document.open();
	
	//Fetching data from the mysql
	ConnectionManager obj=new ConnectionManager();
	Connection conn=obj.getConnectionn();
	PreparedStatement ps=null;
	ResultSet rs=null;
	String query="select * from pdf_table";
	ps=conn.prepareStatement(query);
	rs=ps.executeQuery();
	PdfPTable table=new PdfPTable(3);
	PdfPCell c1=new PdfPCell(new Phrase("Name"));
	table.addCell(c1);
	
	c1=new PdfPCell(new Phrase("Address"));
	table.addCell(c1);
	
	c1=new PdfPCell(new Phrase("Profession"));
	table.addCell(c1);
	table.setHeaderRows(1);
	while(rs.next())
	{
		
		//Paragraph para=new Paragraph(rs.getString("name")+rs.getString("address")+rs.getString("profession"));
	
		
		table.addCell(rs.getString("name"));
		table.addCell(rs.getString("address"));
		table.addCell(rs.getString("profession"));
		
		
		
		
	}
	document.add(table);
	System.out.println("Table Created");
	
	document.close();
	}
}
