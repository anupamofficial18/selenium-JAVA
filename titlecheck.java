import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class titlecheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "E:\\SOFTWARE\\Selenium\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "YouTube";
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		driver.close();
		Thread.sleep(3000);
	}

}
