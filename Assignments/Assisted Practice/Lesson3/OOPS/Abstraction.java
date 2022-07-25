package Lesson3OOPS;


abstract class Bike{
	abstract void run();
}

class Honda extends Bike{
	void run() {
		System.out.println("SAFE RIDE");
	}
}
public class Abstraction {
	
	 public static void main(String[] args) {
			
		 Bike obj = new Honda();
		 obj.run();

}
}
