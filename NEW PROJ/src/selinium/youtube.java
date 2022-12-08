package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("VE MAHI");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//yt-icon[contains(@class,'style')])[1]")).click();
		driver.findElement(By.xpath("//yt-icon-button[@id='search-button-narrow']")).click();
		Thread.sleep(3000);
		//to select song----------------
		driver.findElement(By.xpath("(//a[@id='video-title'])[1]")).click();
		//driver.findElement(By.xpath("(//yt-formatted-string[contains(@aria-label,'Ve Maahi | Kesari | Akshay Kumar & Parineeti Chopra |')])[1]")).click();
		// to skip add -----------------
		//driver.findElement(By.xpath(""))
		
		

}
}