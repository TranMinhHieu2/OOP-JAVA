package codeptit;

import java.math.BigInteger;
import java.util.Scanner;

public class HieuSoNguyenLon2 {
    static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {

            String a =sc.next();
            String b= sc.next();
            BigInteger s1= new BigInteger(a);
            BigInteger s2= new BigInteger(b);
            BigInteger c=s1.subtract(s2);
            StringBuilder res=new StringBuilder(c.toString());
            System.out.println(res);
    }
}
