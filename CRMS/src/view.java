// viewing from Database 
import java.sql.*; 
import java.util.Scanner;

public class view 
{ 
	public void viewing()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Id you want to view");
		int Id = in.nextInt(); 
		System.out.println("Enter the name you want to view");
		String name = in.next();
		try
		{ 
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "admin", "gowtham"); 
			Statement stmt = con.createStatement(); 
			
			// SELECT query 
			String q1 = "select * from CrimeRecord WHERE Id = '" + Id + "' AND Name = '" + name + "'"; 
			ResultSet rs = stmt.executeQuery(q1); 
			if (rs.next()) 
			{ 
				System.out.println("User-Id : " + rs.getString(1));
				System.out.println("Name :" + rs.getString(2)); 
				System.out.println("Place :" + rs.getString(3)); 
				System.out.println("blood :" + rs.getString(4));
				System.out.println("reason :" + rs.getString(5));
			} 
			else
			{ 
				System.out.println("No such user id is already registered"); 
			} 
			con.close(); 
		} 
		catch(Exception e) 
		{ 
			System.out.println(e); 
		} 
	} 
} 
