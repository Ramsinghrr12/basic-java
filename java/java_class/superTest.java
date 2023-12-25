import java.util.Scanner;

class test2{
    int id;
    String name="ramu";
}

   class test3 extends test2{
        int id;
    String name="ramsingh";
        int age;
        void display(){
            System.out.println(id+""+super.name+""+age);
        }
        
    }
public class superTest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        test3 obj=new test3();
        obj.id=200003;
        obj.age=21;
        obj.display();
    }
    
}
