class details{
    String name;
    int age;
 public void info(){
    System.out.println("name is:"+this.name);
    System.out.println("age is :"+this.age);
 }
}
public class student{
    public static void main(String args[]){
        details s1=new details();
        s1.name="ramsingh";
        s1.age=24;
        s1.info();
        details s2=new details();
    s2.name="tiger";
     s2.age=89;
     s2.info();

    }
}