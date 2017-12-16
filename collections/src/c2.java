import java.util.Iterator;
import java.util.Vector;


public class c2 {
	public static void main(String[] args) {
Vector v = new Vector();
v.addElement(123);
v.add(1);
v.add(10.2);

Iterator it=v.iterator();
while(it.hasNext())
	System.out.println(it.next());
for (Object e:v)
	System.out.println(e);
	}

}
