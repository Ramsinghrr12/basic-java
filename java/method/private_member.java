class value{
    private double length;
    private double width;
    public double area(){
        return length*width;
    }
    public void setsides(double l,double w){
        length=l;
        width=w;
    }
    public double getlength(){
        return length;
    }
    public double getwidth(){
        return width;
    }
}


public class private_member {
    public static void main(String[] args) {
        
    
    value obj=new value();
    double area1;
   obj.setsides(50.0,20.0);
   area1=obj.area();
   System.out.println(area1);
      System.out.println(obj.getlength());
      System.out.println(obj.getwidth());
    
}
}