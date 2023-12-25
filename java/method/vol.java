package method;

import java.util.Scanner;

 class voll {
    public double area(double n,double m){
        return (3.14*n)*m;
    }

}
class vol{
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enetr the lengh and breadth");
        double a=s.nextInt();
        double b=s.nextInt();
        voll obj=new voll();
     double res=obj.area(a, b);
        System.out.println(res);
    }
}
