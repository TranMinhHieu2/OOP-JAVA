package codeptit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class nhanVien{
    private String name, gt, date, add, phone, ngay;

    public nhanVien(){
    }
    public nhanVien(String name, String gt,String date,String add,String phone,String ngay){
        this.name=name;
        this.gt=gt;
        this.date=date;
        this.add=add;
        this.phone=phone;
        this.ngay=ngay;
    }

    public String chuan1(){
        try {
            SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
            Date date1=sdf.parse(date);
            Date date2=sdf.parse(ngay);
            return sdf.format(date1);
        }catch (ParseException e){
            System.out.println(e);
        }
        return "";
    }

    public String chuan2(){
        try {
            SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
            Date date2=sdf.parse(ngay);
            return sdf.format(date2);
        }catch (ParseException e){
            System.out.println(e);
        }
        return "";
    }

    @Override
    public String toString() {
        return ("00001"+" "+name+" "+gt+" "+chuan1()+" "+add+" "+phone+" "+chuan2());
    }
}
public class khaibaolopnhanvien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String gt=sc.nextLine();
        String date=sc.nextLine();
        String add=sc.nextLine();
        String phone=sc.nextLine();
        String ngay=sc.nextLine();
        nhanVien nV=new nhanVien(name,gt,date,add,phone,ngay);
        System.out.println(nV.toString());
    }
}
