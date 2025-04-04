import java.io.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int rollNumber;
    private transient String password; // transient fields are not serialized
    
    public Student(String name, int rollNumber, String password) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.password = password;
    }
    
    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNumber=" + rollNumber + 
               ", password=" + password + "]";
    }
}

public class ObjectSerialization {
    public static void main(String[] args) {
        String fileName = "student.ser";
        Student student = new Student("Alice", 101, "secure123");
        
        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(student);
            System.out.println("Object serialized and saved to " + fileName);
        } catch (IOException e) {
            System.out.println("Error during serialization.");
            e.printStackTrace();
        }
        
        // Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            Student deserializedStudent = (Student) ois.readObject();
            System.out.println("\nDeserialized Student:");
            System.out.println(deserializedStudent);
            System.out.println("Note: Password field was transient and not serialized");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization.");
            e.printStackTrace();
        }
    }
}