package selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class selenium {
  public static void main(String[] args) {
	System.setProperty("webdriver.opera.driver", "C:\\Users\\Dell\\Downloads\\operadriver_win64\\operadriver_win64\\operadriver.exe");
	  WebDriver driver = new OperaDriver();
	  
	  driver.get("https://github.com/operasoftware/operachromiumdriver/releases");
	  
	  
}	

}