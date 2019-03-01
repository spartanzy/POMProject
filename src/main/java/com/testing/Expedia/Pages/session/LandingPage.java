package com.testing.Expedia.Pages.session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testing.Base.BasePage;
import com.testing.util.ExpConstants;

public class LandingPage extends BasePage {

	public LandingPage(WebDriver driver) {

		super(driver);
	}

	@FindBy(xpath = ExpConstants.PROFILE_LINK)
	public WebElement ProfileLink;

	@FindBy(xpath = ExpConstants.PROFILE_ACCT)
	public WebElement ProfileAcct;

	public ProfilePage gotoprofilepage() {

		ProfileLink.click();
		ProfileAcct.click();
		return PageFactory.initElements(driver, ProfilePage.class);

	}
}
