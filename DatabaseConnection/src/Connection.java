import java.sql.*;
public class Connection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.sql.Connection conn = null;
		String url ="jdbc:mysql://localhost/";
		String dbname = "sakila?";
		String driver ="com.mysql.jdbc.Driver";
		String userName ="root";
		String password ="root";
		//"user=root&password=root"jdbc:mysql://localhost/sakila?
		try{
			Class.forName(driver).newInstance();
			conn =   DriverManager.getConnection(url+dbname,userName,password);
			Statement st =((java.sql.Connection) conn).createStatement();
			
			ResultSet rs = st.executeQuery("select * from store");
			while (rs.next())
		{	
			
				System.out.println(rs.getString("store_id") +"\t"+ rs.getString("last_update"));
				
			
		}
			
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
			

}
}
