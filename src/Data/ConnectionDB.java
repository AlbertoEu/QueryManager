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
    private Connection connection;
    private Statement statement;
    private boolean connectionWorks;

    public ConnectionDB() {
        this.driverClass = "com.mysql.jdbc.Driver";
    }
    
    public ConnectionDB(String connectionURL, String database, String usernameDB, String passwordDB) {
        this.driverClass = "com.mysql.jdbc.Driver";
        this.connectionURL = connectionURL;
        this.database = database;
        this.usernameDB = usernameDB;
        this.passwordDB = passwordDB;
    }
    
    public void connect() throws ClassNotFoundException, SQLException {
        Class.forName(driverClass);
        
        connection = DriverManager.getConnection("jdbc:mysql://"+connectionURL+"/"+database, usernameDB, passwordDB);
    }
    
    public void runQuery(Query queryToRun) throws SQLException {
        statement=connection.createStatement(); 
        ResultSet result=statement.executeQuery(queryToRun.getCompletedQuery()); 
    }
    
    public void disconnect() throws SQLException {
        connection.close();
    }

    public String getConnectionURL() {
        return connectionURL;
    }

    public void setConnectionURL(String connectionURL) {
        this.connectionURL = connectionURL;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getUsernameDB() {
        return usernameDB;
    }

    public void setUsernameDB(String usernameDB) {
        this.usernameDB = usernameDB;
    }

    public String getPasswordDB() {
        return passwordDB;
    }

    public void setPasswordDB(String passwordDB) {
        this.passwordDB = passwordDB;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public boolean isConnectionWorks() {
        return connectionWorks;
    }

    public void setConnectionWorks(boolean connectionWorks) {
        this.connectionWorks = connectionWorks;
    }
}   
