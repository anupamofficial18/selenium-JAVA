import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class pop {
    public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.gecko.driver", "E:\\SOFTWARE\\Selenium\\geckodriver.exe");
	       FirefoxDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        
     // This step will result in an alert on screen
        WebElement element = driver.findElement(By.id("alertButton"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
        Alert confirmationAlert = driver.switchTo().alert();
        String alertText = confirmationAlert.getText();
        System.out.println("Alert text is " + alertText);
        confirmationAlert.accept();
        Thread.sleep(4000);
         
     // This step will result in an alert on screen
        WebElement element11 = driver.findElement(By.id("timerAlertButton"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element11);
        Alert confirmationAlert11 = driver.switchTo().alert();
        String alertText11 = confirmationAlert11.getText();
        System.out.println("Alert text is " + alertText11);
        confirmationAlert11.accept();
        
     // This step will result in an alert on screen
        WebElement element1 = driver.findElement(By.id("confirmButton"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element1);
        Alert confirmationAlert1 = driver.switchTo().alert();
        String alertText1 = confirmationAlert1.getText();
        System.out.println("Alert text is " + alertText1);
        confirmationAlert1.accept();
        Thread.sleep(4000);
        
      // This step will result in an alert on screen
        WebElement element111 = driver.findElement(By.id("promtButton"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element111);
        Alert confirmationAlert111 = driver.switchTo().alert();
        String alertText111 = confirmationAlert111.getText();
        System.out.println("Alert text is " + alertText111);
        confirmationAlert111.accept();
        
        
        Thread.sleep(4000);
        driver.quit();
    }
}