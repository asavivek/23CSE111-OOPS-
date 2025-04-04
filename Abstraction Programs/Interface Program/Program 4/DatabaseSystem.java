interface Database {
    void connect();
    void disconnect();
}

abstract class AbstractDatabase implements Database {
    abstract void logConnection(String message);
    
    public void connect() {
        logConnection("Database connected.");
    }

    public void disconnect() {
        logConnection("Database disconnected.");
    }
}

class MySQLDatabase extends AbstractDatabase {
    void logConnection(String message) {
        System.out.println("MySQL Log: " + message);
    }
}

class MongoDB extends AbstractDatabase {
    void logConnection(String message) {
        System.out.println("MongoDB Log: " + message);
    }
}

public class DatabaseSystem {
    public static void main(String[] args) {
        Database mysql = new MySQLDatabase();
        Database mongo = new MongoDB();

        mysql.connect();
        mongo.disconnect();
    }
}