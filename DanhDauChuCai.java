package codeptit;

import java.util.HashMap;
import java.util.Scanner;

public class DanhDauChuCai {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        String s=sc.next();
        HashMap<Character, Integer> hm= new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++){
            if(!hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),1);
            }
        }
        System.out.println(hm.size());
    }
}
