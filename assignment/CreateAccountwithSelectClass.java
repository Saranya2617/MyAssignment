package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountwithSelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Saranya Deli");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement dd = driver.findElement(By.name("industryEnumId"));
		Select opt=new Select(dd);
		opt.selectByVisibleText("Computer Software");
		
		WebElement dd1 = driver.findElement(By.name("ownershipEnumId"));
		Select opt1=new Select(dd1);
		opt1.selectByVisibleText("S-Corporation");
		
		WebElement dd2 = driver.findElement(By.name("dataSourceId"));
		Select opt2=new Select(dd2);
		opt2.selectByValue("LEAD_EMPLOYEE");
		
		WebElement dd3 = driver.findElement(By.name("marketingCampaignId"));
		Select opt3=new Select(dd3);
		opt3.selectByIndex(6);
		
		WebElement dd4 = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select opt4=new Select(dd4);
		opt4.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
