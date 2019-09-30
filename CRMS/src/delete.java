
// deleting from Database 
import java.sql.*; 

public class delete 
{ 
	public void deletion()
	{ 
		String id = "1001"; 
		String pwd = "Hyderabad"; 
		try
		{ 
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","admin","gowtham");
			Statement st = conn.createStatement(); 
				
			// Deleting from database 
			String q1 = "DELETE from CrimeRecord WHERE id = '" + id + "' AND place = '" + pwd + "'"; 
					
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
