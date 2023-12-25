import java.util.*;
abstract class shape{
    abstract  float  getArea();
}
class triangle extends shape{
    int  side;
    triangle(int side){
        this.side=side;
        
    }
    float getArea(){
        return (side*side*side);
    }
    

}
class rectangle extends shape{
    int l,b;
 rectangle(){

    this.l=l;
    this.b=b;
   }
   
    float getArea(){
        return (l*b);
    }
}
class abstractForm{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        triangle obj2=new triangle(10);
        rectangle obj=new rectangle();
        System.out.println("enter the lenght and breadth");
        obj.l=sc.nextInt();
        obj.b=sc.nextInt();
        System.out.println("rectangle:"+obj.getArea());
        System.out.println("triangle:"+obj2.getArea());
    }
}