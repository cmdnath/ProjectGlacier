package com.accuweather.glacier.www.hourlyForecast;

import static com.accuweather.glacier.Environment.QA;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.accuweather.glacier.api.AccuweatherRest;
import com.accuweather.glacier.www.AccuWeatherBaseTest;
import com.accuweather.glacier.www.pages.HourlyForecastPage;
import com.accuweather.glacier.www.pages.LandingPage;
import com.chameleon.api.restServices.RestResponse;
import com.chameleon.selenium.web.WebPageLoaded;
import com.chameleon.utils.date.SimpleDate;



public class Test_HourlyForecastPage extends AccuWeatherBaseTest {
	String zipCode = "53558";
	String expectedLandingPageTitle = "Mc Farland Weather - AccuWeather Forecast for WI 53558";
	String actualHourlyForecastTitle;
	String expectedHourlyForecastTitle = "Mc Farland Hourly Weather - AccuWeather Forecast for WI 53558";
	private LandingPage landingPage = new LandingPage();
	private HourlyForecastPage hourlyPage = new HourlyForecastPage();
	private SimpleDate getDateTime = new SimpleDate();
	private String expectedHourlyPage_URL = "https://development.accuweather.com/en/us/mc-farland/53558/hourly-weather-forecast/23238_pc";
	private String expectedActiveTab_Color = "#f05514";
	
