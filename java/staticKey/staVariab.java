class employe{
    int id;
    String name;
    static String dept="IT";
    employe(int id,String name){
        this.id=id;
        this.name=name;
    }
    void dispaly(){
        System.out.println(id+" "+name+" "+dept);
    }
}

 class staVariab {
    public static void main(String[] args) {
        employe obj=new employe(1,"ramsingh");
        employe obj2=new employe(2,"nagaraju");
        employe obj3=new employe(3,"pranay");
        obj.dispaly();
        obj2.dispaly();
        obj3.dispaly();

    }
    
    
}
