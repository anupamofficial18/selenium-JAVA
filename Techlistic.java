import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Techlistic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		   System.setProperty("webdriver.gecko.driver", "E:\\SOFTWARE\\Selenium\\geckodriver.exe");
	       FirefoxDriver driver = new FirefoxDriver();
		   driver.manage().window().maximize();
		   Thread.sleep(5000);
		   driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		   driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div[1]/div/div/h2[2]/div[1]/div/div[2]/input")).sendKeys("Pehla naam");
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div[1]/div/div/h2[2]/div[1]/div/div[5]/input")).sendKeys("Dooja naam");
		   Thread.sleep(2000);
		   driver.findElement(By.id("sex-0")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.id("exp-3")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.id("datepicker")).sendKeys("19th Jan 1979");
		   Thread.sleep(2000);
		   driver.findElement(By.id("profession-1")).click();
		   Thread.sleep(2000);
		        
	        
		   driver.findElement(By.id("tool-1")).click();
		   Thread.sleep(2000);  
		   driver.findElement(By.id("continents")).sendKeys("Africa");
		   Thread.sleep(3000);
		   driver.findElement(By.id("selenium_commands")).sendKeys("WebElement Commands");
		   Thread.sleep(3000);
		   driver.findElement(By.id("photo")).sendKeys("D:\\fe.PNG");
		   Thread.sleep(2000);
		   driver.findElement(By.id("submit")).click();
		   
		   Thread.sleep(4000);
		   driver.quit();
	}

}
