package com.kce.util;
import java.sql.*;
//import java.sql.DriverManager;
import java.sql.SQLException;

//import com.mysql.jdbc.Connection;

public class DButil {
	public static Connection getConnection() throws SQLException {


		Connection con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/book","root","root123#@");

		return con;



	}


}
