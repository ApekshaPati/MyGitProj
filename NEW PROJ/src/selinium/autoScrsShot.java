package selinium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class autoScrsShot {
	public static WebDriver driver;
	public static void Capscrshot() throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		
		
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String rr = RandomString.make(3);
		System.out.println(rr);
		
		File destination = new File("C:\\Users\\Dell\\Desktop\\screenShot\\img "+rr+".jpeg");
		
		FileHandler.copy(src, destination);
	}
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		
		
			
			Capscrshot();
			System.out.println("scrshot taken");
			//Thread.sleep(3000);
			Capscrshot();
			
	
}
}