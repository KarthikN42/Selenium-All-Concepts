package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spotcheck\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		
		WebElement clickbutton = driver.findElement(By.id("Click"));
		clickbutton.click();
		
		
		String name = driver.findElement(By.id("Click")).getText();
		System.out.println(name );
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
	    driver.switchTo().frame("frame2");
	    WebElement clickbutton1 = driver.findElement(By.id("Click1"));
		clickbutton1.click();
		driver.switchTo().defaultContent();
		
		List<WebElement> noofframe = driver.findElements(By.tagName("iframe"));
		int no= noofframe.size();
		System.out.println(no);
		
	    driver.quit();
	}
}
