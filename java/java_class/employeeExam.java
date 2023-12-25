class name{
    String fname;
    String Mname;
    String Lname;
    name(String fname,String Mname,String Lname){
        this.fname=fname;
        this.Mname=Mname;
        this.Lname=Lname;
    }
}
class employeeExam{
    int age;
    name n;
    void dispaly(int age,name n){
        System.out.println(" "+age+" ");
    }
    public static void main(String args[]){
        employeeExam obj=new employeeExam();
        name obj2=new name("ramsingh","ramu","ram");
        obj.dispaly(21, obj2);
     }
    
}