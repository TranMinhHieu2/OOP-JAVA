/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Admin
 */
public class SoXaCach {

    static Scanner sc = new Scanner(System.in);
    static int n, a[];
    static boolean check[];

    static void ktra() {
        for (int i = 1; i < n; i++) {
            if (Math.abs(a[i] - a[i + 1]) == 1) {
                return;
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(a[i]);
        }
        System.out.println("");
    }

    static void Try(int i) {
        for (int j = 1; j <= n; j++) {
            if (check[j] == false) {
                check[j] = true;
                a[i] = j;
                if (i == n) {
                    ktra();
                } else {
                    Try(i + 1);
                }
                check[j] = false;
            }
        }
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            a = new int[n + 1];
            check = new boolean[n + 1];
            Try(1);
        }
    }
}
