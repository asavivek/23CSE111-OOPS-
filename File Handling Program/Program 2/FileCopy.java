import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destFile = "destination.txt";
        
        try {
            // Create source file with some content
            FileOutputStream fosSource = new FileOutputStream(sourceFile);
            String content = "This is the source file content.\nSecond line of text.";
            fosSource.write(content.getBytes());
            fosSource.close();
            
            // Copy file
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fosDest = new FileOutputStream(destFile);
            
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fosDest.write(byteData);
            }
            
            fis.close();
            fosDest.close();
            
            System.out.println("File copied successfully from " + sourceFile + " to " + destFile);
        } catch (IOException e) {
            System.out.println("An error occurred during file copy.");
            e.printStackTrace();
        }
    }
}