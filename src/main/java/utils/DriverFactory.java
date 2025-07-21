package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	private static ThreadLocal<WebDriver> driver= new ThreadLocal<>();
	public static WebDriver getDriver() {
		if(driver.get()==null) {
			String browser=ConfigReader.getProperty("browser");
			switch(browser.toLowerCase()) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver.set(new ChromeDriver());
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver.set(new FirefoxDriver());
				break;
			default:
				throw new IllegalArgumentException("Unsupported browser: " + browser);
			}
				driver.get().manage().window().maximize();
		}
		return driver.get();
		}
		public static void quitDriver() {
			if(driver.get()!=null) {
				driver.get().quit();
				driver.remove();
			}
		}
	
}
