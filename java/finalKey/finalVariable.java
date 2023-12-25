class bike{
    final int speed=140;
    void run(){
      int  speed=200;
    }
    void display(){
        System.out.println(speed);
    }
}
class finalVariable{
    public static void main(String args[]){
        bike obj=new bike();
        obj.display();
    }
}