package Lesson3OOPS;

public class polymorphism {
	
	public int sum(int x , int y) {
		return (x+y);
		}
	
	public double sum(double x, double y) {
		
		return (x+y);
	}
	
    public static void main(String[] args) {
		
		polymorphism obj = new polymorphism();
		
		System.out.println("Sum of two integer value: " + obj.sum(49, 81)); 
		System.out.println("Sum of two double value: " + obj.sum(100.12, 150.45)); 
	}
}
