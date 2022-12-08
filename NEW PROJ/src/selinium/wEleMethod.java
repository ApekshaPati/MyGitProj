package selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class wEleMethod {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		//is enable method-----------------------------------
		boolean r1 = driver.findElement(By.xpath("(//button[@type='submit'])[1]")).isEnabled();
		System.out.println(r1);
		
		// is select method-------------------------------------
		boolean r2 = driver.findElement(By.xpath("(//label[@class='_58mt'])[1]")).isSelected();
		System.out.println(r2);
		
		// is display method--------------------------------------
		boolean r3 = driver.findElement(By.xpath("//select[@name='preferred_pronoun']")).isDisplayed();
		System.out.println(r3);
		boolean r4 = driver.findElement(By.xpath("//input[@type='text'][1]")).isDisplayed();
		System.out.println(r4);
		
		// get text method-------------------------------------------
		String r5 = driver.findElement(By.xpath("//select[@name='birthday_month']")).getText();
		System.out.println(r5);
		
		// get attribute value method----------------------------------
		String r6 = driver.findElement(By.xpath("//input[@type='text'][1]")).getAttribute("name");
		System.out.println(r6);
		
		// get option method  for getting size of list box--------------------------------------------------
	WebElement year	= driver.findElement(By.xpath("//select[@title='Year']"));
	Select aa = new Select (year);
	
	        List<WebElement> r7 = aa.getOptions();
	     System.out.println(r7);
	     int size = r7.size();
	     System.out.println("Size of list box = " + size);
	                        // to print text in list box-----
	  for(int i =0; i <= r7.size()-1; i++) {
		  
		  System.out.println(r7.get(i).getText());
		  
	  }
	  // is multiple method for list box
	  WebElement year1	= driver.findElement(By.xpath("//select[@title='Year']"));
		Select bb = new Select (year1);
		boolean r8 = bb.isMultiple();
		System.out.println("is multiple = "+r8);
	  
}
}