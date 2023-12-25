import java.util.*;
class load{
    void mymethod(){
        System.out.println("no value to return");
    }
    void mymethod(int n){
        System.out.println("num:"+n);
    }
    void mymethod(int n,int m){
        System.out.println("num is:"+n+m );
    }
    void mymethod(double n,double m){
        System.out.println("num is:"+n+m);
    }
}
public class overload {
    public static void main(String[] args) {
        load obj=new load();
        obj.mymethod();
        obj.mymethod(1);
        obj.mymethod(2,3);
        obj.mymethod(9.8,9.5);
    }
}
