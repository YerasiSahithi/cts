package com;

import java.sql.*;
class Prepared{
	public static int executeUpdate() {
		// TODO Auto-generated method stub
		return 0;
	}

public static class JdbcExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr", "hr");
PreparedStatement stmt=con.prepareStatement("insert into jobs(?,?,?,?)");
stmt.setInt(1,1);
stmt.setString(2,"sa");
int i=executeUpdate();
System.out.println(i+"records inserted");
con.close();
	
		
	}catch(Exception e) {
		System.out.println(e);
	}
}

}
}