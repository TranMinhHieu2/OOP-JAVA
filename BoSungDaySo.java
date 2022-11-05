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
public class BoSungDaySo {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int[] dd = new int[205];
        int max = 0;
        for (int i = 0; i < n; i++) {
            int x = ip.nextInt();
            max = Math.max(max, x);
            dd[x] = 1;
        }
        boolean excellent = true;
        for (int i = 1; i <= max; i++) {
            if (dd[i] == 0) {
                System.out.println(i);
                excellent = false;
            }
        }
        if (excellent) {
            System.out.println("Excellent!");
        }
    }
}
