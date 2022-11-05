/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;
import java.util.ArrayList;

public class ChuanHoaXauHoten2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        String d = sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            s = s.toLowerCase();
            String[] l = s.split("\\s");
            ArrayList<String> a = new ArrayList<String>();
            for (String x : l) {
                if (x.length() > 0) {
                    a.add(x);
                }
            }
            for (int i = 1; i < a.size()-1 ; i++) {
                StringBuilder y = new StringBuilder(a.get(i));
                y.setCharAt(0, (char) (a.get(i).charAt(0) - 32));
                System.out.print(y + " ");
            }
            StringBuilder y = new StringBuilder(a.get(a.size() - 1));
            y.setCharAt(0, (char) (a.get(a.size() - 1).charAt(0) - 32));
            System.out.print(y + ", " + a.get(0).toUpperCase());
            System.out.println();
            System.out.println("");
        }
    }
}
