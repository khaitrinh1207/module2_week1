import java.sql.SQLOutput;
import java.util.Scanner;

public class QuadraticEquation {
    // phương trình bậc 2 : ax2+bx+c=0
    private double a,b,c;
    Scanner sc = new Scanner(System.in);
    public QuadraticEquation(){}
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double Delta(){
        return b*b-(4*a*c);
    }
}
