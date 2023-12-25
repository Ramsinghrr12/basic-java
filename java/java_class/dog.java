import java.util.*;
class animal{
    private String sound;
    private int  cost;

void setSound(String sound){
    this.sound=sound;
}
void setCost(int coat){
    this.cost=cost;
}
String getSound(){
    return sound;
}
int getCost(){
    return cost;
}
}
class dog{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        animal obj=new animal();
        obj.setSound(sc.next());
        obj.setCost(sc.nextInt());
        System.out.println(obj.getSound());
        System.out.println(obj.getCost());
    
    

    }
}
