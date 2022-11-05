package codeptit;

import java.util.Scanner;

public class UocSoChungLonNhatCuaSoNguyenLon {
    static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            String ss=sc.nextLine();
            String s=sc.nextLine();
            long res=0l;
            for(int i=0;i<s.length();i++){
                res=(res*10+(s.charAt(i)-48))%n;
            }
            while (n!=0){
                long tmp=res%n;
                res=n;
                n=tmp;
            }
            System.out.println(res);
        }
    }
}
