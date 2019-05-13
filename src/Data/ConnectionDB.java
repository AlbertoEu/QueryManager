package Data;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionDB {
    private final String driverClass;
    private String connectionURL;
    private String database;
    private String usernameDB;
    private String passwordDB;
    private Query queryToRun;
    private Connection connection;
    private Statement statement;

    public ConnectionDB(String connectionURL, String database, String usernameDB, String passwordDB, Query queryToRun) {
        this.driverClass = "com.mysql.jdbc.Driver";
        this.connectionURL = connectionURL;
        this.database = database;
        this.usernameDB = usernameDB;
        this.passwordDB = passwordDB;
        this.queryToRun = queryToRun;
    }
    
    public void connect() throws ClassNotFoundException, SQLException {
        Class.forName(driverClass);
        connection = DriverManager.getConnection(connectionURL+"/"+database, usernameDB, passwordDB);
    }
    
    public void runQuery() throws SQLException {
        statement=connection.createStatement(); 
        ResultSet result=statement.executeQuery(queryToRun.getCompletedQuery()); 
    }
    
    public void disconnect() throws SQLException {
        connection.close();
    }
}   
