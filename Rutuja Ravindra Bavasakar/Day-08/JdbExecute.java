package begin8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbExecute {

	public Connection conn;
	public Statement stmt;
	public ResultSet rs;

	public JdbExecute() {
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Product", "root", "");			
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM Product");
			System.out.println("done");
		} catch(Exception e) {
			System.out.println("error"+e);
		}
	}
	
	public static void main(String[] args) {
		new JdbExecute();
	}

}