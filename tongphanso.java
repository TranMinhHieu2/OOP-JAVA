package codeptit;

import java.util.Scanner;

class tongpso{
    private long a,b;
    tongpso(){

    }
    tongpso(long a, long b){
        this.a=a;
        this.b=b;
    }

    public long getA() {
        return a;
    }

    public long getB() {
        return b;
    }

    public void setA(long a) {
        this.a = a;
    }

    public void setB(long b) {
        this.b = b;
    }
    public long ucln(long a, long b){
        while (b!=0){
            long x=a%b;
            a=b;
            b=x;
        }
        return a;
    }
    public String res(){
        long g=ucln(this.a,this.b);
        return a/g+"/"+b/g;
    }
}
public class tongphanso {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a= sc.nextLong();
        long b= sc.nextLong();
        long c= sc.nextLong();
        long d= sc.nextLong();
        tongpso tps=new tongpso(a*d+c*b,b*d);
        System.out.println( tps.res());
    }
}
