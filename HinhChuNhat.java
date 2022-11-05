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
public class HinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dai;
        int rong;
        dai = sc.nextInt();
        rong = sc.nextInt();
        if(dai<=0 || rong<=0){
            System.out.println(0);
        }
        else{
            System.out.println(2*(dai + rong) + " " + dai*rong);
        }
    }
}
