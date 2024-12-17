package Seleniumone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownprogram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\CHROMEDRIVERONETEAM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.navigate().to("https://qavbox.github.io/demo/signup/");
	    driver.manage().window().maximize();
	   Select dropdown=new Select(driver.findElement(By.xpath("//*[@id=\"container\"]/div[7]/select")));
	  // dropdown.selectByVisibleText("Female");
	  // dropdown.selectByIndex(3);
	   dropdown.selectByValue("male");
	    
	    
	}

}
