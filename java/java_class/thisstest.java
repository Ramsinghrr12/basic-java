import java.util.*;
class test1{
    int id;
    int age;
    String name="ramsingh";
    test1(){
    this.id=id;
    this.age=age;
    this.name=name;
    }
    void display(){
        System.out.println(id+""+age+""+name);
    }
}
public class thisstest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        test1 obj=new test1();
        obj.id=sc.nextInt();
        obj.age=sc.nextInt();
        obj.name=sc.next();
        obj.display();

        
    }
    
}
