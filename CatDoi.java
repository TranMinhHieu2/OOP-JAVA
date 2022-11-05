/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
import java.util.ArrayList;

public class CatDoi {

    public static Scanner sc = new Scanner(System.in);

    public static void slove() {
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '0' && c != '8' && c != '9' && c != '1') {
                System.out.println("INVALID");
                return;
            }
        }

        String s1 = s.replace('8', '0');
        String s2 = s1.replace('9', '0');
        int h = -1;
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) != '0') {
                h = i;
                break;
            }
        }
        if (h == -1) {
            System.out.println("INVALID");
        } else {
            System.out.println(s2.substring(h, s2.length()));
        }
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            slove();
        }
    }
}
