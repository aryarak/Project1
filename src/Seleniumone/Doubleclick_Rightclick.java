package Seleniumone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick_Rightclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\CHROMEDRIVERONETEAM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
	    driver.manage().window().maximize();
        Actions ac=new Actions(driver);
      //  WebElement button=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
      //  ac.doubleClick(button).perform();
        WebElement button2=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
        ac.contextClick(button2).perform();
      
	}

}
