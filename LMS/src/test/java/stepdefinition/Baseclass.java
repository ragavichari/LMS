package stepdefinition;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import pageobject.logout;
import pageobject.user;
import stepdefinition.Baseclass;



	//import pageobject.Batch;
	//import pageobject.home;
	
	public class Baseclass {
		public user use;
		public logout logou;

		
	}



