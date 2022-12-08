package selinium;

import java.io.File;
import java.io.IOException;



import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class scrShotTimeDate {
	 public static WebDriver driver;
	
	public static void capscreenshot() throws IOException  {
		
		
		 Calendar cal = Calendar.getInstance();
		 Date time = cal.getTime();
		
		System.out.println(time);
		
		String timeST = time.toString().replace(" ", "_").replace(":", "");
		
		System.out.println(timeST);
		
      File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\Dell\\Desktop\\screenShot\\"+ timeST +".jpg");
		
		FileHandler.copy(src, destination);
		
		System.out.println("scr shot taken");
		
	}

	
public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe");
	   WebDriver  driver = new ChromeDriver();
	   driver.get("https://www.youtube.com/");
	   
	  // Thread.sleep(6000);
	   capscreenshot();
	   
	  
		
		
		
	
		

	

}
}