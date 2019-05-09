package com.accuweather.glacier.www.threedayforecast;

import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.accuweather.glacier.www.AccuWeatherBaseTest;
import com.accuweather.glacier.www.pages.ForeCastWeatherPage;
import com.accuweather.glacier.www.pages.LandingPage;
import com.accuweather.glacier.www.pages.MonthlyForeCastPage;
import com.accuweather.glacier.www.pages.ThreeDayForecastPage;
import com.chameleon.utils.date.SimpleDate;

public class Test_ThreeDayForecast extends AccuWeatherBaseTest {

	String zipcode = "16801";
	String ActualForecastPageTitle;
	String ExpectedForecastPageTitle = "State College Weather - AccuWeather Forecast for PA 16801";
	String pageTitle3day = "Weather in State College - AccuWeather Forecast for PA 16805";
	private LandingPage landingpage = new LandingPage();
	private ForeCastWeatherPage forecastpage = new ForeCastWeatherPage();
	private MonthlyForeCastPage monthlyforecast = new MonthlyForeCastPage();
	private SimpleDate simpledate = new SimpleDate();

	ThreeDayForecastPage threeDayForecastPage = new ThreeDayForecastPage();

	@Test(priority = 1)
	public void TC1_NowTabOnCityForecastPage() {
		testStart("Navigate to 3 day  forecast");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(ExpectedForecastPageTitle);
		threeDayForecastPage.isNowTabHighlighted();

	}

	@Test(priority = 2)
	public void TC2_VerifyingWeatherCardsVisibility() {
		testStart("Navigate to 3 day  forecast");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(ExpectedForecastPageTitle);
		Assert.assertTrue(threeDayForecastPage.weatherCardIsDisplayed("currentWeather"));
		Assert.assertTrue(threeDayForecastPage.weatherCardIsDisplayed("Today"));
		Assert.assertTrue(threeDayForecastPage.weatherCardIsDisplayed("Today"));
		Assert.assertTrue(threeDayForecastPage.weatherCardIsDisplayed("Tonight"));
		Assert.assertTrue(threeDayForecastPage.weatherCardIsDisplayed("Tomorrow"));
	}
	
	// 3day class files

	@Test(priority = 3)
	public void TC3_VerifyingWeatherCardElementsisDisplayed() {
		testStart("Navigate to 3 day  forecast");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(ExpectedForecastPageTitle);
		threeDayForecastPage.weatherCardElementsIsDisplayed("Current Weather");
		threeDayForecastPage.weatherCardElementsIsDisplayed("Today");
		threeDayForecastPage.weatherCardElementsIsDisplayed("Tonight");
		threeDayForecastPage.weatherCardElementsIsDisplayed("Tomorrow");

	}

	@Test(priority = 3)
	public void TC4_VerifyingnavigatingToCurrentWeatherLocationKeyPage() {
		testStart("Navigate to 3 day  forecast");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(ExpectedForecastPageTitle);
		threeDayForecastPage.weatherCardElementsIsDisplayed("Current Weather");
		threeDayForecastPage.navigatingToCurrentWeatherLocationKeyPage("Current Weather");

	}
	
	
	
	@Test(priority = 3)
	public void TC5_VerifyingTodayWeatherCardDetails() {
		testStart("Navigate to 3 day  forecast");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(ExpectedForecastPageTitle);
		threeDayForecastPage.weatherCardElementsIsDisplayed("Current Weather");
		threeDayForecastPage.weatherCardElementsIsDisplayed("Today");
		threeDayForecastPage.todayWeatherMax_hiTemperature();
		

	}
	
	
	
	@Test(priority = 3)
	public void TC6_VerifyingTonightWeatherCardDetails() {
		testStart("Navigate to 3 day  forecast");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(ExpectedForecastPageTitle);
		threeDayForecastPage.weatherCardElementsIsDisplayed("Current Weather");
		threeDayForecastPage.weatherCardElementsIsDisplayed("Tonight");
		threeDayForecastPage.tonightWeatherMin_loTemperature();
		

	}
	
	
	
	@Test(priority = 3)
	public void TC7_VerifyingnArrowsThreeDayForecast() {
		testStart("Navigate to 3 day  forecast");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		threeDayForecastPage.animationBarForwardarrowActive();
		threeDayForecastPage.animationBarBackwardarrowActive();
	}
	
	@Test(priority = 3)
	public void TC8_VerifyingnForwardArrowclickThreeDayForecast() throws InterruptedException 
	{
		testStart("Navigate to 3 day  forecast");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		threeDayForecastPage.animationforwardarrowclick();
		Thread.sleep(300);
		threeDayForecastPage.animationforwardarrowclick();
		threeDayForecastPage.animationBarBackwardarrowActive();
		Thread.sleep(300);
		threeDayForecastPage.animationforwardarrowclick();
		Thread.sleep(300);
		threeDayForecastPage.animationforwardarrowclick();
		Thread.sleep(300);
		threeDayForecastPage.animationforwardarrowclick();
	}
	
	
	@Test(priority = 3)
	public void TC9_VerifyingnBackwardArrowclickThreeDayForecast() throws InterruptedException
	{	
		String ExpectedGreyColourBackarrow= "#878787";
		String ExpectedForwardarroworange ="#f59721";
		testStart("Navigate to 3 day  forecast");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
	    String cssBackarrowcolour=threeDayForecastPage.Backwardarrowcolour();
	    System.out.println("Actual backgroundd colour of Backward arrow "+cssBackarrowcolour);
	    String ActualBackarrowcolour = Color.fromString(cssBackarrowcolour).asHex();
	    System.out.println("Hex decimal value of colour is + "+ActualBackarrowcolour);
	    Assert.assertEquals(ActualBackarrowcolour, ExpectedGreyColourBackarrow,"Colour Not matching ");
	    System.out.println("Colour of the backarrow displayed as grey Background");
	    String cssforwardarrowcolour =threeDayForecastPage.Forwardarrowcolour();
	    System.out.println("Actual backgroundd colour of Forward arrow "+cssforwardarrowcolour);
	    String ActualForwardarrowcolour = Color.fromString(cssforwardarrowcolour).asHex();
	    System.out.println("Hex decimal value of colour is + "+ActualForwardarrowcolour);
	    Assert.assertEquals(ActualBackarrowcolour, ExpectedGreyColourBackarrow,"Colour Not matching ");
	}

	
	@Test(priority = 10)
	public void TC10_NextfourdaysThreeDayForecast() throws InterruptedException
	{
		String ExpectedGreyColourBackarrow= "#878787";
		String ExpectedForwardarroworange ="#f59721";
		testStart("Navigate to 3 day  forecast");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		threeDayForecastPage.animationforwardarrowclick();           //There is an Issue with Backward Arrow, Hex decimal code is same for Both Forward arrow and Backward Arrow 
		Thread.sleep(3000);
		threeDayForecastPage.animationforwardarrowclick();
		Thread.sleep(3000);
		String cssBackarrowcolour =threeDayForecastPage.Backwardarrowcolour(); 
		String ActualBackarrowcolour = Color.fromString(cssBackarrowcolour).asHex();
	    System.out.println("Colour of Backarrow after forward click is + "+ActualBackarrowcolour);
		
		
	}
}


