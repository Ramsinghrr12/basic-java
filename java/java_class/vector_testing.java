import java.util.Vector;

public class vector_testing {
    public static void main(String[] args) {
        Vector s=new Vector<>();
        s.add(10);
        s.add(11);
        s.add(14);
        s.add(15);
        s.addFirst(0);
        s.addLast(100);
        s.set(3, 200);
        s.set(4,"ramsingh");
        s.add(4,400);
        s.add(33);
        s.add("ramu");
        s.add(0,"start");
        s.addLast("last");
        s.get(1);
        System.out.println("size is:"+s.size());
        System.out.println("capacity is:"+s.capacity());
        System.out.println(s);




    }
    
}
