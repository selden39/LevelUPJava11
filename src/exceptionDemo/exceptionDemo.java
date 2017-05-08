package exceptionDemo;
// Checked Exception
// Runtime Exception
// Error
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class exceptionDemo {
    public static void main(String[] args) {
        try {
            readConfiguration();
        } catch (ConfigurationException e){
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Finally run always");
        }
    }

    private static void readConfiguration() throws ConfigurationException{
        try {
            List<String> strings = Files.readAllLines(Paths.get("test.txt"));
        } catch (FileNotFoundException e){
            throw new ConfigurationException("Config not found!");
        } catch (IOException e) {
            throw new ConfigurationException("IO Exception - " + e.getMessage());
        }
    }
}
