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
public class TinhTong {
    public static Scanner sc = new Scanner(System.in);
    public static void slove(){
        long n = sc.nextLong();
        long s = n*(n+1)/2;
        System.out.println(s);
    }
    public static void main(String[] args) {
        int t =sc.nextInt();
        while(t-->0){
            slove();
        }
    }
}
