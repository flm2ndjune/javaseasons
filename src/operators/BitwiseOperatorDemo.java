package operators;

public class BitwiseOperatorDemo {

	public static void main(String[] args) {
		
		System.out.println("\n=== 2. GRAPHICS: Extract RGB from packed int ===");
        int color = 0xFF3366;
        int red   = (color >> 16) & 0xFF;
        int green = (color >> 8) & 0xFF;
        int blue  = color & 0xFF;
        System.out.printf("R=%d, G=%d, B=%d\n", red, green, blue);

	}

}
