package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search for Courses']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@value='go']")).click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		WebElement ele = driver.findElement(By.xpath("//div[@class='tooltip tooltip-wrap tooltipstered']"));
		Actions a=(Actions) (driver);
		a.moveToElement(ele).perform();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//body[class='course_body en']"));
		
		driver.close();
		

	}

}
