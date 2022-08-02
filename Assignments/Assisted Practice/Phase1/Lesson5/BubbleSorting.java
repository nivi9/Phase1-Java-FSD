package Lesson5;


public class BubbleSorting {

	public static void main(String[] args) {

		int[] arr = { 120,10,69,300,45,79};
		
		bubbleSort(arr);
		
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i]+" \t");
		}
	}

	public static void bubbleSort(int[] arr) {
		int len = arr.length;
		int temp = 0;
		for (int i = 0; i < len; i++) {
			
			for (int j = 1; j < (len); j++) {
				
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
					
					for(int x:arr) {
						System.out.print(x+" ");
						}System.out.println();
				}
				
			}
			
		}

	}

}