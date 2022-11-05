package codeptit;

import java.util.Scanner;

public class DaoTu {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        int t=sc.nextInt();
        String dd=sc.nextLine();
        while (t-->0){
            String s []=sc.nextLine().split("\\s");
            for(int i=0;i<s.length;i++){
                StringBuilder y = new StringBuilder(s[i]);
                System.out.print(y.reverse().toString()+" ");
            }
            System.out.println();
        }
    }
}
