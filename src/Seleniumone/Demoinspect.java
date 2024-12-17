package Seleniumone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoinspect {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\CHROMEDRIVERONETEAM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.navigate().to("https://qavbox.github.io/demo/signup/");
    driver.manage().window().maximize();
    WebElement fileinput=driver.findElement(By.xpath("//*[@id=\"container\"]/div[6]/input"));
    fileinput.sendKeys("C:\\Users\\Arya Venugopal\\OneDrive\\Documents\\Interview_Questions\\Resume_24.pdf");
    Thread.sleep(5000);
    
	}

}
