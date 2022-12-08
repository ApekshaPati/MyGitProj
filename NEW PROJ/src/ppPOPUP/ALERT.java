package ppPOPUP;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALERT {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
  // dismiss method	
		/*driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
	    driver.switchTo().alert().dismiss();*/
		
 
 //to get text method	
		driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
		Alert alt = driver.switchTo().alert();
		 String text = alt.getText();
		 System.out.println(text);
 // send key  method
		
		alt.sendKeys("yes");
		alt.accept();
	
		

}
}