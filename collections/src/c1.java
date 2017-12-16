import java.util.Vector;


public class c1 {


	public static void main(String[] args) {
		Vector v =new Vector();
		System.out.println(v.size());
		System.out.println(v.capacity());
		v.add(10);
		v.add("sachin");
		v.add(10.2);
		v.add(30);
		v.add(30);
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(30);
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(30);
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(30);
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(30);
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(30);
		v.add(2,"raj");
		
		System.out.println(v.size());
		System.out.println(v.capacity());
		for(int i=0;i<v.size();i++)
			System.out.println(v.get(i));
		//System.out.println(v);
		

	}

}
