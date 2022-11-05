/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;


public class SapXepChen {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int []  a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i]= sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int x=a[i], c=i-1;
            while(c>=0 && x<a[c]){
                a[c+1]=a[c];
                c--;
            }
            if(c>=-1) a[c+1]=x;
            System.out.print("Buoc "+i+":");
            for (int j = 0; j <=i; j++) {
                System.out.print(" "+a[j]);
            }
            System.out.println("");
        }
    }
}
