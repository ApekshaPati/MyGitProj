package ppPOPUP;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CHILDbrowser {
	
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
	// to open child window	
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
	// to save address of multiple windows open on page	
		Set<String> id = driver.getWindowHandles();
		ArrayList<String> alt= new ArrayList<String> (id);
	
	// to take id of child browser	
		String cw = alt.get(1);
		//System.out.println(cw);
	 // to change focus on child window	
		driver.switchTo().window(cw);
	// to validate child window by clicking on any button on it	
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	// to change focus on main window	
		driver.switchTo().window(alt.get(0));
	// to validate we are on main window by clicking on new window button	
		driver.findElement(By.xpath("//input[@name = 'NewWindow']")).click();
		

}
}