package codeptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class TapTuRiengCuaHaiXau {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        String dd= sc.nextLine();
        while(t-->0){
            ArrayList<String> res = new ArrayList<String>();
            HashMap<String, Integer> hm = new HashMap<String, Integer>();
            String s1[]=sc.nextLine().split(" ");
            String s2[]=sc.nextLine().split(" ");
            for(int i=0;i< s2.length;i++){
               hm.put(s2[i], 1);
            }
            for(int i=0;i<s1.length; i++){
                if(!hm.containsKey(s1[i])){
                    res.add(s1[i]);
                    hm.put(s1[i], 1);
                }
            }
            Collections.sort(res);
            for(String i : res){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
