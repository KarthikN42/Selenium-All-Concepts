package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sortable { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spotcheck\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/sortable.html");
		List<WebElement> sort = driver.findElements(By.xpath("//*[@id='sortable']//following::li"));
		
		WebElement fromele = sort.get(6);
		WebElement toele = sort.get(0);

		Actions cla = new Actions(driver);
		cla.clickAndHold(fromele);
		cla.dragAndDrop(fromele, toele);
		cla.build().perform();
		
	}

}
