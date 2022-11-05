package codeptit;

import java.util.Scanner;

class pso{
    private long tu,mau;
    public pso(){
        tu=0;
        mau=1;
    }
    public pso(long tu, long mau){
        this.tu=tu;
        this.mau=mau;
    }

    public long getMau() {
        return mau;
    }

    public void setMau(long mau) {
        this.mau = mau;
    }

    public long getTu() {
        return tu;
    }

    public void setTu(long tu) {
        this.tu = tu;
    }

    public long ucln(long tu, long mau){
        while (mau!=0){
            long x=tu%mau;
            tu=mau;
            mau=x;
        }
        return tu;
    }
    public void rutgonpso(){
        long tmp=ucln(this.tu,this.mau);
        this.tu/=tmp;
        this.mau/=tmp;
    }

}
public class phanso {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        pso P=new pso(sc.nextLong(), sc.nextLong());
        P.rutgonpso();
        System.out.println(P.getTu()+"/"+P.getMau());
    }
}
