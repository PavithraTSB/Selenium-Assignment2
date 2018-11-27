package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Magento {

	public static void main(String[] args) throws InterruptedException {
		
    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    
    driver.manage().window().maximize();
    
    driver.get("http://magento.com/");
    
    driver.findElement(By.xpath("//span[text()='Account']/parent::a")).click();
    
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//button[@type='button']")).click();
    
    driver.findElement(By.id("firstname")).sendKeys("Pavithra");
    driver.findElement(By.id("lastname")).sendKeys("Prasanth");
    driver.findElement(By.name("email")).sendKeys("hihello@gmail.com");
    
    driver.findElement(By.id("password")).sendKeys("Acadgild@123");
    driver.findElement(By.xpath("//input[@id='confirmation']")).sendKeys("Acadgild@123");
    
    driver.findElement(By.xpath("//input[@id='agree_terms']")).click();
		
	}

}

