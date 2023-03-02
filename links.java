package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spotcheck\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Link.html");

		WebElement link1 = driver.findElement(By.linkText("Go to Home Page"));
		link1.click();

		driver.navigate().back();

		WebElement wheretogo  = driver.findElement(By.xpath("//*[@href='Button.html']"));
		String linkname= wheretogo.getAttribute("href");
		System.out.println("the link  name  "+linkname);
		WebElement wheretogobroken  = driver.findElement(By.xpath("//*[text()='Verify am I broken?']"));
		wheretogobroken.click();
		String tittle = driver.getTitle();
		System.out.println(tittle);
		if(tittle.contains("404")) {
			System.out.println("this is broken link");
			
			}
		driver.navigate().back();
			WebElement dynamic  = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div/div/a"));
			dynamic.click();
			List<WebElement> nooflink = driver.findElements(By.xpath("html//body//section//a"));
		int no = nooflink.size();
		System.out.println("the no of link"+no);
			
		}


	}


