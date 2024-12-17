package Seleniumone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragddrop {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","C:\\CHROMEDRIVERONETEAM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.navigate().to("https://jqueryui.com/droppable/");
	    driver.switchTo().frame(0);
	    driver.manage().window().maximize();
	    WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
		
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(drag, drop).perform();

		
	}

}
