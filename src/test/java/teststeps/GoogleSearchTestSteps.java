package teststeps;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import utils.DriverFactory;

public class GoogleSearchTestSteps {
private WebDriver driver;

public GoogleSearchTestSteps() {
	this.driver=DriverFactory.getDriver();
}
public void verifyTitleContains(String expected) {
	String actualTitle=driver.getTitle();
	Assert.assertTrue(actualTitle.contains(expected),"page title does not contains exact match");
}
}
