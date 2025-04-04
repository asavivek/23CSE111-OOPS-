public class DatabaseQuery {

    // 1. Search by ID
    public String buildQuery(int id) {
        return "SELECT * FROM users WHERE id = " + id;
    }

    // 2. Search by name (overloaded)
    public String buildQuery(String name) {
        return "SELECT * FROM users WHERE name = '" + name + "'";
    }

    // 3. Search by name and age (overloaded)
    public String buildQuery(String name, int age) {
        return "SELECT * FROM users WHERE name = '" + name + "' AND age = " + age;
    }

    public static void main(String[] args) {
        DatabaseQuery db = new DatabaseQuery();

        System.out.println(db.buildQuery(101)); // Search by ID
        System.out.println(db.buildQuery("Alice")); // Search by name
        System.out.println(db.buildQuery("Bob", 30)); // Search by name & age
    }
}