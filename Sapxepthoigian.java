package codeptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class time implements Comparable<time> {
    private int gio, phut, giay;

    public time() {

    }

    public time(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public int getGio() {
        return gio;
    }

    public void setGio(int gio) {
        this.gio = gio;
    }

    public int getPhut() {
        return phut;
    }

    public void setPhut(int phut) {
        this.phut = phut;
    }

    public int getGiay() {
        return giay;
    }

    public void setGiay(int giay) {
        this.giay = giay;
    }

    @Override
    public String toString() {
        return gio + " " + phut + " " + giay;
    }

    @Override
    public int compareTo(time o) {
        int res1 = gio * 3600 + phut * 60 + giay;
        int res2 = o.getGio() * 3600 + o.getPhut() * 60 + o.getGiay();
        return res1-res2;
    }
}

public class Sapxepthoigian {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        ArrayList<time> list= new ArrayList<>(t);
        while (t-->0){
            int gio=sc.nextInt();
            int phut=sc.nextInt();
            int giay= sc.nextInt();
            time Time=new time(gio,phut,giay);
            list.add(Time);
        }
        Collections.sort(list);
        for (time i: list) {
            System.out.println(i);
        }
    }
}
