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
public class HopCuaHaiDaySo {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] a = new int[1001];
        int x;
        for (int i = 0; i < n; i++) {
            x= sc.nextInt();
            a[x]=1;
        }
        for (int i = 0; i < m; i++) {
            x= sc.nextInt();
            a[x]=1;
        }
        for (int i = 0; i < 1001; i++) {
            if(a[i]==1)
                System.out.print(i+" ");
        }
    }
}
