import java.util.*;
abstract class bike{
    abstract void dispaly();
}
class honda extends bike{
    int cost;
     String features;
    honda(){
        this.cost=cost;
        this.features=features;
    }
void dispaly(){
    System.out.println(+cost+""+features+"");

}
}
class pulsar extends honda{
    int kmph;
    String model;
pulsar(){
    this.kmph=kmph;
    this.model=model;
}
void dispaly(){
    System.out.println(+kmph+" "+model+"");
}

}

class bikeTest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        honda obj=new honda();
        System.out.println("enter the bike cost:");
        obj.cost=sc.nextInt();
        System.out.println("enter the fatures of a bike");
        obj.features=sc.next();
        obj.dispaly();
        pulsar obj2=new pulsar();
        System.out.println("entr the milage");
        obj2.kmph=sc.nextInt();
        System.out.println("enetr the model:");
        obj2.model=sc.next();
        obj2.dispaly();
    }
}
    


