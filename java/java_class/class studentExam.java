class studentExam{
    private int id;
    private String  name;
    String subjectl="java";

    void setId(int id){
        this.id=id;
    }

    void setName(String name){
        this.name=name;
    }
    int getId(){
        return id;
    } 
    String getName(){
        return name;
    }

}
class studentDet{
    public static void main(String args[]){
        studentExam obj=new studentExam();
     obj.setId(2003);
    obj.setName("ramsingh");
       System.out.println(obj.getName());
       System.out.println(obj.getId());
       System.out.println(obj.subjectl);
    }
}