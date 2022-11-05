/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;
import java.lang.Math;
        
public class SoChinhPhuong {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a = (int)Math.sqrt(n);
            if(n==a*a){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
