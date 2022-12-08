package ddDROPDOWN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DRAGdrop {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		
		Actions x = new Actions(driver);
		
	//	x.dragAndDrop(src, dest).perform();
		
	// USING CLICK & HOLD
	   x.moveToElement(src).clickAndHold().moveToElement(dest).release();
	// or 
	 //   x.clickAndHold(src).release(dest);
    x.
}
}