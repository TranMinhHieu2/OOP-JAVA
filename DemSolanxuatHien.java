/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.Arrays;
import java.util.Scanner;
public class DemSolanxuatHien {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        for(int j =1;j<=t;j++){
            int n = sc.nextInt();
            int [] a = new int[n];
            int [] x = new int[10001];
            Arrays.fill(x, 0);
            for (int i = 0; i < n; i++) {
                a[i]= sc.nextInt();
                x[a[i]]++;
            }
            System.out.println("Test "+j+":");
            for (int i : a) {
                if(x[i]!=0){
                    System.out.println(i+" xuat hien "+x[i]+" lan");
                }
                x[i]=0;
            }
        }
    }
}
