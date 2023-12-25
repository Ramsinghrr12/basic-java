
class number {
    int x=123;
    void display1(){
        System.out.println(x);
    }
}

    class s1 extends number{
        int y=456;
        void display(){
            System.out.println(y);
            //System.out.println(x);

        }

    
    }
    public class inheri {
    
        public static void main(String[] args) {
            s1 obj=new s1();
            obj.display();
            obj.display1();
        }
    }
