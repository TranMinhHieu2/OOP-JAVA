package codeptit;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class hocsinh{
    private String name,lop,date;
    private float gpa;

    public hocsinh(){
        name="";
        gpa=0;
        date="";
        lop="";
    }
    public hocsinh(String name,String lop,String date,float gpa){
        this.name=name;
        this.lop=lop;
        this.date=date;
        this.gpa=gpa;
    }

    public String chuan(){
        try {
            SimpleDateFormat dd= new SimpleDateFormat("dd/MM/yyyy");
            Date ngay= dd.parse(date);
            return dd.format(ngay);
        }catch (ParseException e){
            System.out.println(e);
        }
        return "";
    }

    @Override
    public String toString() {
        return "B20DCCN001" + " " + name + " " + lop + " " + chuan() + " " + String.format("%.2f", gpa);
    }
}

public class khaibaolopsv {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name= sc.nextLine();
        String lop=sc.nextLine();
        String date= sc.nextLine();
        float gpa= sc.nextFloat();
        //sc.nextLine();
        hocsinh sV=new hocsinh(name,lop,date,gpa);
        System.out.println(sV);
    }
}
