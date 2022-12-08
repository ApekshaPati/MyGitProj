package ddDROPDOWN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DROPdown {
	
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.xpath("//a[text()= 'Login']"));
        Actions z = new Actions(driver);
        z.moveToElement(login).perform();
        WebElement order = driver.findElement(By.xpath("(//div[@class='_3vhnxf'])[3]"));
        z.click(order).perform();
        
}
}