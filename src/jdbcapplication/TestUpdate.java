package jdbcapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Driver;

public class TestUpdate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);	
		
	DriverManager.registerDriver(new Driver());
	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");	
		
	System.out.println("Connection established");
	 
	PreparedStatement ps = con.prepareStatement("update student set marks=? where rollno=? ");
		
	System.out.println("Enter roll no");
	
	int rno=sc.nextInt();
	System.out.println("Enter new marks");
	
	int marks=sc.nextInt();
	
	ps.setInt(1, marks);
	
	ps.setInt(2, rno);
	
	ps.executeUpdate();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
