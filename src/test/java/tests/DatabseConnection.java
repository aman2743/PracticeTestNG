package tests;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabseConnection {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		java.sql.Connection conn =null;
		String url="jdbc:sqlserver://localhost:1433;user=DESKTOP-PJTLFA3\\Aman;password= ;databaseName=AMAN;";

//			String username ="DESKTOP-PJTLFA3\\Aman";
//			String password="";
			//Initialize Sqldriver instance 
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			// Creating the connection providing URL and username password
			conn = DriverManager.getConnection(url);

			//Checking for the connection( returns boolean false if connected)
			if(conn.isClosed()) 
			{
				System.out.println("Not connected");
			     }
			else {
				System.out.println("Connected");
			    }
			

			// // For Print
			//    System.out.println("Data values getting displayed below");
			// // Sql Query to dispaly all the values under xxxxxxxx table            
			//    String query = "SELECT * from XXXXXXXXX";
			// // Providing the query under prepareStatement parameter 
			//    PreparedStatement pst=conn.prepareStatement(query);
			//
			// //Command to execute query and capturing all the result under Result set 
			//    result=pst.executeQuery();
			//     while(result.next()) {
			//
			//  //Printing the 1 column 2 column and 6 column of the table
			//     System.out.println(result.getString(1)+ "   "+ result.getString(2) +"   " +result.getString(6));
			//            }
			//
			//    return result;
			//
			//            } catch (Exception e) {
			//            e.printStackTrace();
			//            }finally {
			//
			//            }
			//
			//    return result;}
}
}
