
// deleting from Database 
import java.sql.*;
import java.util.Scanner; 

public class delete 
{ 
	public void deletion()
	{   
		Scanner in = new Scanner(System.in);
		System.out.println("Type the Id you want to delete");
		int id = in.nextInt(); 
		System.out.println("Type the Name you want to delete");
		String name = in.next();
		try
		{ 
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","admin","gowtham");
			Statement st = conn.createStatement(); 
				
			// Deleting from database 
			String q1 = "DELETE from CrimeRecord WHERE Id = '" + id + "' AND Name = '" + name + "'"; 
					
			int x = st.executeUpdate(q1); 
			
			if (x > 0)			 
				System.out.println("One User Successfully Deleted");			 
			else
				System.out.println("ERROR OCCURED :("); 
			
			conn.close(); 
		} 
		catch(Exception e) 
		{ 
			System.out.println(e); 
		} 
	} 
} 
