package Exeption;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Demo3 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            InputStream in = new FileInputStream(file);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
