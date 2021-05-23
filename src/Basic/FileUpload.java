package Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendatPopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='login.php?type=login']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("user");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.findElement(By.xpath("//span[@class='hidden-xs']")).click();
		driver.findElement(By.xpath("//a[@href='profile.php']")).click();
		driver.findElement(By.xpath("//a[@href='profile_update.php']")).click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		WebElement browser = driver.findElement(By.xpath("//input[@name='photo']"));
		browser.sendKeys("C:\\Users\\Test\\Documents\\p.txt");
		//driver.findElement(By.name("photo")).sendKeys("C:\\Users\\Test\\Documents\\p.txt");
		

	}

}
