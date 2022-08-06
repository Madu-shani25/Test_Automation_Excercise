package SeleniumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class SeleniumBasics {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
	WebDriverManager.chromedriver().setup();
		
	driver = new ChromeDriver();
	
	
	}
	
	public void testLogin() {
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.name("email_create")).sendKeys("madushamaduwanthi96@gmail.com");
		driver.findElement(By.name("SubmitCreate")).click();
		//Select radioButton = new Select(driver.findElement(By.id("id_gender2")));
		//radioButton.selectByIndex(1);
		//Select radio1 = new Select(driver.findElement(By.id("id_gender2"))).click();
		//WebElement radio1 = driver.findElement(By.id("id_gender2"));
		//radio1.click();
		//driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");  
		//driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.name("firstname")).sendKeys("Madusha");
		driver.findElement(By.name("lastname")).sendKeys("Maduwanthi");
		driver.findElement(By.name("company")).sendKeys("Telexar");
		driver.findElement(By.name("address1")).sendKeys("Telexar");
		driver.findElement(By.name("address2")).sendKeys("Telexar2");
		driver.findElement(By.name("city")).sendKeys("Tangalle");
		Select drpDown = new Select(driver.findElement(By.name("id_state")));
		drpDown.selectByIndex(3);
		Select drpDown1 = new Select(driver.findElement(By.name("postcode")));
		drpDown1.selectByIndex(3);
		Select drpDown2 = new Select(driver.findElement(By.name("id_country")));
		drpDown2.selectByIndex(1);
		driver.findElement(By.name("other")).sendKeys("hello");
		driver.findElement(By.name("phone")).sendKeys("0769042490");
		driver.findElement(By.name("phone_mobile")).sendKeys("0773052440");
		driver.findElement(By.name("alias")).sendKeys("future");
		driver.findElement(By.name("submitAccount")).click(); 
		
		
		
		
		
		
		
		
			
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
