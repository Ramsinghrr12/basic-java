import java.util.*;
class cal{
    int  add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
double add(double a,double b){
        return a+b;
    }
}
public class add_poly {
    public static void main(String[] args) {
    System.out.println("enetr the values of a ndb");

Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int z=sc.nextInt();
    cal obj=new cal();
   int res1=obj.add(x,y);
   System.out.println(res1);
  int res2= obj.add(x,y,z);
     System.out.println(res2);
   int res3=obj.add(x,y);
   System.out.println(res3);
   
    }
}
