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
public class MangDoiXung {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t =sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int [] a = new int [n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int h=0;
            for(int i=0;i<n/2;i++){
                if(a[i]!=a[n-i-1]){
                    h=1;
                }
            }
            if(h==0){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
