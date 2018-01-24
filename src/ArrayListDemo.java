import java.util.ArrayList;


public class ArrayListDemo {
	public static void main(String[] args)
	{
		ArrayList a = new ArrayList();
		a.add("A");
		a.add("c");
		a.add("B");
		a.add(null);
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
		a.add(2, "M");
		a.add("N");
		System.out.println(a);
	}

}
 
