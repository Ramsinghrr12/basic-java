
class add1 {
    int x;
    int y;
    void print(){
        System.out.println(x+y);
    }

    
}
class add2 extends add1{
    void display(){
        System.out.println(x-y);

    }
}
class add3 extends add2{
    void display1(){
        String s1="operation done by ramsingh";
        System.out.println(s1);
        System.err.println(x*y);
    

    }
}

public class addition {
    public static void main(String[] args) {
        add3 obj=new add3();
        obj.x=10;
        obj.y=20;
        obj.print();
    obj.display(); 
    obj.display1();
    }
    
}
