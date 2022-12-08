package iiIFRAME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3SCHOOL {
	
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		//driver.findElement(By.xpath("//button[@type= 'button']"));
		
		  WebElement iframe = driver.findElement(By.xpath("//iframe[@id= 'iframeResult']"));
	     driver.switchTo().frame(iframe);
	     driver.findElement(By.xpath("//button[@type= 'button']")).click();
	     
	     driver.switchTo().defaultContent();
	     
	     driver.findElement(By.xpath("//a[@target = '_blank']")).click();
	     
	      

}
}