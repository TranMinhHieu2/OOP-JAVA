package codeptit;

import java.util.HashMap;
import java.util.Scanner;

public class DienThoaiCucGach {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<Character, String > hm = new HashMap<Character, String>();
        hm.put('a',"2");    hm.put('b',"2");    hm.put('c',"2");
        hm.put('d',"3");    hm.put('e',"3");    hm.put('f',"3");
        hm.put('g',"4");    hm.put('h',"4");    hm.put('i',"4");
        hm.put('j',"5");  hm.put('k',"5");  hm.put('l',"5");
        hm.put('m',"6");  hm.put('n',"6");  hm.put('o',"6");
        hm.put('p',"7");  hm.put('q',"7");  hm.put('r',"7");  hm.put('s',"7");
        hm.put('t',"8");  hm.put('u',"8");  hm.put('v',"8");
        hm.put('w',"9");  hm.put('x',"9");  hm.put('y',"9");  hm.put('z',"9");
        int t= sc.nextInt();
        while (t-->0){
            String s=sc.next();
            s=s.toLowerCase();
            String ss="";
            for(int i=0;i<s.length();i++){
                ss+=hm.get(s.charAt(i));
            }
            if(ss.equals(new StringBuilder(ss).reverse().toString())) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
