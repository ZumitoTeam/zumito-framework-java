package main.com.github.loader;

import main.com.github.loader.database.DatabaseManager;
import main.com.github.loader.database.model.Database;

import java.util.Scanner;

public class Loader {
    public static void main (String[] args){
        String token;
        String databaseName;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Put your bot token here: ");
        token = scanner.next();

        System.out.print("Select db (MYSQL/MONGODB/MARIADB/POSTGRESS): ");
        databaseName = scanner.next();
        Database.valueOf(databaseName);

        System.out.print("Bot token: "
                + token
                + "\n"
                + "Database: "
                + databaseName);
    }
}
