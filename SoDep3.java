package codeptit;

import java.util.Scanner;


public class SoDep3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            String re = new StringBuffer(s).reverse().toString();

            if (!re.equals(s) ) System.out.println("NO");
            else {
                int check=1;
                for (int i = 0; i < s.length(); i++) {
                    if(s.charAt(i)!='2' && s.charAt(i)!='3'&& s.charAt(i)!='5'&& s.charAt(i)!='7'){
                        check=0;
                        break;
                    }
                }
                if (check==1) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
