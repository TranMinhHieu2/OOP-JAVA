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

public class TongGiaiThua {
    
    public static Scanner sc = new Scanner(System.in);
    
    public static void tinh(){
        int n = sc.nextInt();
        long su = 0, tmp = 1;       
        for (int i = 1; i <= n; i++) {
            tmp*=i;
            su+=tmp;
        }
        System.out.println(su);
    }
    public static void main(String[] args) {
        tinh();
    }
}
