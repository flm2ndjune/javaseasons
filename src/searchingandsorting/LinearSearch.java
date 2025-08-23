package searchingandsorting;

public class LinearSearch {
	
	public static void main(String[] args) {
		
		int[] arr={18,12,19,77,-1,29,50};
		
		int index=linearSearch(arr,-1);
		
		if(index>=0)
		{
			System.out.println("Target found at index "+index);
		}
		else if(index == -1 )
		{
			System.out.println("Target not found ..");
			
		}
		else
		{
			System.out.println("Empty array...");
		}
		
	}

	private static int linearSearch(int[] arr, int target) {
		
		if(arr.length==0)
			{
				return -2;
			}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == target)
			{
				return i;
			}
			
		}
		return -1;
		
		
	}

}
