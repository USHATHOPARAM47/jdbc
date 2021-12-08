package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class main {

	public static void main(String[] args) {
		try {
			//Connection create
			Connection mycon=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root", "root");

			System.out.println("connection created");
			// Create Statement
			Statement mystate=(Statement) mycon.createStatement();
			
			//Query execute
			
		     int rs=mystate.executeUpdate("INSERT INTO `mydatabase`.`employee` (`employeeid`, `employeename`, `employeerole`, `employee salary`) VALUES ('7', 'pathrima', 'tester', '80000');");
		
		} catch(Exception e)
		{
			e.printStackTrace();
		
		}

	}
}

