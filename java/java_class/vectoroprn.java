import java.util.Vector;
public class vectoroprn {
    public static void main(String[] args) {
Vector obj=new Vector();
obj.addElement("ramsingh");
obj.addElement("Shyam");
obj.addElement("swamy");
obj.addElement("ramu");
System.out.println("the elements are:"+obj);
obj.addFirst("tiger");
obj.addLast("last");
obj.size();
obj.capacity();
obj.remove(1);
obj.add(3,"third");
obj.get(0);
obj.set(2, obj);
obj.removeAllElements();

System.out.println(obj);



    }
}
