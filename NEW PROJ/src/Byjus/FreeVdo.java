package Byjus;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FreeVdo {
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://byjus.com/byjus-classes-book-free-60-mins-class/?utm_source=google&utm_mode=CPA&utm_campaign=K10-IN-Brand-BYJU%27S-USD-Exact&utm_term=byjus&gclid=Cj0KCQjwy5maBhDdARIsAMxrkw30p2qYMoe8xOHblLDi_uHpY-rPiZwNcjD2aSjj0kksaMtQvK4RH9EaAthoEALw_wcB");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	WebElement scroll = driver.findElement(By.xpath("(//h2[@class ='section-title'])[3]"));
	WebElement dpdw = driver.findElement(By.xpath("//select[@class='form-control video-selection']"));
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)",scroll );
	
	Select select = new Select (dpdw);
	for(int i = 0; i<7; i++) {
		select.selectByIndex(i);
		System.out.println("Available vdos for class "+(i+4));
		 List<WebElement> vdos = driver.findElements(By.xpath("//div[@class='row row-inline']//a"));
		 if(vdos.size()==2) {
			 System.out.println("passed");
		 }
		 
		 
			
		 vdos.get(0).click();
		 driver.switchTo().frame(0);
		  String vdoName = driver.findElement(By.xpath("//a[@class='ytp-title-link yt-uix-sessionlink']")).getText();
		 System.out.println(vdoName);
		 //driver.findElement(By.xpath("//button[@aria-label='Play']")).click();
		 driver.switchTo().defaultContent();
		 driver.findElement(By.xpath("(//button[@type='button'])[14]")).click();
		 
		 
		 vdos.get(1).click();
		 driver.switchTo().frame(0);
		String vdoName1 = driver.findElement(By.xpath("//a[@class='ytp-title-link yt-uix-sessionlink']")).getText();
		 System.out.println(vdoName1);
		 //driver.findElement(By.xpath("//button[@aria-label='Play']")).click();
		 driver.switchTo().defaultContent();
		 driver.findElement(By.xpath("(//button[@type='button'])[14]")).click(); 
		 
		System.out.println("***************");
		
	
	
	}
	

}

} 