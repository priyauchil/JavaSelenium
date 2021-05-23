package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Text {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");		
		driver.findElement(By.cssSelector("a[href='login.php?type=login']")).click();
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("user");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("user");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		//if(title.equals(title))
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.findElement(By.cssSelector("span[class='hidden-xs']")).click();
		driver.findElement(By.cssSelector("a[href='logout.php']")).click();
		driver.close();

	}

}
