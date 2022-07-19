import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBCDemo {

	public static void main(String[] args) throws SQLException {
		String name ="lionel";
		String Phone_no ="3568767688";
		String dob ="1972-08-23";
		String username ="liol";
		String password ="mysql";
		 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_457","root","Memenene12!");
		 Statement statement = connection.createStatement();
		 
		 statement.executeUpdate("insert into user(name,Phone_no,dob,username,password)"
		 		+ "value('"+ name +"', '"+Phone_no+"','"+dob+"','"+username+"','"+password+"')");
		 
		 connection.close();
		 
		 System.out.println("close");
		 
		 
	}		


}
