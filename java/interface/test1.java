interface details{
    int id=2;
    String name="ramsingh";
     void display();
    }
class deapt{
    String branch="cse";
    

    }
class details1 extends deapt implements details{
    public void display(){
        System.out.println(id+""+name+" "+branch);

    }
}
class test1{
    public static void main(String args[]){
        details1 obj=new details1();
        
        obj.display();
        obj.branch="it";
    }
}
