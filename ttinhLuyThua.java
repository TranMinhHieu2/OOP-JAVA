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
public class ttinhLuyThua {
    static Scanner sc= new Scanner(System.in);
    static final long m = 1000000007;
    static long luythua(int a,long b){
        if(b==0L){
            return 1;
        }
        long tmp=luythua(a,b/2) % m;
        if(b%2==0L){
            return tmp*tmp%m;
        }
        else return (a*tmp%m)*tmp%m;
    }
    public static void main(String[] args) {
        int a;
        long b;
        while(true){
            a=sc.nextInt();
            b=sc.nextLong();
            if(a==0 && b==0L) break;
            System.out.println(luythua(a, b));
        }
    }
}
