package codeptit;

import java.util.Scanner;

public class SoUuThe {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t= sc.nextInt();
        String dd =sc.nextLine();
        while(t-->0){
            String s= sc.nextLine();
            int ok=1, cnt=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)<'0'|| s.charAt(i)>'9') {
                    ok = 0;
                    break;
                }
                if((s.charAt(i)-48)%2==0){
                    cnt++;
                }
            }
            if(ok==0){
                System.out.println("INVALID");
                continue;
            }
            if(cnt>s.length()-cnt && cnt%2==0){
                System.out.println("YES");
            }
            else if(cnt<s.length()-cnt && (s.length()-cnt)%2==1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
