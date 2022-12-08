package selinium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class scrShotNote {
	 public static WebDriver driver;
	public static void scShot(String imgName) throws IOException {
		
		Date d = new Date ();
		SimpleDateFormat s = new SimpleDateFormat("yyyy-mm-dd HH-MM-SS");
		 String td = s.format(d);
		 System.out.println(td);
		 
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File destination = new File("C:\\Users\\Dell\\Desktop\\screenShot\\"+ imgName +td +".jpg");
			
			FileHandler.copy(src, destination);
			
			System.out.println("scr shot taken");
	
		
	}
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		
		scShot("mail");
		
	}

}
