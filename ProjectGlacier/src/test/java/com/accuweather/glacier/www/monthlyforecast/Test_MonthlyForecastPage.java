package com.accuweather.glacier.www.monthlyforecast;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.accuweather.glacier.www.AccuWeatherBaseTest;
import com.accuweather.glacier.www.pages.LandingPage;
import com.accuweather.glacier.www.pages.MonthlyForeCastPage;
import com.chameleon.selenium.web.WebPageLoaded;


public class Test_MonthlyForecastPage extends AccuWeatherBaseTest {
	String zipcode = "16801";
	String ActualForecastPageTitle;
	String ExpectedForecastPageTitle = "State College Weather - AccuWeather Forecast for PA 16801";
	private LandingPage landingpage = new LandingPage();
	private MonthlyForeCastPage monthlyforecast = new MonthlyForeCastPage();
	 
	
	/*
	 * @Test(priority=1) public void TC1_navigateToAWWeatherForecastPage() {
	 * testStart("Is AW Weather Forecast Page Displayed From Home Page");
	 * landingpage.enterZipcodeInSearchField(zipcode);
	 * landingpage.clickOnZipcodeSearchIcon();
	 * waitUntilElementIsDisplayedOrClickable();
	 * waitUntilWindowExistsWithTitle(ExpectedForecastPageTitle);
	 * WebPageLoaded.isDomInteractive(1000); ActualForecastPageTitle =
	 * getDriver().getTitle(); Assert.assertEquals(ActualForecastPageTitle,
	 * ExpectedForecastPageTitle); }
	 */
	
	@Test(priority=2) public void TC1_navigateToAWMonhtlyWeatherPage() {
		testStart("Is AW Monthly Weather page Displayed From AW Weather Forecast Page");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(ExpectedForecastPageTitle);
		WebPageLoaded.isDomInteractive(1000);
		monthlyforecast.clickOnMethodTab();
		WebPageLoaded.isDomInteractive(1000);
		}
}
