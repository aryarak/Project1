package Seleniumone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblogin_3 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\CHROMEDRIVERONETEAM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
			driver.navigate().to("https://www.facebook.com");
			driver.manage().window().maximize();
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys("Arya");
			WebElement password=driver.findElement(By.id("pass"));
			password.sendKeys("asd@123@");
			WebElement login=driver.findElement(By.name("login"));
			login.click();
			

	}

}
