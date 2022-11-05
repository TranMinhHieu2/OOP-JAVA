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
public class SoTamPhan {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            String s= sc.next();
            int k=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!='0'&& s.charAt(i)!='1' && s.charAt(i)!='2'){
                    k=1;
                    break;
                }
 
            }
            if(k==1){
                System.out.println("NO");
            }
            else System.out.println("YES");
        }
    }
}
