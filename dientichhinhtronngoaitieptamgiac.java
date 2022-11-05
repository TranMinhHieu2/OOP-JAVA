package codeptit;
import java.util.*;
import java.lang.Math;
class Ppppoint{
    private double x, y;
    Ppppoint(){
        this.x = 0F;
        this.y = 0F;
    }
    Ppppoint(double a, double b){
        this.x = a;
        this.y = b;
    }
    Ppppoint(Ppppoint p){
        this.x = p.x;
        this.y = p.y;
    }
    double getX(){
        return this.x;
    }
    double getY(){
        return this.y;
    }
    double distance(Ppppoint p){
        return Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y));
    }
    static double distance(Ppppoint p1, Ppppoint p2){
        return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
    }
}
public class dientichhinhtronngoaitieptamgiac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            Ppppoint A = new Ppppoint(in.nextDouble(), in.nextDouble());
            Ppppoint B = new Ppppoint(in.nextDouble(), in.nextDouble());
            Ppppoint C = new Ppppoint(in.nextDouble(), in.nextDouble());
            double d1 = A.distance(B);
            double d2 = A.distance(C);
            double d3 = B.distance(C);
            if(d1 + d2 > d3 && d1 + d3 > d2 && d2 + d3 > d1){
                double s=(1/4f)*Math.sqrt((d1+d2+d3)*(d1+d2-d3)*(d2+d3-d1)*(d1-d2+d3));
                double r=((d1*d2*d3)/(4*s));
                double ss=(Math.PI)*r*r;
                System.out.printf("%.3f\n", ss);
            }
            else{
                System.out.println("INVALID");
            }
        }
    }
}


