package WAITS;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FLUENT {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    
	    driver.findElement(By.xpath (" //input[@type='text']")).sendKeys("patilapeksha0808@gmail.com");
	

	Wait<WebDriver> fluent=new FluentWait<WebDriver>(driver)
	.withTimeout(Duration.ofSeconds(10))
	.pollingEvery(Duration.ofSeconds(2))
	.ignoring(NoSuchElementException.class);
	
	  fluent.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='passrd']"))).sendKeys("appi123");
	

}
}