package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spotcheck\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		List <WebElement> select= driver.findElements(By.xpath("//*[@id='selectable']//li"));
		Actions obj = new Actions(driver);
		obj.keyDown(Keys.CONTROL).click(select.get(0)).click(select.get(1)).click(select.get(2));
		obj.build().perform();
		
		Actions obj1 = new Actions(driver);
		obj1.clickAndHold(select.get(0));
		obj1.build().perform();

	}

}
