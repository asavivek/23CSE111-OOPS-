public class Employee {
    private String name;
    private String id;
    private double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        setSalary(salary); // Use setter for validation
    }

    // Getter methods
    public String getName() { return name; }
    public String getId() { return id; }
    public double getSalary() { return salary; }

    // Setter with validation
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative!");
        }
    }

    // Method to apply raise (encapsulated logic)
    public void applyRaise(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
            System.out.println("Raise applied. New salary: $" + salary);
        } else {
            System.out.println("Invalid raise percentage!");
        }
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("John", "E1001", 50000);
        System.out.println("Name: " + emp.getName());
        System.out.println("ID: " + emp.getId());
        System.out.println("Salary: $" + emp.getSalary());

        emp.applyRaise(10);
        emp.setSalary(-1000); // Invalid input
    }
}