package codeptit;

import java.util.Scanner;

class giaoVien{
    private String maGV,name;
    private long luong,bacluong,phucap,thunhap;

    public giaoVien(){
    }

    public giaoVien(String maGV, String name, long luong) {
        this.maGV = maGV;
        this.name = name;
        this.luong = luong;

        bacluong = Integer.parseInt(maGV.substring(2));
        if(maGV.substring(0,2).equals("HT")){
            phucap=2000000;
        } else if (maGV.substring(0,2).equals("HP")) {
            phucap=900000;
        } else if (maGV.substring(0,2).equals("GV")) {
            phucap=500000;
        }
        thunhap=luong*bacluong+phucap;
    }
    public String toString(){
        return maGV+" "+name+" "+bacluong+" "+phucap+" "+thunhap;
    }
}
public class ThuNhapGiaoVien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String maGV= sc.nextLine();
        String name=sc.nextLine();
        long luong= sc.nextLong();
        giaoVien GV= new giaoVien(maGV,name,luong);
        System.out.println(GV.toString());
    }
}
