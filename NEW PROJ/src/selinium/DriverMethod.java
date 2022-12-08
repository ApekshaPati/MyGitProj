package selinium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/r.php");
    
    Thread.sleep(2000);  //  giving dealy 
    
   // driver.close();
    
   // driver.quit();
 //to verify title   
   String t= driver.getTitle();
   System.out.println(t);
   String expt = "Sign up for Facebook | Facebook";
   if(t.equalsIgnoreCase(expt)) {
	   System.out.println("navigate to right page");
   }
   else {
	   System.out.println("wrong page");
	    }
// open new window    
     driver.switchTo().newWindow(WindowType.TAB);
     driver.get("https://meet.google.com");
// To  get currnent url
    String url = driver.getCurrentUrl();
     System.out.println(url);
// To maximize & minimize browser
     driver.manage().window().maximize();
     Thread.sleep(2000);
     driver.manage().window().minimize();
     Thread.sleep(2000);
 // To set position of browser (x,y co-ordinator axis)
     Point p = new  Point(100,400);
     driver.manage().window().setPosition(p);
     Thread.sleep(2000);
// To change size of browser (length , height of pixel)
     Dimension d = new Dimension (100,400);
     driver.manage().window().setSize(d);
     Thread.sleep(2000);
 //To navigate current webpage forward,backward  refresh
     driver.navigate().to("https://www.insightsonindia.com/insights-ias-upsc-current-affairs/");
     Thread.sleep(2000);
     driver.navigate().back();
     Thread.sleep(2000);
     driver.navigate().forward();
     Thread.sleep(2000);
     driver.navigate().refresh();
     
     
}
}