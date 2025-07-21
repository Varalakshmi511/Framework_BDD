package page_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.ConfigReader;
import utils.DriverFactory;

public class GoogleHomePage {

	private WebDriver driver;
	private By searchBox=By.name("search_query");
	private By openFirstsearchResult=By.xpath("//*[@id='rso']/div[1]/div/div/div/div[1]/div/div/span/a");
	
	public GoogleHomePage() {
		this.driver=DriverFactory.getDriver();
	}
	
	
	public void openHomePage() {
		driver.get(ConfigReader.getProperty("base.url"));	
	}
	public void enterSearchClickEnter(String Query) {
		WebElement searchInput=driver.findElement(searchBox);
		searchInput.clear();
		searchInput.sendKeys(Query);
		driver.findElement(searchBox).sendKeys(Keys.ENTER);;;
		
	}
	public void openFirstSearch() {
		driver.findElement(openFirstsearchResult).click();	
	}
}

