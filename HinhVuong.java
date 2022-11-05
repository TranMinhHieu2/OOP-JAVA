/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
/**
 *
 * @author Admin
 */
public class HinhVuong {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int [] a = new int[4];
        int [] b = new int[4];
        for(int i=0;i<4;i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int tmp = Math.max(a[3]-a[0],b[3]-b[0]);
        System.out.println(tmp*tmp);
    }
}
