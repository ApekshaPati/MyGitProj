package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webeleMETHODonINSTA {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		
	boolean result = driver.findElement(By.xpath("(//div[contains(@class,'0y9')])[1]")).isEnabled();
		
	if(result == true) {
		System.out.println("element is enable");
	}
	else{
		System.out.println("element is disable");
	}
	
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("apekshapatil@gmail.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("appi123");
	
	boolean result1 = driver.findElement(By.xpath("(//div[contains(@class,'0y9')])[1]")).isEnabled();
	
	if(result1 == true) {
		System.out.println("element is enable");
	}
	else{
		System.out.println("element is disable");
	}
	
	

}
}