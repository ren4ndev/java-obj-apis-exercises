package exceptions;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class RethrowingExceptions {

    public static void main(String[] args) {
        rethrowException();
    }

    public static void rethrowException() {
        File file = new File("nonexistent/file.txt");
        file.createNewFile();

        //Scanner fileReader = new Scanner(file);
    }
}