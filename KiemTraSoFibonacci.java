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
public class KiemTraSoFibonacci {
    
    public static Scanner sc = new Scanner(System.in); 
    
    public static long[] f = new long[100];
    
    public static void mang(){
        f[0]=0L;
        f[1]=1L;
        for(int i=2; i<100;i++){
            f[i]=f[i-1]+f[i-2];
        }
    }
    public static boolean ktra(long n){
        for (long i : f) {
           if(i==n){
               return true;
           }
        }
        return false;
    }
    public static void main(String[] args) {
        mang();
        int t=sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            if(ktra(n)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
