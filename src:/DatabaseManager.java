package Game;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    private String url = "jdbc:mysql://localhost:3306/dating_simulator";
    private String user = "username";
    private String password = "password";

    public Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    // Implement save and load methods as needed
}
