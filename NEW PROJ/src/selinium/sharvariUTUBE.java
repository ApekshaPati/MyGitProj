package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sharvariUTUBE {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		
		driver.findElement(By.xpath("//ytd-searchbox[@id='search']")).sendKeys("Ve mahi");
		Thread.sleep(2000);
	
		
		driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//yt-formatted-string[contains(@aria-label,'Ve Maahi | Kesari | Akshay Kumar & Parineeti Chopra')]")).click();
	/*Thread.sleep(10000); // 
		
	
    
    WebElement display = driver.findElement(By.xpath("//div[text()='Skip Ads']"));
	boolean result = display.isDisplayed();
//	Thread.sleep(10000);
	// WebElement enable = driver.findElement(By.xpath("//div[text()='Skip Ads']"));
    //    boolean res1 = enable.isEnabled();
	
System.out.println(result);
// if(res1 == true) {
//  System.out.println("image is displayed");
 
  if(result==true) {
	  
 driver.findElement(By.xpath("//button[@class='ytp-ad-skip-button ytp-button']")).click();
 System.out.println("True");
}else {
 System.out.println("Add Not displayed");
}
	*/

}
}