package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class hellofile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Hello.txt");
        Scanner read = new Scanner(file);
        while (read.hasNextLine()){
            String data= read.nextLine();
            System.out.println(data);
        }
    }
}
