package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByAtribute {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    
// x-path for facebook login & pass
	    
	    driver.findElement(By.xpath (" //input[@type='text']")).sendKeys("patilapeksha0808@gmail.com");
	    Thread.sleep(2000); 
	    driver.findElement(By.xpath(" //input[@type ='password']")).sendKeys("appi123");
	    Thread.sleep(2000); 
	    driver.findElement(By.xpath("//button[@value = '1']")).click();
	    Thread.sleep(2000);
	    
// x-path for instagram
	    driver.switchTo().newWindow(WindowType.TAB);
	    driver.get("https://www.instagram.com/accounts/login/");
	    Thread.sleep(2000); 
	    driver.findElement(By.xpath("//input[@aria-label = 'Phone number, username, or email']")).sendKeys("patilapeksha0808@gamil.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@aria-label ='Password']")).sendKeys("appi123");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@ class = '             qF0y9          Igw0E     IwRSH      eGOV_       acqo5   _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    ']")).click();
	
// x-path for gmail
	    driver.switchTo().newWindow(WindowType.TAB);
	    driver.get(" https://accounts.google.com/v3/signin/identifier?dsh=S-301198070%3A1664967047353074&continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&passive=1209600&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQDHYWryRCeJI-_uv56HZT991iNKB2WDnjkLJDrXKs_V5P3ZlaY0HDIctTlpG53z0l8eSEkM1zurdQ");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@type = 'email']")).sendKeys("patilapeksha0808@gmail.com");
	    Thread.sleep(2000);
	    // x-path by text
	    driver.findElement(By.xpath("//span[text() ='Next']")).click();
	    
	  
	
	}

}
