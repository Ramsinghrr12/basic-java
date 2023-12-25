class outer{
    static  double length; 
    static  double width;
    outer(double l,double w){
        length=l;
        width=w;
    }
    double area(){
        return length*width;
    }
   static class inner{
    private double rate;
    inner(double r){
        rate=r;
    }

    void displayinner(){
        System.out.println("faancing cost is:"+rate*2*(length+width));
    }

    }
}
public class nestedstatic_class {
public static void main(String[] args) {
    outer.inner obj=new outer.inner(10);
    outer obj1=new outer(40,30);
    System.out.println("area is:"+obj1.area());
    obj.displayinner();
}
}
