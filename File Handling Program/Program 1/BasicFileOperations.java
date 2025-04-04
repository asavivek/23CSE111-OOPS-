import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BasicFileOperations {
    public static void main(String[] args) {
        String fileName = "example.txt";
        
        // Create a new file
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating file.");
            e.printStackTrace();
        }
        
        // Write to file
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, this is line 1.\nThis is line 2.\nLine 3.");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file.");
            e.printStackTrace();
        }
        
        // Read from file
        try {
            File file = new File(fileName);
            Scanner reader = new Scanner(file);
            System.out.println("\nFile content:");
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading file.");
            e.printStackTrace();
        }
        
        // Delete file
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("\nDeleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}