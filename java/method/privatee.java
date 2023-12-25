class info{
    private String name="ramsingh";
    private int age=21;
    String getName(){ //private declaration can access by only methods int the same class declaration
        return name;
    }
    int getAge(){
        return age;
    }
}
public class privatee {
    public static void main(String[] args) {
        info obj=new info();
        String r1=obj.getName();
        int r2=obj.getAge();
        System.out.println(r1);
        System.out.println(r2);

    }
}