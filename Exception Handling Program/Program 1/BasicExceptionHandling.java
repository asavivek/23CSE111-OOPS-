public class BasicExceptionHandling {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        
        try {
            // This will throw ArrayIndexOutOfBoundsException
            System.out.println("Element at index 3: " + numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException:");
            System.out.println("Message: " + e.getMessage());
            System.out.println("Stack Trace:");
            e.printStackTrace();
        }
        
        try {
            // This will throw ArithmeticException
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("\nCaught ArithmeticException:");
            System.out.println("Message: " + e.getMessage());
        }
        
        System.out.println("\nProgram continues after exceptions...");
    }
}