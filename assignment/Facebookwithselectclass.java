package week2.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookwithselectclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Saranya");
		driver.findElement(By.name("lastname")).sendKeys("Deli");
		driver.findElement(By.name("reg_email__")).sendKeys("familys2y2@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("youcanwin");

		WebElement dd = driver.findElement(By.id("month"));
		Select opt=new Select(dd);
		opt.selectByVisibleText("Jan");
		
		WebElement dd1 = driver.findElement(By.id("day"));
		Select opt1=new Select(dd1);
		opt1.selectByVisibleText("1");
		
		WebElement dd2 = driver.findElement(By.id("year"));
		Select opt2=new Select(dd2);
		opt2.selectByVisibleText("2008");
		driver.findElement(By.className("_58mt")).click();
		
		
	}

}
