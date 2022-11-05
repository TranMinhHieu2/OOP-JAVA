/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class TinhSoFibonacci {
    public static Scanner sc = new Scanner(System.in);
    public static long[] f = new long[100];
    public static void mang(){
        f[1]=f[2]=1l;
        for(int i=3; i<=92;i++){
            f[i]=f[i-1]+f[i-2];
        }
    }
    public static void main(String[] args) {
        mang();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            System.out.println(f[n]);
        }
    }
}
