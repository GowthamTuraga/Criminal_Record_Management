// Java program to illustrate 
// selecting from Database 
import java.sql.*; 

public class view 
{ 
	public static void main(String args[]) 
	{ 
		String Id = "1002"; 
		String Place = "Kolkata"; 
		try
		{ 
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "admin", "gowtham"); 
			Statement stmt = con.createStatement(); 
			
			// SELECT query 
			String q1 = "select * from CrimeRecord WHERE Id = '" + Id + "' AND Place = '" + Place + "'"; 
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
