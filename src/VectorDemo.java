import java.util.Vector;


public class VectorDemo {
	public static void main(String[] args)
	{
		char ch;
		
		Vector v = new Vector();
		System.out.println(v.capacity());
		for(ch = 'a' ; ch <='f'; ch++)
		{
			v.addElement(ch);
		}
		System.out.println(v.capacity());
		v.addElement("A");
		System.out.println(v.capacity());
		System.out.println(v);
	}

}
