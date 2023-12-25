
interface animal{
    void makeSound();
}
interface bird{
    void sound();
}
class dog implements animal{
    public void makeSound(){
        System.out.println("bow-bow");
    }
}
class cat implements animal{
    public void makeSound(){
        System.out.println("meow-meow");
    }
    class tiger implements animal,bird{
        public void makeSound(){
            System.out.println("ekhrhkfekjd");
        }
        public void sound(){
            System.out.println("bird and cat");
        }

    }
}
public class testinterfac{
    public static void main(String args[]){
        dog sound=new dog();
        sound.makeSound();
        cat sound2=new cat();
        sound2.makeSound();
    tiger se=new tigrer();


    }
}