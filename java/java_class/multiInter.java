interface Eat{
    void eat();
}
interface Sleep{
  void slept();
}
class Human implements Eat,Sleep{
     public void eat(){
        System.out.println("ramu is sleeping");
     }
    public void slept(){
        System.out.println("ramu is eating");
    }
}
class multiInter{
    public static void main(String args[]){
        Human obj=new Human();
        obj.slept();
        obj.eat();
    

    }
}