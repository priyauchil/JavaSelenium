package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();;
		driver.get("https://www.flipkart.com/");
		Thread.sleep(6000);
		
		//Navigation
		driver.navigate().back();
		Thread.sleep(6000);
		driver.navigate().forward();
		Thread.sleep(6000);
		driver.navigate().refresh();
		Thread.sleep(6000);
		
		//Title
		String title = driver.getTitle();
		System.out.println(title);
		
		//get URL
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.close();
	}

}
