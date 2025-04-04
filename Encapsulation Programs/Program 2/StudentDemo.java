public class Student {
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        setName(name); // Use setter for validation
        setAge(age);
        setGpa(gpa);
    }

    // Getter methods
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getGpa() { return gpa; }

    // Setter methods with validation
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name!");
        }
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Invalid GPA!");
        }
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20, 3.8);
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("GPA: " + student.getGpa());

        student.setGpa(4.5); // Invalid input
    }
}