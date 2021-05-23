package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		org.openqa.selenium.WebElement shp = driver.findElement(By.linkText("/shop/home-living"));
		System.out.println(shp.getText());
		driver.close();

	}

}
