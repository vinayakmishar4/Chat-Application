package org.chatapp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static org.chatapp.utils.ConfigReader.getValue;

public class commadDao
{
	public Connection createConnection() throws SQLException, ClassNotFoundException
	{
		// 1 setuP Driver
		Class.forName(getValue("DRIVER"));
		// 2 make connection
		final String Connection_String="jdbc:mysql://localhost:3306/chatdb";
		final String 	USER_ID=getValue("UserID");
		final String  Password=getValue("Password");
		Connection con=DriverManager.getConnection(Connection_String,USER_ID,Password);
		if(con!=null)
		{
			System.out.println("Connection Created..");
			con.close();
		}
		return null;
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{ 
		commadDao CommadDao=new commadDao();
		CommadDao.createConnection();
	}
}
