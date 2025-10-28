package Com.StudentMns;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class DBConnection {
	    // Replace with your database details
	    private static final String URL = "jdbc:mysql://localhost:3306/student_db";
	    private static final String USER = "root";
	    private static final String PASSWORD = "admin";

	    public static Connection getConnection() throws SQLException {
	        // Load the MySQL JDBC Driver (Needed for older versions of Java/MySQL)
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	            System.out.println("MySQL JDBC Driver not found!");
	        }
	        return DriverManager.getConnection(URL, USER, PASSWORD);
	    }
	}
	

