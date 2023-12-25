import java.util.Scanner;
class emp{
    public String name(String na){
        return na;
    }
    public int salry(int sal){
        return sal;
    }
    public String dept(String de){
        return de;
    }

}

public class employee {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the employee name");
        String x=s.next();
        System.out.println("enter the salary of a employee");
        int y=s.nextInt();
        System.out.println("enter the department ");
        String z=s.next();
        emp obj=new emp();
        String r=obj.name(x);
        System.out.println("name is:"+r);
        int sc=obj.salry(y);
        System.out.println("salary is"+sc);
        String t=obj.dept(z);
        System.out.println("department"+t);
        



    }
}
