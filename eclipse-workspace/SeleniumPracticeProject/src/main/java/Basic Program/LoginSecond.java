package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSecond {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		//set Driver
		WebDriver driver=new ChromeDriver();
		
		//2.Launch URL
		driver.get("https://www.google.com/");
		
		
		
		//thread sleep
		Thread.sleep(4000);
		
		//close driver
		driver.close();
		

	}

}
