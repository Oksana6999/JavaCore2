package Exeption;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Demo2 {
    public static void main (String[] args) throws FileNotFoundException {
        File file = new File("file.txt");
        InputStream in = new FileInputStream(file);

    }

}
