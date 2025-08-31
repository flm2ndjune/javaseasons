package searchingandsorting;

public class BinearySearch {

	public static void main(String[] args) {
		
		int[] arr = {-18,-12,-15,16,18,22,45,89};

		int index=binarySearch(arr,22);
		
		if(index>=0)
		{
			System.out.println("Target found at index "+index);
		}
		else if(index == -1 )
		{
			System.out.println("Target not found ..");
			
		}
		
		System.out.println("target element is "+arr[index]);

	}

	private static int  binarySearch(int[] arr, int target) {
		
		int start  = 0;
		int end = arr.length-1;
		
		while(start <= end )
		{
			//find the index of mid element
			int mid=(start+end)/2;
			
			if(target<arr[mid])
			{
				end=mid-1;
			}
			else if(target > arr[mid])
			{
				start=mid+1;
			}
			else
			{
				//target found 
				return mid;
			}
			
			
		}
		return -1;
		
		
		
	}

}
