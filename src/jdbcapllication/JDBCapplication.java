package jdbcapllication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


import com.mysql.jdbc.Driver;


public class JDBCapplication {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
     Scanner sc = new Scanner(System.in);
     
     DriverManager.registerDriver(new Driver());
		
		
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
	
	System.out.println("Connection established");
	
	PreparedStatement ps = con.prepareStatement("insert into student value(?,?)");
	
	System.out.println("Enter roll no");
	int rno =sc.nextInt();
	
	System.out.println("Enter marks");
	int marks=sc.nextInt();


	
	
	
	ps.setInt(1, rno);
	ps.setInt(2, marks);
	
	ps.executeUpdate();
	
	
		
		
		
		
	
		
		
		
		
		
		
	}
	
	

}
