package selenium1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamictable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spotcheck\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/table.html");
		
		List<WebElement> tablecoloumn = driver.findElements(By.tagName("th"));
		int no = tablecoloumn.size();
		System.out.println(no);
		List<WebElement> tablerow = driver.findElements(By.tagName("tr"));
		int no1 = tablerow.size();
		System.out.println(no1);
		WebElement getper = driver.findElement(By.xpath("//*[text()='Learn to interact with Elements']//following::td[1]"));
		String perc=getper.getText();
		System.out.println("the percentage is "+perc);
		List<WebElement> data = driver.findElements(By.xpath("//td[2]"));
		List<Integer> int1 = new ArrayList<>();
		
		 for (WebElement webElement : data) {
			String names = webElement.getText().replaceAll("%", "");
			
			int1.add(Integer.parseInt(names));
		}
		
   System.out.println(int1);
	}

}
