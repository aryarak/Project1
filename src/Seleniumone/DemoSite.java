package Seleniumone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSite {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\CHROMEDRIVERONETEAM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
			driver.navigate().to("https://vinothqaacademy.com/demo-site/");
			driver.manage().window().maximize();
			WebElement firstname=driver.findElement(By.name("vfb-5"));
			//WebElement firstname=driver.findElement(By.xpath("//*[@id=\"vfb-5\"]"));
			firstname.sendKeys("Arya");
			WebElement Lastname=driver.findElement(By.name("vfb-7"));
			Lastname.sendKeys("Rakshith");
			WebElement button=driver.findElement(By.name("vfb-31"));
			button.click();
			WebElement address=driver.findElement(By.xpath("//*[@id=\"vfb-13-address\"]"));
			address.sendKeys("Aluva, Veliyath House");
			WebElement street=driver.findElement(By.xpath("//*[@id=\"vfb-13-address-2\"]"));
			street.sendKeys("East Kadungalloor");
			WebElement town=driver.findElement(By.xpath("//*[@id=\"vfb-13-city\"]"));
			town.sendKeys("Ernakulam");
			WebElement code=driver.findElement(By.xpath("//*[@id=\"vfb-13-zip\"]"));
			code.sendKeys("683100");
			WebElement state=driver.findElement(By.xpath("//*[@id=\"vfb-13-state\"]"));
			state.sendKeys("Kerala");
			WebElement email=driver.findElement(By.xpath(" //*[@id=\"vfb-14\"]"));
			email.sendKeys("abc@xmail.xom");
			WebElement phonenum=driver.findElement(By.xpath("//*[@id=\"vfb-19\"]"));
			phonenum.sendKeys("8606490084");
			 WebElement checkbox= driver.findElement(By.xpath("//*[@id=\"vfb-20-4\"]"));
		     checkbox.click();
			WebElement verif=driver.findElement(By.xpath("//*[@id=\"vfb-3\"]"));
			verif.sendKeys("asd");
			WebElement submit=driver.findElement(By.xpath("//*[@id=\"vfb-4\"]"));
			submit.click();
			
			
	}

}
