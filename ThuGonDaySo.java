package codeptit;

import java.util.ArrayList;
import java.util.Scanner;

public class ThuGonDaySo {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        int n=sc.nextInt();
        ArrayList<Integer> res= new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            res.add(sc.nextInt());
        }
        while(true){
            int check=0;
            for(int i=0;i<res.size()-1;i++){
                if ((res.get(i)+ res.get(i+1))%2==0){
                    res.remove(i+1);
                    res.remove(i);
                    i--;
                    check=1;
                }
            }
            if(check==0){
                System.out.println(res.size());
                break;
            }
        }
    }
}
