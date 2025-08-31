package searchingandsorting;

import java.util.Arrays;

public class Sorting {
	
	public static void main(String[] args) {
		
		
		int[] arr= {3,1,5,2,4};
		
		System.out.println(Arrays.toString(arr));
		
		//bubbleSort(arr);
		selectionSort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		selectionSort(arr);
		
		
	}

	private static void selectionSort(int[] arr) {
		
	for (int i = 0; i < arr.length; i++) {
		
		int last=arr.length-1-i;
		int maxIndex=getMaXIndex(arr,0,last);
		
		// a = arr[maxIndex]
		//b = arr[last]
		// int temp = a
		//a=b
		//b=temp
		
		int temp=arr[maxIndex];
		arr[maxIndex]=arr[last];
		arr[last]=temp;
		
	}
		
		
	}

	private static int getMaXIndex(int[] arr, int start, int end) {
		
		int max=start;
		
		for(int i=start;i<=end;i++)
		{
			if(arr[max]<arr[i])
			{
				max=i;
			}
		}
		
		return max;
		

		
		
	}

	private static void bubbleSort(int[] arr) {
		
		int pass=1;
		//no of passes  ? arr.length-1 => 5-1 =4
		for(int i=0;i<arr.length-1;i++)
		{
			
			for(int j=0;j<arr.length-1;j++)
			{
				//a    b 
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			System.out.println(arr[arr.length-pass]);
			pass++;
		}
		
	}

}
