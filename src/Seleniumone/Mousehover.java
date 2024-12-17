package Seleniumone;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\CHROMEDRIVERONETEAM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.navigate().to("https://www.spicejet.com/");
	    WebElement element=driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div[1]/div/div[2]/div[1]/div/div[1]/div[1]"));
	 //   Alert alert1=driver.switchTo().alert();
			// alert1.dismiss();
			  // Thread.sleep(5000);
	    Actions actions = new Actions(driver);
	    actions.moveToElement(element).build().perform();
	   
	    WebElement taxi=driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/div/div/div[3]/div/a[2]/div/div"));
	
	    taxi.click();
	    Thread.sleep(5000);
		   Alert alert1=driver.switchTo().alert();
		 alert1.accept();
	}

}
