package codeptit;

import java.util.Scanner;

class sinhVien{
    private String hoten,ngaysinh;
    private float d1,d2,d3;

    public sinhVien(){
        d1=d2=d3=0;
        hoten="";
    }

    public sinhVien(String hoten,String ngaysinh, float d1,float d2,float d3){
        this.hoten=hoten;
        this.d1=d1;
        this.d2=d2;
        this.d3=d3;
        this.ngaysinh=ngaysinh;
    }
    public String chuyen(){
        return (hoten+" "+ngaysinh+" "+String.format("%.1f",d1+d2+d3));
    }
    //chu y trai generate
public class khaibaolopthisinh {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            String date = sc.nextLine();
            float d1 = sc.nextFloat();
            float d2 = sc.nextFloat();
            float d3 = sc.nextFloat();
            sc.nextLine();
            sinhVien sv = new sinhVien(name, date, d1, d2, d3);
            System.out.println(sv.chuyen());
        }
    }
}