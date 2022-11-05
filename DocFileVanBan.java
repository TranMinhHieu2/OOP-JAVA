package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DocFileVanBan {
    public static void main(String[] args) throws FileNotFoundException {
        File file= new File("DATA.in");
        Scanner sc=new Scanner(file);
        long sum=0;
        while(sc.hasNext()){
            String w= sc.next();
            try {
                sum+=Integer.parseInt(w);
            }catch (Exception e){

            }
        }
        System.out.println(sum);
    }
}
