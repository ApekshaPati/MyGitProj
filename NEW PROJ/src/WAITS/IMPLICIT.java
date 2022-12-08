package WAITS;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IMPLICIT {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);....used for 3rd version of selenium
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//x-path for facebook login & pass
    
    driver.findElement(By.xpath (" //input[@type='text']")).sendKeys("patilapeksha0808@gmail.com");
    Thread.sleep(6000); 
    driver.findElement(By.xpath(" //input[@type ='password']")).sendKeys("appi123");
    Thread.sleep(2000); 
    driver.findElement(By.xpath("//button[@value = '1']")).click();
    Thread.sleep(2000);

}

}