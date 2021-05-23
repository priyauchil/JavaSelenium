package Basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlphaSort {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		WebElement ele = driver.findElement(By.cssSelector("select[id='month']"));
		Select s = new Select(ele);
		List<WebElement> option = s.getOptions();
		
		ArrayList a = new ArrayList<>();
				
		//System.out.println(option.size());
		for(WebElement allOptions:option) {
			String text = allOptions.getText();
			System.out.println(text);
			a.add(text);
		}
		//s.selectByValue("3");
		System.out.println("********After Sorting*********");
		Collections.sort(a);
		for(Object sortedOption:a) {
			System.out.println(sortedOption);
			
		}
		Thread.sleep(3000);
		driver.close();

	}

}
