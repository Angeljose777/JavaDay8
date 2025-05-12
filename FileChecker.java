// File: FileChecker.java

import java.io.File;

public class FileChecker {
    public static void main(String[] args) {
        String filePath = "example.txt"; // You can change the path
        try {
            checkFileExists(filePath);
            System.out.println("File exists.");
        } catch (FileMissingException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
    }

    public static void checkFileExists(String filePath) throws FileMissingException {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileMissingException("File not found at path: " + filePath);
        }
    }
}

