package assignments;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunching {

	public static void main(String[] args) {

		System.out.println("Enter browser you like to launch.. ");
		Scanner input1 = new Scanner(System.in);
		String browserName = input1.next();

		WebDriver driver=null;
		
		switch (browserName.toLowerCase()) {
		case "chrome":
			driver=new ChromeDriver();

			break;
		case "firefox":
			driver=new FirefoxDriver();

			break;

		case "edge":
			driver=new EdgeDriver();

			break;

		default:
			System.out.println("Invalid browser choosen or entered ..");
		
			
			
		}
		
		driver.quit();

	}

}
