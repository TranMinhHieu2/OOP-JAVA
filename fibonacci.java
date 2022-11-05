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
public class fibonacci {
    
    public  long  tinhfibo(int n){
        long[] f = new long[100];
        f[1]=f[2]=1l;
        for(int i=3; i<=92;i++){
            f[i]=f[i-1]+f[i-2];
        }
        return f[n];
    }
}
