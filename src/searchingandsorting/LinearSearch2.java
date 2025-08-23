package searchingandsorting;

public class LinearSearch2 {
	
	public static void main(String[] args) {
		
		int[] arr= {18,12,19,77,29,50};
		
		boolean status=linearSearch(arr,77);
		
		if(status)
		{
			System.out.println("Target found ..");
		}
		else
		{
			System.out.println("Target not found ..");
		}
		
	}

	private static boolean linearSearch(int[] arr, int target) {
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == target)
			{
				return true;
			}
			
		}
		return false;
		
		
	}

}
