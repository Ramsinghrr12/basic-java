import java.util.Scanner;

class a{
    int id;
    String name;
    static String subject="DBMS";
static void change(){
    String subject="JAVA";
}
a(int id,String name){
    this.id=id;
    this.name=name;
}
void dispaly(){
    System.out.println(id+" "+name+" "+subject);
}
}
class methodVar{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        a.change();
        a obj=new a(1,"ramu");
        a obj2=new a(2,"tiger");
        obj.dispaly();
        obj2.dispaly();
    }
}