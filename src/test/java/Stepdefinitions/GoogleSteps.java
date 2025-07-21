package Stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_classes.GoogleHomePage;
import teststeps.GoogleSearchTestSteps;


public class GoogleSteps {

	private GoogleHomePage googleHomePage;
	private GoogleSearchTestSteps googleSearchTestSteps;
	
	@Given("the User is on youtube home page")
	public void navigateToGoogleHomePage() throws InterruptedException {
		googleHomePage=new GoogleHomePage();
		googleHomePage.openHomePage();
		Thread.sleep(8000);
		googleSearchTestSteps=new GoogleSearchTestSteps();
		
	}
	@When("the user searches with the {string}")
	public void searchForQuery(String query) throws InterruptedException
	{
		googleHomePage.enterSearchClickEnter(query);
	}
	@Then("the page title should contain {string}")
	public void verifyPageTitle(String expected)
	{
		googleSearchTestSteps.verifyTitleContains(expected);
	}
}
