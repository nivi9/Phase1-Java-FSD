package Lesson5;

import java.lang.reflect.Array;
import java.util.Arrays;


public class ExponentialSearching {
	
	public static void main(String[] args) 
	{
		int arr[] = {89,42,48,34,32};
		
		int value= 89;
		
		int outcome=exponentialSearch(arr,arr.length,value);
		
		if(outcome<0) {
			System.out.println("Element is not present in array");
		}
		else {
			System.out.println("Element found at index: "+outcome+", Key is: "+arr[outcome]);
		}
	}

	private static int exponentialSearch(int[] arr, int length, int value) {
		// TODO Auto-generated method stub
		
	
		if(arr[0]==value) {
			return 0;
		}
		
		int i=1; //find out the range by repeated doubling
		
		while(i<length && arr[i]<=value) {
			i= i*2;
		}
		
		//call binary search
		
		
		return Arrays.binarySearch(arr,i/2,Math.min(i, length),value);
	}

}
