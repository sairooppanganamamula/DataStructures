import java.util.Vector;


public class EnumDemo {
	public static void main(String[] args)
	{
		Vector<E> v = new Vector();
		for(Object i = 0 ; i <= 10; i++)
		{
			v.addElement(i);
			
		}
		System.out.println(v);
		Enum e = v.elements();
		while(e.hasMoreElements())
		{
			Integer I = (Integer) e.nextElement();
			if(I % 2 == 0)
				System.out.println(I);
		}
		System.out.println(v);
	}

}
