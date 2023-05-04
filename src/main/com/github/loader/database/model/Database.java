package main.com.github.loader.database.model;

public enum Database {
    MONGO("MONGO"),
    MYSQL("MYSQL"),
    POSTGRESQL("POSTGRESQL"),
    MARIADB("MARIADB");

    private final String name;

    Database(String name) {
        this.name = name;
    }

    public String getDatabaseName() {
        return name;
    }
}
