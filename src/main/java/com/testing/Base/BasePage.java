package com.testing.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.testing.commonPages.TopMenu;
// This Page is used for more of re-usability across all pages can have common verification functions
public class BasePage {

	public WebDriver driver;

	public TopMenu Menu;

	public BasePage() {
	}

	public BasePage(WebDriver driver) {

		this.driver = driver;
		Menu = PageFactory.initElements(driver, TopMenu.class);
	}

	public void verifytitle(String ExpectedTitle) {

		System.out.println("text");

	}

	public void verifytext(String Locator, String ExpectedText) {

		System.out.println("text");

	}

	public boolean IsElementPresent(String Locator) {

		return false;
	}

	public TopMenu getMenu()
	{

		return Menu;
	}

}
