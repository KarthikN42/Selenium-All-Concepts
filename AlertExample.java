package selenium1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spotcheck\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");


		WebElement alert = driver.findElement(By.xpath("//*[text()='Alert Box']"));
		alert.click();
		Thread.sleep(3000);

		Alert click = driver.switchTo().alert();
		click.accept();

		WebElement alert1 = driver.findElement(By.xpath("//*[contains(text(),'Confirm ')]"));
		alert1.click();
		Thread.sleep(3000);

		Alert click1 = driver.switchTo().alert();
		click1.dismiss();

		WebElement alert2 = driver.findElement(By.xpath("//*[starts-with(text(),'Prompt ')]"));
		alert2.click();
		Thread.sleep(3000);
		Alert click3 = driver.switchTo().alert();

		click3.sendKeys("qtree");
		click3.accept();

	}

}
