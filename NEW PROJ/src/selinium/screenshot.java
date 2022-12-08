package selinium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	
	public static void main(String[] args) throws  IOException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/i/flow/login");
		Thread.sleep(3000);
		
		
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	
	File destination = new File("C:\\Users\\Dell\\Desktop\\screenShot\\3rdt.jpeg");
	
	FileHandler.copy(src, destination);

}
}	