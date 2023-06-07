/*
 * Copyright (c) 2023.
 *
 * TODO
 */

package ga.zumito.framework.java;

import ga.zumito.framework.java.database.connection.MySQLConnection;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoaderHandler {

	MySQLConnection mySQLConnection = new MySQLConnection();

	public void downloadFrameWork() {
		try {
			mySQLConnection.start();

			String sql = "SELECT FILE_DATA FROM FILES WHERE FILE_NAME = 'framework.zip'";
			try (PreparedStatement stmt = mySQLConnection.getConnection().prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					InputStream input = rs.getBinaryStream("framework");

					try (OutputStream output = new FileOutputStream("framework.zip")) {
						byte[] buffer = new byte[4096];
						int bytesRead;
						while ((bytesRead = input.read(buffer)) != -1) {
							output.write(buffer, 0, bytesRead);
						}
					}

					System.out.println("El archivo se ha descargado correctamente.");
				} else {
					System.out.println("El archivo no se ha encontrado en la base de datos.");
				}
			}
		} catch (SQLException e) {
			System.out.println("Error al conectarse a la base de datos: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Error al descargar el archivo: " + e.getMessage());
		}
	}
}