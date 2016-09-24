package tab.api;

import com.fasterxml.jackson.annotation.JsonProperty;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.validator.constraints.Length;

public class Saying {
    private long id;

    @Length(max = 3)
    private String content;

    public Saying() {
        // Jackson deserialization
    }

    public Saying(long id, String content) {
        this.id = id;
        this.content = content;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getContent() throws SQLException {
    	Connection conn = null;
    	Statement statement = null;
    	
    	String st = " ";
    	
    	
    	try {
			DriverManager.registerDriver (new oracle.jdbc.OracleDriver());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	try {
    		System.out.println("SUCCESSS");
			conn = DriverManager.getConnection
					  ("jdbc:oracle:thin:@insightdbdev.usfca.edu:1521:CERT", "TABPORT", "t8bp0rt");
			
			statement = conn.createStatement();
			
//			String SQLString = "SELECT owner,table_name FROM all_tables";
			
			String SQLString = "SELECT * FROM TP_VISUALS";
			
			ResultSet rs = statement.executeQuery(SQLString);

			while (rs.next()) {
				
				st = st + rs.getString(1);
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));

				String userid = rs.getString(1);
				String username = rs.getString(2);
//				
//				st = st + " user: " + userid + " ";
//				st = st + "tName: " + username + " <br>";
//				
				System.out.println("owner : " + userid);
				System.out.println("table_name : " + username);

			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (conn != null){
				conn.close();
			}
			
			if (statement != null) {
				statement.close();
			}
		}
    	
        return st;
    }
    
}