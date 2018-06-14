import java.sql.*;
public class SQLServerDB {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=pubs","test","123456");
			stmt=con.createStatement();
			String sql="select * from employees";
			rs=stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getString("emp_id"));
			}
		} catch (Exception e) {
			System.out.println("error");
		}
	}
}