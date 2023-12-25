interface client{
    void web();
    void design();
}
abstract class tech implements client{
    public void web(){
        System.out.println("html,css,javascript");
    }
}
class tech2 extends tech{
    public void design(){
        System.out.println("green,tecg,dotney");
    }
}
class check{
    public static void main(String args[]){
        tech2 obj=new tech2();
        obj.web();
        obj.design();

    }
}
