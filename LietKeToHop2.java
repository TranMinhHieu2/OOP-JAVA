/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class LietKeToHop2 {

    static Scanner sc = new Scanner(System.in);
    static int n, k, a[] = new int[15], cnt = 0;

    static void Try(int i) {
        for (int j = a[i - 1] + 1; j <= n - k + i; j++) {
            a[i] = j;
            if (i == k) {
                for (int l = 1; l <= k; l++) {
                    System.out.print(a[l]);
                }
                System.out.print(" ");
                cnt++;
            } else {
                Try(i + 1);
            }
        }
    }

    public static void main(String[] args) {
        n = sc.nextInt();
        k = sc.nextInt();
        Try(1);
        System.out.println("");
        System.out.println("Tong cong co " + cnt + " to hop");
    }
}
