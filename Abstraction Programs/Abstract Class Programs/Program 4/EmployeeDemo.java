abstract class Employee {
    String name;
    double salary;

    Employee(String n, double s) {
        name = n;
        salary = s;
    }

    // Abstract method
    abstract double calculateBonus();

    // Concrete method
    void display() {
        System.out.println("Employee: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("Bonus: $" + calculateBonus());
    }
}

class Manager extends Employee {
    Manager(String n, double s) {
        super(n, s);
    }

    double calculateBonus() {
        return salary * 0.20; // 20% bonus
    }
}

class Developer extends Employee {
    Developer(String n, double s) {
        super(n, s);
    }

    double calculateBonus() {
        return salary * 0.15; // 15% bonus
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp1 = new Manager("John", 80000);
        Employee emp2 = new Developer("Alice", 60000);

        emp1.display();
        emp2.display();
    }
}