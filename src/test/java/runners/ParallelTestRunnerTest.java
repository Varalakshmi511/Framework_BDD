package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resources/features",
		glue= {"Stepdefinitions"},
		plugin= {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"},
		tags="@smoke or @regression",
		monochrome=true
		)


public class ParallelTestRunnerTest extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel=true)
	
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
}
