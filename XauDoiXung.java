package codeptit;

import java.util.Scanner;

public class XauDoiXung {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        String dd = sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            int l = s.length();
            int cnt = 0;
            for (int i = 0; i < l / 2; i++) {
                if (s.charAt(i) != s.charAt(l - i - 1)) {
                    cnt++;
                }
            }
            if (cnt == 1 && l % 2 == 0) {
                System.out.println("YES");
            } else if (cnt <= 1 && l % 2 == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
