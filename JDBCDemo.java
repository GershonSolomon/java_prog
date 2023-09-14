package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class JDBCDemo {
	public static void main(String[] args) throws Exception {
		String jdbcUrl = "jdbc:mysql://localhost:3306/day2";
		String username = "root";
		String password = "Gero@2002";
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

			Statement statement = connection.createStatement();

			String sql = "SELECT * FROM entry";
			ResultSet resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {
				int id = resultSet.getInt("ID");
				String name = resultSet.getString("NAME");
				System.out.println("ID: " + id + ", Name: " + name);
			}

			resultSet.close();
			statement.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
