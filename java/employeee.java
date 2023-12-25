class personCon{
    String name;
    personCon(){
        System.out.println("this is a supper class keyword");
    }
    personCon(String name){
        this.name=name;
    }
    }
    class employeee extends personCon{
        int eId;
        employeee(){
            super();
        }
        employeee(String name,int eId){
        super(name);
        this.eId=eId;
        }
        void display(){
            System.out.println("the details are:"+name+" " +eId+"");
        }
            public static void main(String[] args) {
                employeee obj=new employeee();
                employeee obj2=new employeee("ramsingh",200003);
                obj.display();
                obj2.display();
            }
        }
    