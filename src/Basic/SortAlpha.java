package Basic;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortAlpha {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("abc");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("pqr");
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("pqr@mno.com");
		driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']")).sendKeys("pqr@mno.com");
		driver.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys("pqr@mno");
		
		
		WebElement ele = driver.findElement(By.cssSelector("select[id='month']"));
		Select s = new Select(ele);
		List<WebElement> option = s.getOptions();
		//System.out.println(option.size());
		for(WebElement allOptions:option) {
			System.out.println(allOptions.getText());
		}
		s.selectByValue("3");
				
		Thread.sleep(3000);
		driver.close();


	}

}
