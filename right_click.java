import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class right_click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.gecko.driver", "E:\\SOFTWARE\\Selenium\\geckodriver.exe");
	       FirefoxDriver driver = new FirefoxDriver();
		   driver.manage().window().maximize();
		   driver.get("https://demoqa.com/buttons");
		   System.out.println("demoqa webpage displayed");
		   
		   //Retrieve WebElement to perform right click
		   WebElement btnElement = driver.findElement(By.id("rightClickBtn"));
			 
		   Actions actions = null;
		//Right Click the button to display Context Menu&nbsp;
		   actions.contextClick(btnElement).perform();
		   System.out.println("Right click Context Menu displayed");
			 
		   //Following code is to select item from context menu which gets open up on right click, this differs 
		   //depending upon your application specific test case: 
		   //Select and click 'Copy me' i.e. 2nd option in Context menu 
		   WebElement elementOpen = driver.findElement(By.xpath(".//div[@id='rightclickItem']/div[1]"));  
		   elementOpen.click(); 
			 
		   // Accept the Alert 
		   driver.switchTo().alert().accept();
		   System.out.println("Right click Alert Accepted");
			 
			 Thread.sleep(5000);
		   // driver.quit();
		
	}

}
