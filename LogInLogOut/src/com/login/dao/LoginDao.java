package com.login.dao;

import java.sql.*;

public class LoginDao {
	String query="select * from login where uname=? and pass=? ";
	String url="jdbc:mysql://localhost:3306/login";
	String username="root";
	String password="";
	
	public boolean check(String uname,String pass)
	{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection(url,username,password);
				PreparedStatement st=con.prepareStatement(query);
				st.setString(1, uname);
				st.setString(2, pass);
				ResultSet rs=st.executeQuery();
				if(rs.next())
				{
					return true;
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		return false;
			}

}
