package javaprogramming.arrays;

public class LargetElement {
	
	public static void main(String[] args) {
		
		int[] arr={10,25,3,45,99,7};
	    largestElementInArray(arr);
	    indexOfLargestElementInArray(arr);
	    secondLargestElementInArray(arr);
	}

	private static void secondLargestElementInArray(int[] arr) {
	
		//System.out.println(Integer.MIN_VALUE);
		
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				secondLargest=largest;
				largest=arr[i];				
			}
		}
		
		System.out.println("Second Largest Element "+secondLargest);
			
		
	}

	private static void indexOfLargestElementInArray(int[] arr) {
		
		int max=arr[0];
		int indexMax=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				indexMax=i;
			}
		}
		
		System.out.println("Largest Element "+max);
		System.out.println("Index of Largest Element "+indexMax);
	}

	private static void largestElementInArray(int[] arr) {
		
		
		
	}
	

}
