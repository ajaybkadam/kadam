package jdbcapplicationinsert;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Driver;

public class Testinsert {

	public static void main(String[] args) throws  Exception {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
	
	  DriverManager.registerDriver(new Driver());
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		
		System.out.println("Connection established");
		
		PreparedStatement ps = con.prepareStatement("insert into bank value(?,?)");
		
		System.out.println("Enter bank id");
		int bankid=sc.nextInt();
		System.out.println("Enter bank name");
		int bankname=sc.nextInt();
	
		ps.setInt(1,bankid);
		ps.setInt(2, bankname);
		
		ps.executeUpdate();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
