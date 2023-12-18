package practice1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// setup chrome
		WebDriverManager.chromedriver().setup();

		//Launch the browser
		ChromeDriver driver = new ChromeDriver();

		//Get URL
		driver.get("https://www.google.com/");
		//Maximize the Window
		driver.manage().window().maximize();

	}

}
