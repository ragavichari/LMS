package stepdefinition;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import utility.helper;

public class Hooks {
	@Before
	  public static void setUp() {
	    	
	    	helper.setUpDriver();
	  }
	
	  @After
	  public static void tearDown(Scenario scenario) {
	
	      if(scenario.isFailed()) {
	          final byte[] screenshot = ((TakesScreenshot) helper.getDriver()).getScreenshotAs(OutputType.BYTES);
	          scenario.attach(screenshot, "image/png", scenario.getName());
	      }
	      
	      helper.tearDown();
	  }
	  
}