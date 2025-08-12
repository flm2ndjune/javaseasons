package operators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BitwiseAdactinHotelapp {
	
	public static void main(String[] args) {
		
		WebDriver driver=	new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("login")).click();
		//System.out.println(driver.findElement(By.id("username_span")).getText());
		
		//System.out.println(driver.findElement(By.id("username_span")).getCssValue("color"));
		
		WebElement element= driver.findElement(By.id("username_span"));
		System.out.println(element.getText());
		System.out.println(element.getCssValue("color"));
		String color=element.getCssValue("color");
		
		System.out.println(rgbaStringToHex(color));
		
		driver.quit();
		
		
	}
	
	public static String rgbaStringToHex(String rgba) {
        // Remove "rgba(" and ")" and spaces
        rgba = rgba.replace("rgba(", "")
                   .replace(")", "")
                   .replace(" ", "");

        // Split by comma
        String[] parts = rgba.split(",");

        int r = Integer.parseInt(parts[0]);
        int g = Integer.parseInt(parts[1]);
        int b = Integer.parseInt(parts[2]);
        float a = Float.parseFloat(parts[3]); // 0.0 to 1.0

        // Convert alpha to 0–255 range
        int alpha = Math.round(a * 255);

        // Pack into ARGB
        int argb = (alpha << 24) | (r << 16) | (g << 8) | b;

        // Return as hex
        return String.format("#%06X", argb);
    }

}
