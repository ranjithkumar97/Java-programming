package com.util.jdbc;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class ResultSetMetaData {  

public static void main(String args[]){  
try{  
	Class.forName("com.mysql.jdbc.Driver");    
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sandy","root","sandy");  
  
PreparedStatement ps=(PreparedStatement) con.prepareStatement("select * from employee");  
ResultSet rs=ps.executeQuery();  
ResultSetMetaData rsmd=(ResultSetMetaData) rs.getMetaData();  
System.out.println("Total columns: "+((java.sql.ResultSetMetaData) rsmd).getColumnCount());  
System.out.println("Column Name of 1st column: "+((java.sql.ResultSetMetaData) rsmd).getColumnName(1));  
System.out.println("Column Type Name of 1st column: "+((java.sql.ResultSetMetaData) rsmd).getColumnTypeName(2));  
  con.close();  
}catch(Exception e)
{
	System.out.println(e);
	}  
}



}  
  


