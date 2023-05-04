package main.com.github.loader.database.connection;

import main.com.github.loader.database.impl.IConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection implements IConnection{

    @Override
    public void start() {
        String url = "test";
        String user = "test";
        String password = "";

        try {
            DriverManager.getConnection(
                    url,
                    user,
                    password);
            System.out.print("MYSQL is connecte to " + url);
        } catch (SQLException e){
            System.out.print(e);
        }
    }

    @Override
    public void stop() {
        Connection connection = null;
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
