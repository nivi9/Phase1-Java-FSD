package Lesson3;

public class ExceptionHandling {

		
		public static void main(String[] args) {
			
			try {
				
				int res= 15/10;
				System.out.println("result is: "+res);
				
				int a[]= {91,98,28,86,73};
				System.out.println("Value  at index 5: "+a[3]);
}
			catch(ArithmeticException e) {
				System.out.println("Arithmetic Execption: "+e.getMessage());
			}
			
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Array Index Issue: "+e.getMessage());
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error occured: "+e.getMessage());
			}
		}

	}