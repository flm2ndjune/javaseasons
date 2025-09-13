package javaprogramming.arrays;

import java.util.Arrays;

public class LargetElementUsingArrays {
	
	public static void main(String[] args) {
		
		int[] arr={10,25,3,45,99,7,3,99};
	    largestElementInArray(arr);
	    indexOfLargestElementInArray(arr);
	    secondLargestElementInArray(arr);
	}

	private static void secondLargestElementInArray(int[] arr) {
	
		
		
		//System.out.println("Second Largest Element "+secondLargest);
			
		
	}

	private static void indexOfLargestElementInArray(int[] arr) {
		
		
		
		//System.out.println("Largest Element "+max);
		//System.out.println("Index of Largest Element "+indexMax);
	}

	private static void largestElementInArray(int[] arr) {
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Largest Element "+arr[arr.length-1]);
		System.out.println("Smallest Element "+arr[0]);
		
		
	}
	

}
