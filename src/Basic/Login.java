package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.name("Login")).click();
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("priyauchil88@gmail.com");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("Tataconsu@143");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		driver.findElement(By.cssSelector("a[class='_2s25 _cy7']")).click();
		//driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(553000);
		driver.close();

	}

}
