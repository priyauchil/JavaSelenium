package Basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.cssSelector("select[class='chosen-select']"));
		Select s = new Select(ele);
		
		s.selectByValue("category.php?category=testing");
		String title = driver.getTitle();
		System.out.println("Title is: " + title);
		
		if(title.equals("SkillRary Courses")){
			System.out.println("Successful");
		}
		else
		{
			System.out.println("Failure");
		}
		Thread.sleep(3000);
		driver.close();

	}

}
