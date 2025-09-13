package javaprogramming.arrays;

import java.util.Arrays;

public class FrequencyofElements {

	public static void main(String[] args) {
		
		int[] arr= {10,20,20,10,30,10,20};
		
		boolean[] visited=new boolean[arr.length];
		
		//System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(visited));
		
		for(int i=0;i<arr.length;i++)
		{
			if(visited[i])
			{
				continue;
			}
			
			int count=1;
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					visited[j]=true;
				}
				
			}
			
			System.out.println(arr[i]+" occured "+ count +" times");
			
		}
		
		
	 
	}

}
