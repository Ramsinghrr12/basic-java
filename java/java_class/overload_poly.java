import java.util.Scanner;

class employee{
    String name;
    int id;
    void salary(){
        System.out.println("salary is:");
    }
}
class weekly extends employee{
    void display(int n){
        System.out.println(n*10000);

    }
}
class  hours extends weekly{
    void display1(int m){
        System.out.println(m*1000);
    }
}
public class overload_poly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter the number of weeks");
        int a=sc.nextInt();
        System.out.println("enetr the number of hours:");
        int b=sc.nextInt();
        hours obj=new hours();
        obj.id=200003;
        obj.name="Ramsingh";
                obj.salary();

        obj.display1(a);
        obj.display(b);
        //obj.salary();

    }
    
}
