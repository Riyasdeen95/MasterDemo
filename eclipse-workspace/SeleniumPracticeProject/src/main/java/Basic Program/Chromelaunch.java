package practice1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chromelaunch {

	public static void main(String[] args) {
		
		//Setup The driver 
		WebDriverManager.chromedriver().setup();
		
		//Launch the Browser
		ChromeDriver driver = new ChromeDriver();

	}

}
