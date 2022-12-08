package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathByContains {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/r.php/");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("(//input[contains(@class,'inputtext')])[1]")).sendKeys("PRAATIKSHA");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//input[contains(@class,'inp')])[2]")).sendKeys("PATIL");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//input[contains(@name,'g_e')])[1]")).sendKeys("1234567890");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("appi123");
	    Thread.sleep(2000);
	 
	    WebElement x= driver.findElement(By.xpath("//select[@title='Day']"));
	    Select ele = new Select(x);
	    
	    ele.selectByVisibleText("8");
	    
	WebElement  y=  driver.findElement(By.xpath("//select[@aria-label='Month']"));
	    Select ss = new Select (y);
	    
	    ss.selectByIndex(7);
	  
	    
	WebElement z =   driver.findElement(By.xpath("//select[@aria-label='Year']"));
		
    		Select tt = new Select(z);
    		tt.selectByValue("2000");
    		
    	driver.findElement(By.xpath("(//label[@class='_58mt'])[1]")).click();
    	driver.findElement(By.xpath("(//button[contains(@class,'mvm')])[1]")).click();
	}

}
