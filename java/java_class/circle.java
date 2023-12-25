import java.util.*;
class circlearea{
    int radius;

double findarea(){
    return 3.14*radius*radius;
}
double findcircumstance(){
    return 2*3.14*radius;
}
}
/**
 * circle
 */
public class circle {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the radius of a circle");
        int r=sc.nextInt();
        circlearea obj=new circlearea();
        obj.radius=r;
      double r2=obj.findarea();
      double r3=  obj.findcircumstance();
    System.out.println(r2+r3);
}
}