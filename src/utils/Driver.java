package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {
	
	public static WebDriver driver;
	
	public static WebDriver getDriver() {
		if (driver == null) {
			switch(DataReader.getProperty("browser")) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "C:\\ToolsSelenium\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
				break;
			case "firefox":
				System.setProperty("webdriver.gecko.driver", "/Users/primetech/Documents/Tools/geckodriver");
				driver = new FirefoxDriver();
				break;
			case "safari":
				driver = new SafariDriver();
				break;
			default:
				System.setProperty("webdriver.chrome.driver", "C:\\ToolsSelenium\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
				break;
			}
			
		}
		return driver;
	}
	
	public static void QUITDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
