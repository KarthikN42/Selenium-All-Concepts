package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spotcheck\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");

		WebElement dropdown = driver.findElement(By.id("dropdown1"));
		Select drop = new Select(dropdown);
		drop.selectByIndex(1);

		WebElement dropdown1 = driver.findElement(By.name("dropdown2"));
		Select drop1 = new Select(dropdown1);
		drop1.selectByValue("2");

		WebElement dropdown3 = driver.findElement(By.name("dropdown3"));
		Select drop3 = new Select(dropdown3);
		drop3.selectByVisibleText("UFT/QTP");

		WebElement dropdown4 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/select"));
		Select drop4 = new Select(dropdown4);

		List<WebElement> list = drop4.getOptions();
		int size = list.size();
		System.out.println("the size is "+size);

		WebElement dropdown5 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
		dropdown5.sendKeys("Loadrunner");


		WebElement dropdown6 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select multi = new Select(dropdown6);
		multi.selectByIndex(1);
		multi.selectByIndex(2);
		multi.selectByIndex(3);



	}

}
