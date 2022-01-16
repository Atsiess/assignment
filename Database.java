package ly.assignment;

/**
 *
 * @author jiaying
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author chunfang
 */
public class Database {
    private Connection connection;
    
    //connect with online database
    public void connect() throws SQLException{
        try{    
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://sql6.freesqldatabase.com:3306/sql6465623","sql6465623","iMrMFGfkJV");
	}catch (Exception e) {
            System.out.println(e.getMessage());
	}
    }
    //return connection
    public Connection getConnection(){
        return connection;
    }
}