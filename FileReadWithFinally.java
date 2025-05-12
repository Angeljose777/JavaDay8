// File: FileReadWithFinally.java

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadWithFinally {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("Reader closed successfully.");
                }
            } catch (IOException e) {
                System.out.println("Error closing the reader: " + e.getMessage());
            }
        }
    }
}

