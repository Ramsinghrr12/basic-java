import java.util.Scanner;
import java.lang.Math;
class pm {
    public void p(int num) {
        for(int i=0;i<num;i++){
            int count=0;
          for(int j=1;i<=i;j++) {
            if(i%j==0){
                count=count+1;
            }
          }
          if(count==2) {
            System.out.println(i);
          }
        }
        }


    }
    public class pme{
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.println("enter the number");
            int x=s.nextInt();
            pm obj=new pm();
            obj.p(x);
        }
    }


