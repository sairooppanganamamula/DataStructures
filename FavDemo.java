
abstract class Demo {
	void show() {
		System.out.println("In show method of super class");
	}

	abstract void display();

}

public class FavDemo extends Demo{

	public static void main(String[] args) {
		Demo d=new Demo() {
			
			@Override
			void display() {
				System.out.println("hi this is sai roop");
				
			}
		};
		d.display();
		 
	 }

	@Override
	void display() {
		System.out.println("Sai roop is doing work");
	}
}
