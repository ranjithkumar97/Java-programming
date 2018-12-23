package com.util.jdbc;

import java.sql.*;  
public class insert {  
public static void main(String args[]){  
try{  
	Class.forName("com.mysql.jdbc.Driver");    
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sandy","root","sandy");   
PreparedStatement stmt=con.prepareStatement("insert into employee values(?,?,?)");  
stmt.setInt(1,101);//1 specifies the first parameter in the query  
stmt.setString(2,"Ratan");  
 stmt.setString(3,"kumar"); 
System.out.println(stmt.executeUpdate());  
con.close();  
}
catch(Exception e)
{ 
	System.out.println(e);
}
}
}

