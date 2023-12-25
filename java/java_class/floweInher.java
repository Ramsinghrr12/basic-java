import java.util.Scanner;

class flower{
    String name;
    String colour;
    String smell;
    void print(){
        System.out.println(name+""+colour+""+smell);
    }
}
    class rose extends flower{
        int price;
        void print(){
        System.out.println(name+""+colour+""+smell+""+price);
    }

    }
    class jasmine extends rose{
        int price;
        String behaviour;
            void print(){
        System.out.println(name+""+colour+""+smell+""+behaviour);
    }

        
    }


public class floweInher {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        jasmine obj=new jasmine();
        rose obj2=new rose();
        System.err.println("enter the colour smell name price for rose ");
        obj2.name=sc.next();
        obj2.colour=sc.next();
        obj2.smell=sc.next();
        obj2.price=sc.nextInt();
        obj2.print();
        System.err.println("enter the colour smell name price for jasmine");
        obj.name=sc.next();
        obj.colour=sc.next();
        obj.smell=sc.next();
        obj.price=sc.nextInt();
        obj.behaviour=sc.next();
        obj.print();





    }
    
}
