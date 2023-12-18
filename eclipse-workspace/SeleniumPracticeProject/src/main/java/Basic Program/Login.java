package practice1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// setup 
				WebDriverManager.chromedriver().setup();
				//System.setProperty("webdriver.chrome.driver", "C:\\Users\\RIYASDEEN\\Downloads\\chromedriver_win32\\chromedriver.exe");

				//Launch the browser
				ChromeDriver driver = new ChromeDriver();

				//Get URL
				driver.get("http://leaftaps.com/opentaps/control/main");
				//Maximize the Window
				driver.manage().window().maximize();

				//Get Title
				String title = driver.getTitle();
				System.out.println(title);

	}

}
