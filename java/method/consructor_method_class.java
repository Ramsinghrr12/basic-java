class find{
    double length;
    double width;
    find(double l,double w){
        length=l;
        width=w;
    }
    double area(){
        return length*width;
    }
}

public class consructor_method_class {
    public static void main(String[] args) {
        find obj=new find(20.0, 50.0);
        double result;
        result=obj.area();
        //obj.area();
       System.out.println("area is :"+result);
    }
    
}
