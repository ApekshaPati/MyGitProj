package Firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class basic {
	
public static void main(String[] args){
		
		//System.setProperty("webdriver.chrome.driver","");
			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Dell\\eclipse-workspace\\NEW PROJ\\src\\Firefox\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver ();
	      driver.get("https://www.facebook.com/r.php");
	}

}
