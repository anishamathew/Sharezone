package com.sharezone.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcProperties {
	
		
	Connection con=null;
	public Connection getConnection(){
		
	
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost/sharezone?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
	
	}
	catch(Exception e){
		System.out.println(e);
		
	}
	return con;
	}

}

