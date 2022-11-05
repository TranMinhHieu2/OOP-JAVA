package codeptit;

import java.util.Scanner;

class Rectange{
    private double width,height;
    private String color;
    public Rectange(){
        width=1;
        height=1;
    }
    public Rectange(double width,double height, String color){
        this.width=width;
        this.height=height;
        color=color.toLowerCase();
        color=color.substring(0,1).toUpperCase() + color.substring(1,color.length());
        this.color=color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
//        color=color.toLowerCase();
//        color=color.substring(0,1).toUpperCase() + color.substring(1,color.length());
        this.color=color;
    }
    public double findArea(){
        return this.width*this.height;
    }
    public double findPerimeter(){
        return (this.height+this.width)*2;
    }
}
public class khaibaolophinhchunhat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long width=0,hight=0;
        String color="";
        int check=0;
        try {
            width=sc.nextLong();
            hight= sc.nextLong();
            color=sc.next();
            if(width<=0||hight<=0){
                System.out.println("INVALID");
                check=1;
            }
        }catch (Exception e){
            System.out.println(e);
            check=1;
        }
        if (check==0){
            Rectange R= new Rectange(width,hight,color);
            System.out.println(String.format("%.0f %.0f %s",R.findPerimeter(),R.findArea(),R.getColor()));
        }
    }
}
