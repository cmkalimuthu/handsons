import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {

	private static Connection con = null;

    //ENSURE YOU DON'T CHANGE THE BELOW CODE WHEN YOU SUBMIT
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
	// create the connection now
     con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebbill","root","");
     return con;	
	}
}
