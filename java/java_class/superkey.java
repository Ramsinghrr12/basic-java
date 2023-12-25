class sup{
    private int j;
    public int k;
sup(int x,int y){
    j=x;
    k=y;
}
int getj(){
    return j;
}
void displaysup(){
    System.out.println("j="+j);
    System.err.println("k is:"+k);
}
}
class sub extends sup{
    private int m;
    sub(int x,int y,int z){
        super(x,y);
        m=z;
    }
    void displaysub(){
        System.out.println("product is:"+m*getj()*super.k);
    }
    }
public class superkey {
    
    public static void main(String[] args) {
        sub obj=new sub(10, 30, 20);
        sup n=new sup(10, 20);
        obj.displaysub();
        obj.displaysup();
    }
}
