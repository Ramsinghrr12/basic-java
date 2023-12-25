package method;
import java.util.Scanner;
class facat{
    public int f(int num) {
        if(num==0 || num==1){
            return 1;
        }
        else{
            return num*f(num-1);
        }


    }
}
public class factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number to get a factorial");
        int x=s.nextInt();
        facat obj=new facat();
        int res=obj.f(x);
        System.out.println("fctorisl is:"+res);

    }
    
}
