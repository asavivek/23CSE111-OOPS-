class Student {
    String name;
    int age;
    String grade;

    Student() {
        name = "Unknown";
        age = 0;
        grade = "Not Assigned";
        System.out.println("Default constructor called");
    }

    Student(String n) {
        name = n;
        age = 0;
        grade = "Not Assigned";
        System.out.println("Constructor with name: " + n + " called");
    }

    Student(String n, int a) {
        name = n;
        age = a;
        grade = "Not Assigned";
        System.out.println("Constructor with name: " + n + " and age: " + a + " called");
    }

    Student(String n, int a, String g) {
        name = n;
        age = a;
        grade = g;
        System.out.println("Constructor with name: " + n + ", age: " + a + ", and grade: " + g + " called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}

public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Alice");
        Student s3 = new Student("Bob", 15);
        Student s4 = new Student("Charlie", 16, "A");

        System.out.println("\nStudent Details:");
        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}