import java.util.Scanner;

class student{
int id;
String name;
student(){
    id=0;
    name="";
}
student(int id,String name){
    this.id=id;
    this.name=name;//this will use here when it has name type parrameters in the declaration also
}
void print(){ 
    System.out.println(id+" "+name);
    
}
}
public class thisss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter the name and id");
        int id=sc.nextInt();
        String name=sc.next();
        student obj=new student(id,name);
        student obj1=new student(1,"ramsingh");
        student obj2=new student(2,"nagaraju");
        student obj3=new student(3,"pranay");
        obj.print();
        obj1.print();
        obj2.print();
        obj3.print();
    }
    
}
