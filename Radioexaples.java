package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radioexaples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spotcheck\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		
		WebElement radio = driver.findElement(By.xpath("//*[@id=\"first\"]/label"));
		radio.click();
		
		WebElement unchecked = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[2]"));
        boolean status = unchecked.isSelected();
        System.out.println(status);
		  
        WebElement checked = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[3]/input"));
        boolean status1 = checked.isSelected();
        System.out.println(status1);
		  
        WebElement click  = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[3]"));
        click.click();
	} 

}
