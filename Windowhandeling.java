package selenium1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandeling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spotcheck\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		String oldwind = driver.getWindowHandle();

		WebElement click1 = driver.findElement(By.xpath("//button[@id=\"home\"]"));
		click1.click();
		
		Set<String> handles1=driver.getWindowHandles();
		
		for (String newwindow : handles1) {
			driver.switchTo().window(newwindow);
			
		}

		WebElement click2 = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img"));
		click2.click();
		driver.close();
		driver.switchTo().window(oldwind);
		
		WebElement click3 = driver.findElement(By.xpath("//*[text()='Open Multiple Windows']"));
		click3.click();
		int size= driver.getWindowHandles().size();
		System.out.println(size);
		
		WebElement click4 = driver.findElement(By.id("color"));
		click4.click();
		Set<String> handles2=driver.getWindowHandles();
		
		for (String allwindows : handles2) {
			if(!allwindows.equals(oldwind)){
				driver.switchTo().window(allwindows);
				driver.close();
			}
			
		}
		driver.quit();
	}
	

}
