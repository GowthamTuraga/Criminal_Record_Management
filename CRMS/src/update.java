import java.sql.*; 

public class update 
{ 
	public static void main(String args[]) 
	{ 
		String id = "1001"; 
		String place = "Mumbai"; 
		String newPlace = "Hyderabad"; 
		try
		{ 
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","admin","gowtham");
			Statement st = conn.createStatement(); 
		
			// Updating database 
			String q1 = "UPDATE CrimeRecord set Place = '" + newPlace + "' WHERE Id = '" +id+ "' AND Place = '" + place + "'";
					 
			int x = st.executeUpdate(q1); 
			
			if (x > 0)			 
				System.out.println("Data Successfully Updated");			 
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
