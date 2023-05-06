/*
 * Copyright (c) 2023.
 *
 * TODO
 */

package ga.zumito.framework.java.database.connection;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import ga.zumito.framework.java.database.impl.IConnection;

public class MongoConnection implements IConnection {
	private MongoClient mongoClient;
	private MongoDatabase mongoDatabase;

	@Override
	public void start() {
		String uri = "mongodb+srv://joselufupa2016:RWGBIbQ6BnJYhMWQ@cluster0.qqfu6ud.mongodb.net/test";
		String database = "db_test";

		mongoClient = MongoClients.create(uri);
		mongoDatabase = mongoClient.getDatabase(database);
	}

	@Override
	public void stop() {
		mongoClient.close();
	}

	public MongoDatabase getMongoDatabase() {
		return mongoDatabase;
	}
}