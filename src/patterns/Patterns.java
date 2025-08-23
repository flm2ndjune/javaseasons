package patterns;

public class Patterns {
	
	public static void main(String[] args) {
		
	 //	Patterns.pattern1(5);
		
	//	pattern2(5);
	//	pattern3(5);
	//	pattern4a(5);
		pattern4b(5);
		
	}

	private static void pattern3(int n) {
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

	private static void pattern2(int n) {
		
		for (int i = 1; i <=n ; i++) {
			
			for (int j = 1; j <=i; j++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

	private static void pattern1(int n) {
		
		for (int i = 1; i <= n ; i++) {
			
			for (int j = 1 ; j <= n; j++) {
				
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
	}
	
	private static void pattern4a(int n) {
		
		for (int i = 1; i <=n ; i++) {
			
			for (int j = 1; j <=i; j++) {
				
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}
	
	
	private static void pattern4b(int n) {
		
		for (int i = 1; i <=n ; i++) {
			
			for (int j = 1; j <=i; j++) {
				
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
	

}
