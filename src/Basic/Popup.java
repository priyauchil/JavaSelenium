package Basic;

import java.awt.event.ActionEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.xpath("//div[@id='container_users']")).click();
		driver.findElement(By.xpath("//div[@class='components_button_label']")).click();
		driver.findElement(By.xpath("//input[@id='createUserPanel_firstNameField']")).sendKeys("ABC");
		driver.findElement(By.xpath("//div[@class='closeButton hideButton_panelContainer']")).click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		Thread.sleep(2000);
		a.dismiss();
		Thread.sleep(2000);
		driver.close();
		
	}

}
