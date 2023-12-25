import java.util.Scanner;

abstract class details{
    abstract void printInfo();
}
class info extends details{
    String name;
    int id;
    int salary;
     void printInfo(){
    System.out.println(name+" "+id+""+salary);
 }

}
public class abstInfo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        info obj=new info();
        obj.name="ramsingh";
        System.out.println("enter the id of an employee");
        obj.id=sc.nextInt();
        obj.salary=10000000;
        obj.printInfo();
    }
    
}
