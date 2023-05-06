/*
 * Copyright (c) 2023.
 *
 * TODO
 */

package ga.zumito.framework.java.database.connection;

import ga.zumito.framework.java.database.impl.IConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection implements IConnection {
	private Connection connection;

	@Override
	public void start() {
		String url = "test";
		String user = "test";
		String password = "";

		try {
			DriverManager.getConnection(url, user, password);
			System.out.print("MYSQL is connected to " + url);
		} catch (SQLException e) {
			System.out.print(e.getMessage());
		}
	}

	@Override
	public void stop() {
		try {
			connection.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Connection getConnection() {
		return connection;
	}
}