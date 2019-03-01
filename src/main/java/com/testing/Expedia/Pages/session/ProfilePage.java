package com.testing.Expedia.Pages.session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.testing.Base.BasePage;

public class ProfilePage extends BasePage {

	@FindBy(xpath = ".//h2[text()='My Travel Details']")
	public WebElement MyTravelDetails;

	public ProfilePage(WebDriver driver) {

		super(driver);
	}

}
