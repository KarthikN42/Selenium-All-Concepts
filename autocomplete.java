package selenium1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autocomplete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spotcheck\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		WebElement select = driver.findElement(By.id("tags"));
		
		select.sendKeys("s");
		
		List<WebElement> select1 = driver.findElements(By.xpath("//*[@id='ui-id-1']//li"));
	
		for (WebElement webElement : select1) {
			if(webElement.equals("Web Services")){
				webElement.click();
				System.out.println("equals"+webElement.getText());
				break;
			}
			
		}
		
	}

}
