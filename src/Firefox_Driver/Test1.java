package Firefox_Driver;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.gecko.driver", "C:\\Users\\dell\\Desktop\\sell jars\\geckodriver-v0.31.0-win64\\geckodriver.exe");

WebDriver driver= new FirefoxDriver();
		
		
		driver.get("https://kite.zerodha.com/");
		
		
		

		
		
	}

}
