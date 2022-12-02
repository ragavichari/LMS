package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.Baseclass;



public class logout extends Baseclass {
	 
		public logout (WebDriver webDriver)
		{
			
			PageFactory.initElements(webDriver,this);
		}
		
		@FindBy(xpath = " ")
		@CacheLookup
		public WebElement login;
		@FindBy(xpath = " ")
		@CacheLookup
		public WebElement clicklogout;
		@FindBy(xpath = " ")
		@CacheLookup
		public WebElement navloginscreen;
		
		public void logon()
	    {
	    	login.isDisplayed();
	    }
		public void clicklogout()
	    {
			clicklogout.click();
	    }
		public void navlogout()
	    {
			navloginscreen.click();
	    }
	}

