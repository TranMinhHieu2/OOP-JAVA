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
public class ChuSo4va7 {
    public static Scanner sc = new Scanner(System.in);
     
    public static void main(String[] args) {
        String s =sc.next();
        int a=0, b=0;
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(c=='4'){
                a++;
            }
            else if(c=='7'){
                b++;
            }
        }
        if(a+b==7 || a+b==4){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
