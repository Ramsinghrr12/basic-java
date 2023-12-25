class person{
    void dispaly(){
        System.out.println("iam a student");

    }
}
    class student extends person{
    void dispaly(){
            System.out.println("iam an ips officer");
        }
    }
    class employee extends student{
      void dispaly(){
            System.out.println("software employee")
        }
    }
    class overGrid{
        public static void main(String args[]){
            person obj=new person();
            student obj1=new student();
            employee obj2=new employee();
            obj.dispaly();
            obj1=dispaly();
            obj2=dispaly();
        }
    }