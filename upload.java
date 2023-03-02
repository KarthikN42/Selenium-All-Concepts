package selenium1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spotcheck\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/upload.html");
		WebElement upload = driver.findElement(By.xpath("//*[@type='file']"));
		upload.click();
		Thread.sleep(3000);
		String file="C:\\Users\\Spotcheck\\Downloads\\testleaf";
		StringSelection file1 = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file1, null);
		Robot obj = new Robot();
		obj.keyPress(KeyEvent.VK_CONTROL);
		obj.keyPress(KeyEvent.VK_V);
		obj.keyRelease(KeyEvent.VK_V);
		obj.keyRelease(KeyEvent.VK_CONTROL);
		obj.keyPress(KeyEvent.VK_ENTER);

	}

}
