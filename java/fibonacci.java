import java.util.Scanner;
class fibo{
    public int fib(int n){
        if(n==0 || n<2) {
            return n;
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }

}
public class fibonacci {
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number to get fibonacci serie");
        int num=s.nextInt();
        fibo obj=new fibo();
        int res=obj.fib(num);
        System.out.println("fibonacci series is:");
        for(int i=0;i<num;i++){
            System.out.println("fibo is:"+obj.fib(i));

        }
    }
}
