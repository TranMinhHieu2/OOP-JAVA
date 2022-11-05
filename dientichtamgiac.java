package codeptit;
import java.util.*;
import java.lang.Math;
class Pppoint{
    private double x, y;
    Pppoint(){
        this.x = 0F;
        this.y = 0F;
    }
    Pppoint(double a, double b){
        this.x = a;
        this.y = b;
    }
    Pppoint(Pppoint p){
        this.x = p.x;
        this.y = p.y;
    }
    double getX(){
        return this.x;
    }
    double getY(){
        return this.y;
    }
    double distance(Pppoint p){
        return Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y));
    }
    static double distance(Pppoint p1, Pppoint p2){
        return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
    }
}
public class dientichtamgiac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            Pppoint A = new Pppoint(in.nextDouble(), in.nextDouble());
            Pppoint B = new Pppoint(in.nextDouble(), in.nextDouble());
            Pppoint C = new Pppoint(in.nextDouble(), in.nextDouble());
            double d1 = A.distance(B);
            double d2 = A.distance(C);
            double d3 = B.distance(C);
            if(d1 + d2 > d3 && d1 + d3 > d2 && d2 + d3 > d1){
                double s=(1/4f)*Math.sqrt((d1+d2+d3)*(d1+d2-d3)*(d2+d3-d1)*(d1-d2+d3));
                System.out.printf("%.3f\n", s);
            }
            else{
                System.out.println("INVALID");
            }
        }
    }
}

