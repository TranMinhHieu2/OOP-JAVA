package codeptit;

import java.util.Scanner;

public class so_dep1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            String re = new StringBuffer(s).
                    reverse().toString();
            if (!re.equals(s)) System.out.println("NO");
            else {
                int check = 0;
                for (int i = 0; i < s.length(); i++) {
                    if(s.charAt(i) != '0' && s.charAt(i) != '2' && s.charAt(i) != '4' && s.charAt(i) != '6' && s.charAt(i) != '8') {
                        check = 1;
                        break;
                    }
                }
                if (check == 0) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
