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
public class ChuanHoaXauHoTen {
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        String d=sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            s=s.toLowerCase();
            String[] l=s.split("\\s");
            for(String x :l){
                if(x.length()>0){
                    StringBuilder y = new StringBuilder(x);
                    y.setCharAt(0,(char)(x.charAt(0)-32));
                    System.out.print(y+" ");
                }
            }
            System.out.println("");
        }
    }
}
