package codeptit;

import java.math.BigInteger;
import java.util.Scanner;

public class HieuSoNguyenLon1 {
    static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
        int t= sc.nextInt();
        while(t-->0){
            String a =sc.next();
            String b= sc.next();
            BigInteger s1= new BigInteger(a);
            BigInteger s2= new BigInteger(b);
            BigInteger c=s1.subtract(s2).abs();
            StringBuilder res=new StringBuilder(c.toString());
            int Max= Math.max(a.length(),b.length());
            while(res.length()<Max){
                res.insert(0,'0');
            }
            System.out.println(res);
        }
    }
}
