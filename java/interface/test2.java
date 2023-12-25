interface m1{
    int x=89;
    void print();
}
interface m2{
    int y=94;
    void print2();
}
class m3 implements m1,m2{
    public void print(){
        System.out.println("marks of m1"+" "+x);
    }
    public void print2(){
        System.out.println("marks of m2"+" "+y);

    }
}
class test2{
    public static void main(String args[]){
        m3 obj=new m3();
        obj.print();
        obj.print2();

    }
}
