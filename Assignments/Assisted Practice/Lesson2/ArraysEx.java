package Lesson2;

public class ArraysEx {

		public static void main(String[] args) {
			
			
			System.out.println("\n Single Dimensional Array \n");

				int array[]= {12,23,34,45,56,78};
				
				System.out.println("Element at index 4: "+ array[4]);
				
				System.out.println("Length of an Array: "+array.length);
				
				System.out.println("Access using for loopp");
				
				for (int i=0;i<array.length;i++) {
					
					System.out.println(array[i]);
					
				}
				
				System.out.println();
				
				
				for(int a: array) {
					System.out.print(a+ " ");
					
					System.out.println();
				}
				
				
				//multidimensional array
				int[][] b = {
				            {1, 10, 12, 16}, 
				            {79, 57, 89} };
				System.out.println("\n Multi Dimensional Array \n");
				      
				      System.out.println("\nLength of row 1: " + b[0].length);
				      }
				

			}
		
		
		
		
		
		