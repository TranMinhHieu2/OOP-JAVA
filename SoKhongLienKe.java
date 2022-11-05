/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.lang.Math;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SoKhongLienKe {
    public static Scanner sc= new Scanner(System.in);
    
    public static void main(String[] args) {
        int t= sc.nextInt();
        while(t-->0){
            String s= sc.next();
            int sum=s.charAt(0)-48;
            int h=-1;
            for(int i=1;i<s.length();i++){
                char c=s.charAt(i);
                char x=s.charAt(i-1);
                sum+=c-48;
                if(Math.abs(c-x)!=2){
                   h=0; 
                }
            }
            if(h==-1 && sum%10==0){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
