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

public class BoiChungUocChung {
    public static Scanner sc = new Scanner(System.in);
    
    public static long gcd(long a, long b){
        while(b!=0){
            long x= a % b;
            a =b;
            b= x;
        }
        return a;
    }
    public static long lcm (long a, long b){
        return a * b / gcd(a, b);
    }
    public static void main(String[] args) {
        int t= sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(lcm(a, b)+" "+gcd(a, b));
        }
    }
}  
