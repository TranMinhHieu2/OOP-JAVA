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
public class MatranNhiPhan {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = in.nextInt(), cnt = 0, a, b, c;
        for (int i = 0; i < n; i++) {
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            if (a + b + c >= 2) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
