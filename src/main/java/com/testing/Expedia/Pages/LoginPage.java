package com.testing.Expedia.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testing.Base.BasePage;
import com.testing.Expedia.Pages.session.LandingPage;
import com.testing.util.ExpConstants;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {

		super(driver);
	}    

	@FindBy(xpath = ExpConstants.EMAIL)
	public WebElement email;

	@FindBy(xpath = ExpConstants.PASSWORD)
	public WebElement passwd;

	@FindBy(xpath = ExpConstants.SIGNIN_BUTTON)
	public WebElement Signinbutton;
	
	
	@FindAll(@FindBy(xpath = ExpConstants.SIGNIN_BUTTON))
	public List<WebElement> TextHeader;
	
	public Object dologin(String Username, String Password) {

		email.sendKeys(Username);
		passwd.sendKeys(Password);
		Signinbutton.click();
		
		if (gettextcount()<1)
			System.out.println("no count");
		boolean LandingPage = true;

		if (LandingPage)
			return PageFactory.initElements(driver, LandingPage.class);
		else
			return PageFactory.initElements(driver, LoginPage.class);
		

	}
	
	public int gettextcount(){
		
		int size = TextHeader.size();
				
			return size;	
	}

}
