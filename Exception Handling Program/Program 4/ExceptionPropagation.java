import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionPropagation {
    public static void main(String[] args) {
        try {
            readFile("nonexistent.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found error caught in main():");
            System.out.println(e.getMessage());
        }
        
        try {
            processData("123");
            processData("abc"); // This will cause NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("\nNumber format error caught in main():");
            System.out.println(e.getMessage());
        }
    }
    
    // Method declares it throws FileNotFoundException
    public static void readFile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        System.out.println("File content: " + scanner.nextLine());
        scanner.close();
    }
    
    // Exception propagates up the call stack
    public static void processData(String input) {
        int number = Integer.parseInt(input);
        System.out.println("Processed number: " + (number * 2));
    }
}