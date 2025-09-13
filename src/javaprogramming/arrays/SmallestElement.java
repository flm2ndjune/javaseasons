package javaprogramming.arrays;

public class SmallestElement {
	
	public static void main(String[] args) {
		
		int[] arr={10,25,3,45,99,7};
	    smallestElementInArray(arr);
	}

	private static void smallestElementInArray(int[] arr) {
		
		int min=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		
		System.out.println("Smalles Element "+min);
		
	}
	

}
