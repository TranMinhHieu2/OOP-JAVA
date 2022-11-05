package codeptit;

import java.util.Scanner;

public class RutGonXauKyTu {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        String s=sc.next();
        while (true){
            int check=0;
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i)==s.charAt(i+1)){
                    s=s.substring(0,i)+s.substring(i+2,s.length());
                    check=1;
                    break;
                }
            }
            if(check==0){
                break;
            }
        }
        if(s.isEmpty()){
            System.out.println("Empty String");
        }
        else{
            System.out.println(s);
        }
    }
}
