package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstsample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spotcheck\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://spotcheck-tst.outsystemsenterprise.com/BackOffice_Portal/LoginAndRegistration.LoginPage.aspx");
	
	     WebElement username = driver.findElement(By.id("OutSystemsUIWeb_wt81_block_wtLogin_OutSystemsUIWeb_wt86_block_wtColumn2_OutSystemsUIWeb_wt91_block_wtLogin_wtUserNameInput"));
	     username.sendKeys("enhappmails+27@gmail.com");
	     WebElement password =  driver.findElement(By.id("OutSystemsUIWeb_wt81_block_wtLogin_OutSystemsUIWeb_wt86_block_wtColumn2_OutSystemsUIWeb_wt91_block_wtLogin_OutSystemsUIWeb_wt85_block_wtInput_wtPasswordInput"));
	     password.sendKeys("Welcome@123");
	     WebElement login = driver.findElement(By.id("OutSystemsUIWeb_wt81_block_wtLogin_OutSystemsUIWeb_wt86_block_wtColumn2_OutSystemsUIWeb_wt91_block_wtLogin_wt47"));
	     login.click();
	}
	

}
