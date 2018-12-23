package com.util.jdbc;

import java.sql.*;  
public class preparesStatement {  
public static void main(String args[]){  
try{  
	Class.forName("com.mysql.jdbc.Driver");    
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sandy","root","sandy");   
PreparedStatement stmt=con.prepareStatement("select * from employee");  
ResultSet rs=stmt.executeQuery();  
while(rs.next()){  
System.out.println(rs.getInt(1)+" "+rs.getString(2)+ " "+rs.getString(3));  
}  
}
catch(Exception e)
{
	System.out.println(e);
}
}
}