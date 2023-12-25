import java.util.*;
class student{
    int id;
    String name;
    static String subject="OOPS";
    student(int id,String name){
    this.id=id;
    this.name=name;
    }
    void dispaly(){
        System.out.println(id+" "+name+" "+subject);
    }
}
class staticVariable{
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
student obj[]=new student[3];
obj[0]=new student(1,"ramsingh");
obj[1]=new student(2,"nagarju");
obj[2]=new student(3,"pranay");
obj[0].dispaly();
obj[1].dispaly();
obj[2].dispaly();
    }
}