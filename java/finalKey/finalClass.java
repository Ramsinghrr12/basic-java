final class b{
    class honda extends b{
        void run(){
            System.out.println("fast");
        }
    }
}
class finalClass{
    public static void main(String args[]){
        honda obj=new honda();
        obj.run();
    }
}