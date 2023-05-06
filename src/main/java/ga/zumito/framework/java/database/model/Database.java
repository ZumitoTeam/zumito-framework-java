/*
 * Copyright (c) 2023.
 *
 * TODO
 */

package ga.zumito.framework.java.database.model;

public enum Database {
	MONGO("MONGO"), MYSQL("MYSQL"), POSTGRESQL("POSTGRESQL"), MARIADB("MARIADB");

	private final String name;

	Database(String name) {
		this.name = name;
	}

	public String getDatabaseName() {
		return name;
	}
}