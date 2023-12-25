import java.util.*;
class info{
     String name;
    int age;
    String branch;
    void display(){
        System.out.println(" "+name+","+age+","+branch);
    }
}

public class human {
    public static void main(String[] args) {
        info obj=new info();
        obj.name="ramsingh";
        obj.age=20;
        obj.branch="cse";
        obj.display();
        info r=new info();
        r.name="ramu";
        r.age=21;
        r.branch="IT";
        r.display();
        info r2=new info();
        r2.name="rajesh";
        r2.display();
        info r3=new info();
        r3.branch="cse";
       r3. display();
        
    }
}
    
