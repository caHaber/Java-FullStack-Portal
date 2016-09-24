package tab.db;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;



public class DBHelper {
	
	private String driverString;
	private String username;
	private String password;
	
	
	public DBHelper (){
		//Jackson deserilization
	}
	
	public DBHelper(String driverString, String username, String password){
		this.driverString = driverString;
		this.username = username;
		this.password = password;
	}
	

	public Connection getConnection() throws SQLException{
		DriverManager.registerDriver (new oracle.jdbc.OracleDriver());
 		System.out.println("SUCCESSS");
 		Connection 	conn = DriverManager.getConnection
				  (driverString, username, password);
        return conn;
	}
	
//	public ArrayList<String, String> print(){
//		
//	}
	
	
	

}
