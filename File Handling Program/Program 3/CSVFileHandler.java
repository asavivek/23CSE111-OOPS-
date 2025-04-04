import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Employee {
    String name;
    int age;
    String department;
    
    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }
    
    @Override
    public String toString() {
        return name + "," + age + "," + department;
    }
}

public class CSVFileHandler {
    public static void main(String[] args) {
        String fileName = "employees.csv";
        List<Employee> employees = new ArrayList<>();
        
        // Add some employees
        employees.add(new Employee("John Doe", 32, "IT"));
        employees.add(new Employee("Jane Smith", 28, "HR"));
        employees.add(new Employee("Bob Johnson", 45, "Finance"));
        
        // Write to CSV file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Name,Age,Department\n");
            for (Employee emp : employees) {
                writer.write(emp.toString() + "\n");
            }
            System.out.println("CSV file created successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to CSV file.");
            e.printStackTrace();
        }
        
        // Read from CSV file
        System.out.println("\nReading CSV file:");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            boolean isHeader = true;
            while ((line = reader.readLine()) != null) {
                if (isHeader) {
                    isHeader = false;
                    continue;
                }
                String[] data = line.split(",");
                System.out.printf("Name: %-10s | Age: %-3s | Department: %-8s\n", 
                                  data[0], data[1], data[2]);
            }
        } catch (IOException e) {
            System.out.println("Error reading CSV file.");
            e.printStackTrace();
        }
    }
}