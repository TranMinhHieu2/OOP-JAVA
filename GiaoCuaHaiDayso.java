/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;
import java.util.Arrays;
public class GiaoCuaHaiDayso {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] a = new int[n];
        int [] b = new int[m];
        int res[] = new int[1001];
        for (int i = 0; i < n; i++) {
            a[i]= sc.nextInt();
            res[a[i]]=1;
        }
        for (int i = 0; i < m; i++) {
            b[i]=sc.nextInt();
        }
        Arrays.sort(b);
        for (int i = 0; i < m; i++) {
            if(res[b[i]]==1){
                System.out.print(b[i]+" ");
                res[b[i]]=0;
            }
        }
    }
}
