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
public class PhanTichThuaSoNguyenTo {
    public static Scanner sc = new Scanner(System.in);
    
    public static void slove(int k){
        int n = sc.nextInt();
        System.out.printf("Test %d: ",k);
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(n%i==0){
                int c = 0;
                while(n%i==0){
                    c++;
                    n/=i;
                }
                System.out.printf(" %d(%d)",i,c);
            }
        }
        if(n>1) System.out.printf(" %d(%d)",n,1);
        System.out.println("");
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        for(int i=1;i<=t;i++){
            slove(i);
        }
    }
}
