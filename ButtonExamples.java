package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spotcheck\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");


		//2.find position button

		WebElement position = driver.findElement(By.id("position"));
		Point position1 = position.getLocation();
		System.out.println("the postion is "+ position1);

		//3.find the colour 

		WebElement colour = driver.findElement(By.id("color"));
		String colour1= colour.getCssValue("background-color");
		System.out.println("the colour is "+colour1);


		//4.find the size

		WebElement size = driver.findElement(By.id("size"));
		int size1 = size.getSize().getHeight();
		int size2 = size.getSize().getWidth();
		System.out.println("the height is "+size1 + "the width is "+ size2);

		//1.click home page 
		WebElement home = driver.findElement(By.id("home"));
		home.click();





	}

}
