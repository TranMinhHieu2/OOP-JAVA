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
public class UocSoChiaHetCho2 {
    
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int cnt=0;
            for(int i=1; i<= Math.sqrt(n); i++){
                if(n%i==0){
                    if(i%2==0){
                        cnt++;
                    }
                    if((n/i)%2==0 && i!=Math.sqrt(n)){
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
