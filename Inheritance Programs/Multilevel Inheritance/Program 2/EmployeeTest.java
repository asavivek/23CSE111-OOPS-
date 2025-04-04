// Base class
class Employee {
    String name;
    String employeeId;

    Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    String getDetails() {
        return "Name: " + name + ", ID: " + employeeId;
    }
}

// Derived class
class Manager extends Employee {
    String department;

    Manager(String name, String employeeId, String department) {
        super(name, employeeId);
        this.department = department;
    }

    String getDepartment() {
        return department;
    }
}

// Further derived class
class TeamLead extends Manager {
    int teamSize;

    TeamLead(String name, String employeeId, String department, int teamSize) {
        super(name, employeeId, department);
        this.teamSize = teamSize;
    }

    int getTeamSize() {
        return teamSize;
    }
}

// Main class to test the hierarchy
public class EmployeeTest {
    public static void main(String[] args) {
        TeamLead teamLead = new TeamLead("Alice", "TL001", "Development", 5);
        System.out.println(teamLead.getDetails() + ", Department: " + teamLead.getDepartment() + ", Team Size: " + teamLead.getTeamSize());
    }
}