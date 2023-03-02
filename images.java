package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class images {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spotcheck\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");
		
		WebElement imag1= driver.findElement(By.xpath("//*[@src='../images/abcd.jpg']"));
	    if(imag1.getAttribute("naturalWidth").equals("0")) {
	    	System.out.println("this is broken imag");
	    }else
	    {
	    	System.out.println("this is not broken imag");
	    }
		
		WebElement img = driver.findElement(By.xpath("//*[@onclick]"));
        img.click();
	}

}
