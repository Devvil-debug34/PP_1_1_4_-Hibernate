package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String DB = "jdbc:mysql://localhost:3306/user_bd";
    private static final String USER = "root";
    private static final String PASSWORD = "rootroot";



    public static Connection getConnection() {
        try{
            return DriverManager.getConnection(DB, USER, PASSWORD);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