	/*@Test(priority=1)
	public void TC1_navigateToHourlyTab()
	{
		testStart("Validate the navigation to Hourly tab");
		landingPage.enterZipcodeInSearchField(zipCode);
		landingPage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedLandingPageTitle);
		WebPageLoaded.isDomInteractive(1000);
		
		hourlyPage.clickOnHourlyTab();
		WebPageLoaded.isDomInteractive(1000);
		actualHourlyForecastTitle = getDriver().getTitle();
		try {
			Assert.assertEquals(actualHourlyForecastTitle, expectedHourlyForecastTitle);	
		}
		catch(AssertionError ae)
		{
			System.out.println(ae.getMessage());
			Assert.fail("Hourly forecast title is not matching");
		}
		
	}
	
	@Test(priority=2)
	public void TC2_IsTimeDisplayed()
	{
		testStart("Validation if the time displayed is correct");
		landingPage.enterZipcodeInSearchField(zipCode);
		landingPage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedLandingPageTitle);
		WebPageLoaded.isDomInteractive(1000);
		
		hourlyPage.clickOnHourlyTab();
		WebPageLoaded.isDomInteractive(1000);
		try {
			if (getDateTime.getHour() > 12)
			{
				Assert.assertEquals(hourlyPage.getTime(), getDateTime.getHour()+" PM");
			}
			else
			{
				Assert.assertEquals(hourlyPage.getTime(), getDateTime.getHour()+" AM");
			}
		}
		catch(AssertionError ae)
		{
			System.err.println(ae.getMessage());
			Assert.fail();
		}
		
	}
	
	@Test(priority=3)
	public void TC3_IsDateCorrect()
	{
		testStart("Validation for date format");
		landingPage.enterZipcodeInSearchField(zipCode);
		landingPage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedLandingPageTitle);
		WebPageLoaded.isDomInteractive(1000);
		
		hourlyPage.clickOnHourlyTab();
		WebPageLoaded.isDomInteractive(1000);
		
		try
		{
			Assert.assertEquals(hourlyPage.getDate(),getDateTime.getCurrentDate("M/D"));
		}
		catch(AssertionError ae)
		{
			System.err.println(ae.getMessage());
			Assert.fail();
		}
	}
	
	@Test(priority=4)
	public void TC4_IsTemperatureFieldDisplayed()
	{
		testStart("Validation if the temperature field is displayed and is not empty");
		landingPage.enterZipcodeInSearchField(zipCode);
		landingPage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedLandingPageTitle);
		WebPageLoaded.isDomInteractive(1000);
		
		hourlyPage.clickOnHourlyTab();
		WebPageLoaded.isDomInteractive(1000);
		
		try
		{
			Assert.assertNotNull(hourlyPage.getTemperature());
		}
		catch(AssertionError ae)
		{
			System.err.println(ae.getMessage());
			Assert.fail();
		}
	}
	
	@Test(priority=5)
	public void TC5_IsWeatherConditionDisplayedAndIsNotEmpty()
	{
		testStart("Validation if the weather condition is displayed and is not empty");
		landingPage.enterZipcodeInSearchField(zipCode);
		landingPage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedLandingPageTitle);
		WebPageLoaded.isDomInteractive(1000);
		
		hourlyPage.clickOnHourlyTab();
		WebPageLoaded.isDomInteractive(1000);
		
		try
		{
			Assert.assertNotNull(hourlyPage.getWeather());
		}
		catch(AssertionError ae)
		{
			System.err.println(ae.getMessage());
			Assert.fail();
		}
	}
	
	@Test(priority=6)
	public void TC6_PrecipitationFieldDisplayedAndNotEmpty()
	{
		testStart("Validation if the precipitation is displayed and is not empty");
		landingPage.enterZipcodeInSearchField(zipCode);
		landingPage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedLandingPageTitle);
		WebPageLoaded.isDomInteractive(1000);
		
		hourlyPage.clickOnHourlyTab();
		WebPageLoaded.isDomInteractive(1000);
		
		try
		{
			Assert.assertNotNull(hourlyPage.getPrecipitation());
		}
		catch(AssertionError ae)
		{
			System.err.println(ae.getMessage());
			Assert.fail();
		}
	}
	
	@Test(priority=7)
	public void TC7_IsWeatherIconDisplayed()
	{
		testStart("Validation if the weather icon is displayed");
		landingPage.enterZipcodeInSearchField(zipCode);
		landingPage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedLandingPageTitle);
		WebPageLoaded.isDomInteractive(1000);
		
		hourlyPage.clickOnHourlyTab();
		WebPageLoaded.isDomInteractive(1000);
		
		try
		{
			Assert.assertTrue(hourlyPage.isWeatherIconDisplayed());
		}
		catch(AssertionError ae)
		{
			System.err.println(ae.getMessage());
			Assert.fail();
		}
	}
	
	@Test(priority=16)
	public void TC16_ValidateUpArrowIconIsDisplayed()
	{
		testStart("Validation if up arrow icon is displayed on the first page of Hourly tab");
		landingPage.enterZipcodeInSearchField(zipCode);
		landingPage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedLandingPageTitle);
		WebPageLoaded.isDomInteractive(1000);
		
		hourlyPage.clickOnHourlyTab();
		WebPageLoaded.isDomInteractive(1000);
		
		try
		{
			Assert.assertTrue(hourlyPage.isUpArrowIconDisplayed());
		}
		catch(AssertionError ae)
		{
			System.err.println(ae.getMessage());
			Assert.fail();
		}
	}
	
	@Test(priority=8)
	public void TC8_IsCTACorrect()
	{
		testStart("Validation if the CTA on the first page is correct");
		landingPage.enterZipcodeInSearchField(zipCode);
		landingPage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedLandingPageTitle);
		WebPageLoaded.isDomInteractive(1000);
		
		hourlyPage.clickOnHourlyTab();
		WebPageLoaded.isDomInteractive(1000);
		
		try
		{
			Assert.assertEquals(hourlyPage.getCTA(),getDateTime.getTomorrowsDay());
		}
		catch(AssertionError ae)
		{
			System.err.println(ae.getMessage());
			Assert.fail();
		}
	}
	
	@Test(priority=9)
	public void TC9_IsRightArrowIconDisplayedOnCTA()
	{
		testStart("Validation if the right arrow icon is displayed on the CTA");
		landingPage.enterZipcodeInSearchField(zipCode);
		landingPage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedLandingPageTitle);
		WebPageLoaded.isDomInteractive(1000);
		
		hourlyPage.clickOnHourlyTab();
		WebPageLoaded.isDomInteractive(1000);
		
		try
		{
			Assert.assertTrue(hourlyPage.isRightArrowDisplayedOnCTA());
		}
		catch(AssertionError ae)
		{
			System.err.println(ae.getMessage());
			Assert.fail();
		}
	}
	
	@Test(priority=10)
	public void TC10_Verify_ClickOnCTATab()
	{
		testStart("Validation if clicking on CTA tab is navigating to the next correct Hourly page");
		landingPage.enterZipcodeInSearchField(zipCode);
		landingPage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedLandingPageTitle);
		WebPageLoaded.isDomInteractive(1000);
		
		hourlyPage.clickOnHourlyTab();
		WebPageLoaded.isDomInteractive(10000);
		
		hourlyPage.clickCTATab();
		WebPageLoaded.isDomInteractive(1000);
		
		try
		{
			Assert.assertEquals(getDriver().getTitle(), expectedHourlyForecastTitle);
		}
		catch(AssertionError ae)
		{
			System.err.println(ae.getMessage());
			Assert.fail();
		}
	}
	
	
	@Test(priority=11)
	public void TC11_ValidateCurrentDay_OnNextHourlyPage()
	{
		testStart("Validation if next hourly page is displaying the current day at the left CTA tab");
		landingPage.enterZipcodeInSearchField(zipCode);
		landingPage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedLandingPageTitle);
		WebPageLoaded.isDomInteractive(1000);
		
		hourlyPage.clickOnHourlyTab();
		WebPageLoaded.isDomInteractive(1000);
		hourlyPage.clickCTATab();
		WebPageLoaded.isDomInteractive(1000);
		
		try
		{
			Assert.assertEquals(hourlyPage.readCurrentDay(), getDateTime.getCurrentDay());
		}
		catch(AssertionError ae)
		{
			System.err.println(ae.getMessage());
			Assert.fail();
		}
	}
	
	@Test(priority=12)
	public void TC12_ValidateNextDayOnNextHourlyPage()
	{
		testStart("Validation if next hourly page is displaying the next day at the right CTA tab");
		landingPage.enterZipcodeInSearchField(zipCode);
		landingPage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedLandingPageTitle);
		WebPageLoaded.isDomInteractive(1000);
		
		hourlyPage.clickOnHourlyTab();
		WebPageLoaded.isDomInteractive(1000);
		hourlyPage.clickCTATab();
		WebPageLoaded.isDomInteractive(1000);
		
		try
		{
			Assert.assertEquals(hourlyPage.readNextDay(), getDateTime.getDayAfterTomorrowsDay());
		}
		catch(AssertionError ae)
		{
			System.err.println(ae.getMessage());
			Assert.fail();
		}
	}
	
	@Test(priority=13)
	public void TC13_ValidateLeftArrowIconIsDisplayed()
	{
		testStart("Validation if left arrow icon < is displaying on the next day at the left CTA tab");
		landingPage.enterZipcodeInSearchField(zipCode);
		landingPage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedLandingPageTitle);
		WebPageLoaded.isDomInteractive(1000);
		
		hourlyPage.clickOnHourlyTab();
		WebPageLoaded.isDomInteractive(1000);
		hourlyPage.clickCTATab();
		WebPageLoaded.isDomInteractive(1000);
		
		try
		{
			Assert.assertTrue(hourlyPage.isLeftArrowIconDisplayed());
		}
		catch(AssertionError ae)
		{
			System.err.println(ae.getMessage());
			Assert.fail();
		}
	}
	
	@Test(priority=14)
	public void TC14_ValidateRightArrowIconIsDisplayed()
	{
		testStart("Validation if right arrow icon > is displayed on the next day at the right CTA tab");
		landingPage.enterZipcodeInSearchField(zipCode);
		landingPage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedLandingPageTitle);
		WebPageLoaded.isDomInteractive(1000);
		
		hourlyPage.clickOnHourlyTab();
		WebPageLoaded.isDomInteractive(1000);
		hourlyPage.clickCTATab();
		WebPageLoaded.isDomInteractive(1000);
		
		try
		{
			Assert.assertTrue(hourlyPage.isRightArrowDisplayedOnCTA());
		}
		catch(AssertionError ae)
		{
			System.err.println(ae.getMessage());
			Assert.fail();
		}
	}
	
	@Test(priority=15)
	public void TC15_ValidateClickingOnCurrentDay()
	{
		testStart("Validation if current day is clicked it should navigate to the first page of HOurly tab");
		landingPage.enterZipcodeInSearchField(zipCode);
		landingPage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedLandingPageTitle);
		WebPageLoaded.isDomInteractive(1000);
		
		hourlyPage.clickOnHourlyTab();
		WebPageLoaded.isDomInteractive(1000);
		hourlyPage.clickCTATab();
		WebPageLoaded.isDomInteractive(1000);
		hourlyPage.clickCurrentDay();
		WebPageLoaded.isDomInteractive(1000);
		
		try
		{
			Assert.assertEquals(getDriver().getTitle(), expectedHourlyForecastTitle);
		}
		catch(AssertionError ae)
		{
			System.err.println(ae.getMessage());
			Assert.fail();
		}
	}
	
	
	@Test(priority=16)
	public void TC16_ValidateAll24HourTabsPresentOnNextHourlyPage()
	{
		testStart("Validation if all 24 hour tabs are present on next hourly page");
		landingPage.enterZipcodeInSearchField(zipCode);
		landingPage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedLandingPageTitle);
		WebPageLoaded.isDomInteractive(1000);
		
		hourlyPage.clickOnHourlyTab();
		WebPageLoaded.isDomInteractive(1000);
		hourlyPage.clickCTATab();
		WebPageLoaded.isDomInteractive(1000);
		
		
		try
		{
			Assert.assertTrue(hourlyPage.isAllHourTabsPresent());
		}
		catch(AssertionError ae)
		{
			System.err.println(ae.getMessage());
			Assert.fail();
		}
	}
	
	
	@Test(priority=18)
	public void TC18_ValidateAccuweatherLogoPresenceOnHourlyPage()
	{
		testStart("Validate if Accuweather logo is present on Hourly page");
		landingPage.enterZipcodeInSearchField(zipCode);
		landingPage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedLandingPageTitle);
		WebPageLoaded.isDomInteractive(1000);
		
		hourlyPage.clickOnHourlyTab();
		WebPageLoaded.isDomInteractive(1000);
		
		
		try
		{
			Assert.assertTrue(hourlyPage.isAccuWeatherLogoDisplayed());
		}
		catch(AssertionError ae)
		{
			System.err.println(ae.getMessage());
			Assert.fail();
		}
	}

	
	@Test(priority=19)
	public void TC19_ValidateIfCurrentHourTab_Expanded_ByDefault_On_Hourly_PageLoad()
	{
		testStart("Validate if current hour info tab is expanded automatically when the hourly page loads");
		landingPage.enterZipcodeInSearchField(zipCode);
		landingPage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedLandingPageTitle);
		WebPageLoaded.isDomInteractive(1000);
		
		hourlyPage.clickOnHourlyTab();
		WebPageLoaded.isDomInteractive(1000);
		
		
		try
		{
			Assert.assertTrue(hourlyPage.isCurrentHourTabExpanded_WhenFirstPageLoaded());
		}
		catch(AssertionError ae)
		{
			System.err.println(ae.getMessage());
			Assert.fail();
		}
	}
	
	@Test(priority=20)
	public void TC20_ValidateIf_CurrentHourInfoTab_Collapses_When_Clicked_On_Current_Hour_Tab()
	{
		testStart("Validate if current hour info tab collapses and a downward arrow comes up when clicked on current hour tab");
		landingPage.enterZipcodeInSearchField(zipCode);
		landingPage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedLandingPageTitle);
		WebPageLoaded.isDomInteractive(1000);
		
		hourlyPage.clickOnHourlyTab();
		WebPageLoaded.isDomInteractive(1000);
		
		
		try
		{
			hourlyPage.validateCurrentHour_InfoTab_Collapse_When_Clicked_On_CurrentHourTab();
			Assert.assertFalse(hourlyPage.getCurrentHourInfoTabState());
		}
		catch(AssertionError ae)
		{
			System.err.println(ae.getMessage());
			Assert.fail("The hour info tab is still displayed");
		}
		
		try
		{
			Assert.assertTrue(hourlyPage.isDownArrowIconDisplayed());
		}
		catch(AssertionError ae)
		{
			System.err.println(ae.getMessage());
			Assert.fail("Down arrow icon not found on the tab");
		}
		
	}
	
	@Test(priority=21)
	public void TC21_ValidateIf_CurrentHourInfoTab_Expands_When_Clicked_On_First_Hour_Tab()
	{
		testStart("Validate if current hour info tab expands and a upward arrow comes up when clicked on current hour tab");
		landingPage.enterZipcodeInSearchField(zipCode);
		landingPage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedLandingPageTitle);
		WebPageLoaded.isDomInteractive(1000);
		
		hourlyPage.clickOnHourlyTab();
		WebPageLoaded.isDomInteractive(1000);
		
		
		try
		{
			hourlyPage.validateCurrentHour_InfoTab_Expands_When_Clicked_On_CurrentHourTab();
			Assert.assertTrue(hourlyPage.getCurrentHourInfoTabState());
		}
		catch(AssertionError ae)
		{
			System.err.println(ae.getMessage());
			Assert.fail();
		}
	}
	
	
	@Test(priority=22)
	public void TC22_ValidateTheHourlyPageURL()
	{
		testStart("Validate the URL for Hourly page");
		landingPage.enterZipcodeInSearchField(zipCode);
		landingPage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedLandingPageTitle);
		WebPageLoaded.isDomInteractive(1000);
		
		hourlyPage.clickOnHourlyTab();
		WebPageLoaded.isDomInteractive(1000);
		
		
		try
		{
			Assert.assertEquals(getDriver().getCurrentUrl(),expectedHourlyPage_URL);
		}
		catch(AssertionError ae)
		{
			System.err.println(ae.getMessage());
			Assert.fail();
		}
	}
	
	
	@Test(priority=23)
	public void TC23_hourlyTab_ColorValidation()
	{
		testStart("Validate the URL for Hourly page");
		landingPage.enterZipcodeInSearchField(zipCode);
		landingPage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedLandingPageTitle);
		WebPageLoaded.isDomInteractive(1000);
		
		hourlyPage.clickOnHourlyTab();
		WebPageLoaded.isDomInteractive(1000);
		
		try
		{
			System.out.println(hourlyPage.getColor_Of_ActiveTab());
			Assert.assertEquals(hourlyPage.getColor_Of_ActiveTab(), expectedActiveTab_Color);
		}
		catch(AssertionError ae)
		{
			System.err.println(ae.getMessage());
			Assert.fail();
		}
	}
	
	@Test(priority=24)
	public void TC24_validate_DayParam_In_URL_For_NextDay()
	{
		testStart("Validate the day parameter in URL for Hourly page");
		landingPage.enterZipcodeInSearchField(zipCode);
		landingPage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedLandingPageTitle);
		WebPageLoaded.isDomInteractive(1000);
		
		hourlyPage.clickOnHourlyTab();
		WebPageLoaded.isDomInteractive(1000);
		
		try
		{
			hourlyPage.validateDayParamInURLForNextDay();
			Assert.assertTrue(hourlyPage.getHourlyTabURLState());
		}
		catch(AssertionError ae)
		{
			System.err.println(ae.getMessage());
			Assert.fail();
		}
	}
	
	
	@Test(priority=25)
	public void TC25_validate_DayParam_In_URL_For_PreviousDay()
	{
		testStart("Validate the day parameter in URL for Hourly page when clicked on Previous day tab");
		landingPage.enterZipcodeInSearchField(zipCode);
		landingPage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedLandingPageTitle);
		WebPageLoaded.isDomInteractive(1000);
		
		hourlyPage.clickOnHourlyTab();
		WebPageLoaded.isDomInteractive(1000);
		
		try
		{
			hourlyPage.validateDayParamInURLForPreviousDay();
			Assert.assertTrue(hourlyPage.getHourlyTabURLState());
		}
		catch(AssertionError ae)
		{
			System.err.println(ae.getMessage());
			Assert.fail();
		}
	}
	*/
	
	@Test(priority=26)
	public void TC26_getStationCode_And_GTMOffset() throws MalformedURLException
	{
		testStart("Validate the day parameter in URL for Hourly page when clicked on Previous day tab");
		landingPage.enterZipcodeInSearchField(zipCode);
		landingPage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedLandingPageTitle);
		WebPageLoaded.isDomInteractive(1000);
		
		hourlyPage.clickOnHourlyTab();
		WebPageLoaded.isDomInteractive(1000);
		
		URL url = new URL(getDriver().getCurrentUrl());
		System.out.println(url.getQuery());
		
		final RestResponse qaResponse = AccuweatherRest.locations().v1(QA).searchByLocationKey("23238_pc", true);
		System.out.println(qaResponse.getResponse());
		System.out.println(qaResponse.getStatusCode());
	}
	
	
	
	public static void main(String[] args) {
		
		
		
	}

}
