package exceptions;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class FileUpload {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
	
	WebDriver driver=	new ChromeDriver();
	  driver.get("https://demoqa.com/automation-practice-form");
	  driver.manage().window().maximize();
	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		Thread.sleep(5000);
		
		WebElement e1=driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		//WebElement e1=driver.findElement(By.xpath("//button[@id='submit']"));
		try
		{
		e1.click();
		}
		catch(InvalidArgumentException obj)
		{
			System.out.println(obj.toString());
			e1.sendKeys("D:\\FLM2ndJuneWS\\JavaSeasons\\DataTypes Table.png");
		}
		
		//e1.sendKeys("D:\\FLM2ndJuneWS\\JavaSeasons\\DataTypes Table.png");
		
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		
		String path="D:\\FLM2ndJuneWS\\JavaSeasons\\DataTypes Table.png";
		
		
		driver.quit();
	}


}
