package sample;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IE {

	public static void main(String[] args)  {
		
		//Connecting with browser
		//System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.ie.driver","./Drivers/IEDriverServer.exe");
		
		WebDriver driver=new InternetExplorerDriver();
		
		//Launching google.com
		driver.get("https://www.google.com/");
		
	    //Maximizing the window
		driver.manage().window().maximize();

		//Getting the title of the window and storing it in string and printing the title as output
		 String title = driver.getTitle();
		 System.out.println("Title of the page is :"+title);
		 
		 ///Getting the current url of the window and storing it in string and printing the url as output
		 String currentUrl = driver.getCurrentUrl();
		 System.out.println(currentUrl);
		 
//		 String pageSource = driver.getPageSource();
//		 System.out.println(pageSource);
		 
		 String windowHandle = driver.getWindowHandle();
		 System.out.println(windowHandle);
	}

}
