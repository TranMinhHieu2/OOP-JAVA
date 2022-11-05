/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;

public class DiemCanBang {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                int x = sc.nextInt();
                a[i] = a[i - 1] + x;
            }
            boolean ok = false;
            for (int i = 1; i <= n; i++) {
                if (a[i - 1] == a[n] - a[i]) {
                    ok = true;
                    System.out.println(i);
                    break;
                }
            }
            if (!ok) {
                System.out.println(-1);
            }
        }
    }
}
