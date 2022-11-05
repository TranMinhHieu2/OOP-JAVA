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
public class DanhSachcanh {
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        int n=sc.nextInt();
        int [][] a= new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = i+1; j <= n; j++) {
                if(a[i][j]==1){
                    System.out.print("("+i+","+j+")");
                    System.out.println("");
                }
            }
        }
    }
}
