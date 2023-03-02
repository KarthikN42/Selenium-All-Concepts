package selenium1;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class download {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spotcheck\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		WebElement select = driver.findElement(By.partialLinkText("Download Excel"));
		select.click();
		
		File name = new File("C:\\Users\\Spotcheck\\Downloads");
		File[] locatotalfile = name.listFiles();
		
		for (File locatio : locatotalfile) {
			if(locatio.getName().equals("testleaf"));
			{
				System.out.println("file presentedd");
				break;
			}
		}
		
	}

}
