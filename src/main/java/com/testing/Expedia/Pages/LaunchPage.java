package com.testing.Expedia.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testing.Base.BasePage;
import com.testing.util.ExpConstants;

public class LaunchPage extends BasePage {

	public LaunchPage(WebDriver driver) {

		super(driver);
	}

	@FindBy(xpath = ExpConstants.ACCOUNTS_TAB)
	public WebElement Accounttab;

	@FindBy(xpath = ExpConstants.SIGNIN_LINK)
	public WebElement signinlink;
	
	@FindBy(xpath = ExpConstants.FLIGHT_BUTTON)
	public WebElement flightButton;

	
	public LoginPage gotologinpage() {

		driver.get(ExpConstants.EXPEDIAURL);
		Accounttab.click();
		signinlink.click();
		return PageFactory.initElements(driver, LoginPage.class);

	}
	public FlightReservePage gotoFlightPage(){
		driver.get(ExpConstants.EXPEDIAURL);
		flightButton.click();		
		return PageFactory.initElements(driver, FlightReservePage.class);
	}
}
