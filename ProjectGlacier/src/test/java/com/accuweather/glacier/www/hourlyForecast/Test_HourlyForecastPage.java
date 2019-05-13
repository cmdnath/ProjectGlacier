package com.accuweather.glacier.www.hourlyForecast;

import static com.accuweather.glacier.Environment.QA;

import java.net.MalformedURLException;

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
	String expectedHourlyForecastTitle = "Mc Farland Hourly Weather - AccuWeather Forecast for WI 53558";
	
	private String expectedHourlyPage_URL = "https://development.accuweather.com/en/us/mc-farland/53558/hourly-weather-forecast/23238_pc";
	private static final String ORANGE_COLOR = "#f05514";
	private static final String BLACK_COLOR = "#1f1f1f";
	private static final String GREY_COLOR = "#878787";
	private static final String HOURLY_TAB = "HOURLY";
	
	private LandingPage landingPage = new LandingPage();
	private HourlyForecastPage hourlyPage = new HourlyForecastPage();
	private SimpleDate getDateTime = new SimpleDate();
	
	@Test(priority=1)
	public void TC1_navigation_To_Hourly_Tab()
	{
		testStart("Validate the navigation to Hourly tab");
		landingPage.enterZipcodeInSearchField(zipCode);
		landingPage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedLandingPageTitle);
		WebPageLoaded.isDomInteractive(1000);
		
		hourlyPage.clickOnHourlyTab();
		WebPageLoaded.isDomInteractive(1000);
		
		try {
			Assert.assertEquals(getDriver().getTitle(), expectedHourlyForecastTitle);	
		}
		catch(AssertionError ae)
		{
			System.out.println(ae.getMessage());
			Assert.fail("Hourly forecast title is not matching");
		}
		
	}
	
	@Test(priority=2)
	public void TC1_Validate_AccuweatherLogo_Presence_On_HourlyPage()
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
	
	@Test(priority=3)
	public void TC1_validation_Of_HourlyPage_URL()
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
	
	
	@Test(priority=4)
	public void TC1_validation_Of_hourlyTab_Color()
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
			Assert.assertEquals(hourlyPage.getColor_Of_ActiveTab(), ORANGE_COLOR);
		}
		catch(AssertionError ae)
		{
			System.err.println(ae.getMessage());
			Assert.fail();
		}
	}
	
	@Test(priority=5)
	public void TC1_validationOf_HourlyTab_Text()
	{
		testStart("Validate whether the Hourly tab has the name 'Hourly' ");
		landingPage.enterZipcodeInSearchField(zipCode);
		landingPage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedLandingPageTitle);
		WebPageLoaded.isDomInteractive(1000);
		
		hourlyPage.clickOnHourlyTab();
		WebPageLoaded.isDomInteractive(1000);
		
		try {
			Assert.assertEquals(hourlyPage.getHourlyTabText(), HOURLY_TAB);	
		}
		catch(AssertionError ae)
		{
			System.out.println(ae.getMessage());
			Assert.fail("Hourly forecast title is not matching");
		}
		
	}
	
	@Test(priority=6)
	public void TC2_Validation_If_CurrentHour_Tab_Expanded_ByDefault_On_Hourly_PageLoad()
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
	
	@Test(priority=7)
	public void TC2_is_Time_Displayed_Correctly()
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
	
	@Test(priority=8)
	public void TC2_validation_UpArrow_Icon_Is_Displayed()
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
	
	@Test(priority=9)
	public void TC3_Validation_If_Expanded_ForecastList_Collapses_When_Clicked_On_Current_Hour_Tab()
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
	
	
	
	@Test(priority=10)
	public void TC4_isDate_Correct()
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
	
	@Test(priority=11)
	public void TC4_isTemperature_Field_Displayed()
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
	
	@Test(priority=12)
	public void TC4_isWeather_Condition_Displayed_And_IsNotEmpty()
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
	
	@Test(priority=13)
	public void TC4_is_Precipitation_Field_Displayed_And_NotEmpty()
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
	
	@Test(priority=14)
	public void TC4_is_WeatherIcon_Displayed()
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
	
	@Test(priority=15)
	public void TC5_ValidateIf_CurrentHourInfoTab_Expands_When_Clicked_On_First_Hour_Tab()
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
	
	
	
	@Test(priority=16)
	public void TC6_IsCTACorrect()
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
	
	@Test(priority=17)
	public void TC6_IsRightArrowIconDisplayedOnCTA()
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
	
	@Test(priority=18)
	public void TC7_Verify_ClickOnCTATab()
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
	
	
	@Test(priority=19)
	public void TC7_ValidateCurrentDay_OnNextHourlyPage()
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
	
	@Test(priority=20)
	public void TC7_ValidateNextDayOnNextHourlyPage()
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
			Assert.assertEquals(hourlyPage.readNextDay(), hourlyPage.getNextDay(1));
		}
		catch(AssertionError ae)
		{
			System.err.println(ae.getMessage());
			Assert.fail();
		}
	}
	
	@Test(priority=21)
	public void TC7_ValidateLeftArrowIconIsDisplayed()
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
	
	@Test(priority=22)
	public void TC7_ValidateRightArrowIconIsDisplayed()
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
	
	@Test(priority=23)
	public void TC7_ValidateAll24HourTabsPresentOnNextHourlyPage()
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
	
	@Test(priority=24)
	public void TC8_ValidateClickingOnCurrentDay()
	{
		testStart("Validation if current day is clicked it should navigate to the first page of Hourly tab");
		landingPage.enterZipcodeInSearchField(zipCode);
		landingPage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedLandingPageTitle);
		WebPageLoaded.isDomInteractive(1000);
		
		hourlyPage.clickOnHourlyTab();
		WebPageLoaded.isDomInteractive(1000);
		hourlyPage.clickCTATab();
		WebPageLoaded.isDomInteractive(1000);
		hourlyPage.clickPreviousDay();
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
	
	@Test(priority=25)
	public void TC9_validate_DayParam_In_URL_For_NextDay()
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
	
	
	@Test(priority=26)
	public void TC10_validate_DayParam_In_URL_For_PreviousDay()
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
	
	
	@Test(priority=27)
	public void TC11_getStationCode_And_GTMOffset() throws MalformedURLException
	{
		testStart("Validate the day parameter in URL for Hourly page when clicked on Previous day tab");
		landingPage.enterZipcodeInSearchField(zipCode);
		landingPage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedLandingPageTitle);
		WebPageLoaded.isDomInteractive(1000);
		
		hourlyPage.clickOnHourlyTab();
		WebPageLoaded.isDomInteractive(1000);
		
		final RestResponse qaResponse = AccuweatherRest.locations().v1(QA).searchByLocationKey("23238_pc", true);
		System.out.println(qaResponse.getResponse());
		System.out.println(qaResponse.getStatusCode());
	}
	
	
	@Test(priority=28)
	public void TC12_validationAfterClickingOnWeatherIcon()
	{
		testStart("Validation whether the user is navigated to 3 day forecast page when clicked on Weather icon at the top on Hourly page");
		landingPage.enterZipcodeInSearchField(zipCode);
		landingPage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedLandingPageTitle);
		WebPageLoaded.isDomInteractive(1000);
		
		hourlyPage.clickOnHourlyTab();
		WebPageLoaded.isDomInteractive(1000);
		
		hourlyPage.clickWeatherIconAtTheTop();
		Assert.assertEquals(getDriver().getTitle(), expectedLandingPageTitle);
	}
	
	@Test(priority=29)
	public void TC12_validationAfterClickingOnTemperatureIcon() throws InterruptedException
	{
		testStart("Validation whether the user is navigated to 3 day forecast page when clicked on Temperature icon at the top on Hourly page");
		landingPage.enterZipcodeInSearchField(zipCode);
		landingPage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedLandingPageTitle);
		WebPageLoaded.isDomInteractive(1000);
		
		hourlyPage.clickOnHourlyTab();
		WebPageLoaded.isDomInteractive(1000);
		
		Thread.sleep(5000);
		hourlyPage.clickTemperatureIconAtTheTop();
		Assert.assertEquals(getDriver().getTitle(), expectedLandingPageTitle);
	}
	
	

}
