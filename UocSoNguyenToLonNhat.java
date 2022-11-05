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
public class UocSoNguyenToLonNhat {
    public static Scanner sc = new Scanner(System.in);
    
    public static boolean snt(long a){
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if(a%i==0){
                return false;
            }
        }
        return true;
    } 
    
    public static void test() {
        long n=sc.nextLong();
        long res=0;
        for(int i=1; i<= Math.sqrt(n);i++){
            if(n%i==0){
                if(snt(n/i)){
                    System.out.println(n/i);
                    return;
                }
                if(snt(i))
                    res=i;
            }
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            test();
        }
    }
}
