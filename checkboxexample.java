package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spotcheck\\Downloads\\chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		WebElement check = driver.findElement(By.xpath("//*[text()='Java']//input"));
		check.click();
		WebElement checked = driver.findElement(By.xpath("//*[text()='Selenium']//input"));
		boolean status = checked.isSelected();
		System.out.println(status);

		WebElement checked1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input"));
		if(checked1.isSelected()) {
			checked1.click();
		}

		WebElement checked2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input"));
		if(checked2.isSelected()) {
			checked2.click();
		}
	}
}