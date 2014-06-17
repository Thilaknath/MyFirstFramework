import java.sql.Connection;
import java.sql.*;


public class mysql{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
Connection conn = null;



try {
	String driver ="com.mysql.jdbc.Driver";
	Class.forName(driver).newInstance();
	conn = DriverManager.getConnection("jdbc:mysql://localhost/sakila?" +
                                   "user=root&password=root");
	Statement st =((java.sql.Connection) conn).createStatement();
	ResultSet rs = st.executeQuery("select * from store");
	rs.next();
	System.out.println(rs.getString("last_update"));

    // Do something with the Connection

 
} catch (SQLException ex) {
    // handle any errors
    System.out.println("SQLException: " + ex.getMessage());
    System.out.println("SQLState: " + ex.getSQLState());
    System.out.println("VendorError: " + ex.getErrorCode());
}
}
}