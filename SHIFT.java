import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SHIFT {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.gecko.driver", "E:\\SOFTWARE\\Selenium\\geckodriver.exe");
	       FirefoxDriver driver = new FirefoxDriver();
	       driver.manage().window().maximize();
		   driver.get("https://www.google.com/");
		   WebElement search = driver.findElement(By.name("q"));
		   Actions builder = new Actions(driver);
		   org.openqa.selenium.interactions.Action src = builder.moveToElement(search)
				   .click()
				   .keyDown(Keys.SHIFT)
				   .sendKeys("rose")
				   .keyUp(Keys.SHIFT)
				   .sendKeys(" flowers")
				   .doubleClick()
				   .build();
		   src.perform();
		   Thread.sleep(5000);
		   driver.findElement(By.name("btnK")).click();
		   
		   Thread.sleep(3000);
		   driver.quit();
	}

}
