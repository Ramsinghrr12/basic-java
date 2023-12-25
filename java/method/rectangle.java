package method;
import java.util.Scanner;
class rect{
    public int rec(int l,int b){  //area of reacytangle
        int r1=l*b;
        return r1;   
    }
    public int permiter(int l,int b) {
        int r2=2*(l+b);
        return r2;
    }
}

public class rectangle {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("enter the length of a rectangle");
       int len=s.nextInt();
       System.out.println("enter the breadth of arectangle");
       int bre=s.nextInt();
       rect obj=new rect();
       int res1=obj.rec(len, bre);
       System.out.println("area is:"+res1);
       int res2=obj.permiter(len,bre);
       System.out.println("perimeter is:"+res2);

    }
}
