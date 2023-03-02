package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spotcheck\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		WebElement email= driver.findElement(By.id("email"));
		email.sendKeys("karthiknat777@gmai.com");
		System.out.println("i have entred my gmail id ");
		
		WebElement append = driver.findElement(By.xpath("//*[@value='Append ']"));
		append.sendKeys(" text");
		
		WebElement gh = driver.findElement(By.name("username"));
		String value =  gh.getAttribute("value");
		System.out.println(value);
		
		WebElement clean = driver.findElement(By.xpath("//*[@value='Clear me!!']"));
		clean.clear();
		
		WebElement disable = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		boolean enable = disable.isEnabled();
		System.out.println(enable);
		
		
		  
	}
	

}
