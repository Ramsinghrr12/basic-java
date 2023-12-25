class bike{
    final void run(){
        System.out.println("it is running at speed 90");
    }

}
class honda extends bike{
    void run(){
        System.out.println("it is running at speed 120");
    }
}
class finalMethod{
    public static void main(String args[]){
        honda obj=new honda();
        obj.run();
    }
}