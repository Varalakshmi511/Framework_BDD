package Stepdefinitions.hooks;

import org.openqa.selenium.WebDriver;

import utils.DriverFactory;

public class Hooks {

	WebDriver driver;
	
	public void setup()
	{
	System.out.println("starting a new test case");	
	}
	
	
	public void teardown()
	{
		DriverFactory.quitDriver();
		System.out.println("test case execution completed");
	}
}
