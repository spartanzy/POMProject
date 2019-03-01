package com.testing.Expedia.Pages;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.testing.Base.BasePage;
import com.testing.util.ExpConstants;

public class FlightReservePage extends BasePage{
	
	public FlightReservePage(WebDriver driver) {

		super(driver);
	}

	@FindBy(name = ExpConstants.TRAVELTYPE_BUTTON)
	private WebElement TravelonewayButton;
	
	@FindBy(id = ExpConstants.FLYFROM_EDIT)
	private WebElement Flyfromwebedit;
	
	@FindBy(id = ExpConstants.FLYTO_EDIT)
	private WebElement Flytowebedit;
	
	@FindBy(id = ExpConstants.FLYDATEFROM_EDIT)
	private WebElement FlydatefromEdit;
	
	@FindBy(id = ExpConstants.SEARCHBUTTON)
	private WebElement searchButton;
	
	public FlightResultsPage flightResultOneway(String Dt, String Origin, String Dest){
		
		TravelonewayButton.click();
		Flyfromwebedit.sendKeys(Origin);
		Flytowebedit.sendKeys(Dest);
		Date dt1;
		try {
			dt1 = new SimpleDateFormat("dd/mm/yyyy").parse(Dt);
		
		if(dt1.after(new Date())){
			System.out.println("Date is before the current date");
			Assert.fail();
			}else{
				
				FlydatefromEdit.clear();
				FlydatefromEdit.sendKeys(dt1.toString());
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		searchButton.click();
		
		return PageFactory.initElements(driver, FlightResultsPage.class);
		
	}
}

