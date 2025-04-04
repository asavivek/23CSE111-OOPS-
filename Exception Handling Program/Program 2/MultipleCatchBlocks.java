import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();
            
            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();
            
            int result = numerator / denominator;
            System.out.println("Result: " + result);
            
            String str = null;
            System.out.println("Length: " + str.length()); // Will throw NullPointerException
            
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (NullPointerException e) {
            System.out.println("Error: Null reference encountered.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("This block always executes, regardless of exceptions.");
            scanner.close();
        }
        
        System.out.println("Program execution continues...");
    }
}