package wwWEBTABLE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WTABLE1 {
	
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='ws-table-all']//tr"));
		System.out.println("No.Of ROWS= " + rows.size());
		
		for(int i =1; i<rows.size(); i++) {
		
		List<WebElement> cells = driver.findElements(By.xpath("//table[@class='ws-table-all']//tr[ \"+(i+1)+\"]//td"));
		
              for(int j =0; j<cells.size(); j++) {
            	  
            	  System.out.print(cells.get(j).getText()+"  ");
              }
              System.out.println();
}
}
}