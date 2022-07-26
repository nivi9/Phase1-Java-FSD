
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
	 
public  class LongestSubsequence {
		 
	    public static void findLIS(int[] arr)
	    {
	       
	        if (arr == null || arr.length == 0) {
	            return;
	        }
	 
	        List<List<Integer>> LIS = new ArrayList<>();    //stores the longest increasing subsequence of sub array
	        for (int i = 0; i < arr.length; i++) {
	            LIS.add(new ArrayList<>());
	        }
	 
	        LIS.get(0).add(arr[0]);

	        for (int i = 1; i < arr.length; i++)
	        {
	            for (int j = 0; j < i; j++)
	            {
	 
	                if (arr[j] < arr[i] && LIS.get(j).size() > LIS.get(i).size())    //find the longest increasing subsequence array
	                {
	                    LIS.set(i, new ArrayList<>(LIS.get(j)));
	                }
	            }
	 
	      
	            LIS.get(i).add(arr[i]);
	        }
	 
	       
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println("LIS[" + i + "] — " + LIS.get(i));
	        }
	 
	        
	        int j = 0;                                          // j will store an index
	        for (int i = 0; i < arr.length; i++)
	        {
	            if (LIS.get(j).size() < LIS.get(i).size()) {
	                j = i;
	            }
	        }
	 
	        System.out.print(LIS.get(j));
	    }
	 
	    public static void main(String[] args)
	    {
	        int[] arr = {5,8,7,1,9 };
	        
	        
	        System.out.println("The Longest Increasing Subsequence of an array is : ");
	        
	            findLIS(arr);
	    }
	}


