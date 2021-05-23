package Basic;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Properties {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Properties p=new Properties();
		p.load(new FileInputStream("./Data.properties"));
		driver.getp

	}

}
