package selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Dell\\Downloads\\geckodriver-v0.32.0-win-aarch64.exe");
		WebDriver driver = new FirefoxDriver ();
      driver.get("https://www.facebook.com/r.php");
		
	}

}
