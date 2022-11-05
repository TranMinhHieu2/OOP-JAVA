package codeptit;

import java.util.Scanner;
//import java.lang.String;
public class SoDep2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            String re = new StringBuffer(s).reverse().toString();
            int sum=0;
            if (!re.equals(s) || s.charAt(0)!='8' || s.charAt(s.length()-1)!='8') System.out.println("NO");
            else {
                for (int i = 0; i < s.length(); i++) {
                    sum+= (int)s.charAt(i)-48;
                }
                if (sum%10==0) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
