package com.accuweather.glacier.www.monthlyforecast;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.accuweather.glacier.www.AccuWeatherBaseTest;
import com.accuweather.glacier.www.pages.ForeCastWeatherPage;
import com.accuweather.glacier.www.pages.LandingPage;
import com.accuweather.glacier.www.pages.MonthlyForeCastPage;
import com.chameleon.selenium.web.WebPageLoaded;
import com.chameleon.utils.date.SimpleDate;


public class Test_MonthlyForecastPage extends AccuWeatherBaseTest {
	String zipcode = "16801";
	String ActualForecastPageTitle;
	String ExpectedForecastPageTitle = "State College Weather - AccuWeather Forecast for PA 16801";
	private LandingPage landingpage = new LandingPage();
	private ForeCastWeatherPage forecastpage = new ForeCastWeatherPage();
	private MonthlyForeCastPage monthlyforecast = new MonthlyForeCastPage();
	private SimpleDate simpledate = new SimpleDate();
	 
	
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
	
	/*
	 * @Test(priority=2) public void TC2_NowTabEnabledForeCasthtlyWeatherPage() {
	 * testStart("Is Now Tab enabled on AW Weather Forecast Page");
	 * landingpage.enterZipcodeInSearchField(zipcode);
	 * landingpage.clickOnZipcodeSearchIcon();
	 * waitUntilElementIsDisplayedOrClickable();
	 * waitUntilWindowExistsWithTitle(ExpectedForecastPageTitle);
	 * WebPageLoaded.isDomInteractive(1000);
	 * Assert.assertTrue(forecastpage.isNowTabEnabled());
	 * WebPageLoaded.isDomInteractive(1000); }
	 */
	
	/*
	 * @Test(priority=3) public void TC2_areAllTabsDisplayed() {
	 * testStart("Are all Tabs displayed on AW Weather Forecast Page");
	 * landingpage.enterZipcodeInSearchField(zipcode);
	 * landingpage.clickOnZipcodeSearchIcon();
	 * waitUntilElementIsDisplayedOrClickable();
	 * waitUntilWindowExistsWithTitle(ExpectedForecastPageTitle);
	 * WebPageLoaded.isDomInteractive(1000);
	 * Assert.assertTrue(forecastpage.isRadarTabDisplayed());
	 * Assert.assertTrue(forecastpage.isMinuteCastTabDisplayed());
	 * Assert.assertTrue(forecastpage.isHourlyTabDisplayed());
	 * Assert.assertTrue(forecastpage.isDailyTabDisplayed());
	 * Assert.assertTrue(forecastpage.isMonthlyTabDisplayed());
	 * WebPageLoaded.isDomInteractive(1000); }
	 */
	
	/*
	 * @Test(priority=4) public void TC2_navigateToAWMonhtlyWeatherPage() {
	 * testStart("Is AW Monthly Weather page Displayed From AW Weather Forecast Page"
	 * ); landingpage.enterZipcodeInSearchField(zipcode);
	 * landingpage.clickOnZipcodeSearchIcon();
	 * waitUntilElementIsDisplayedOrClickable();
	 * waitUntilWindowExistsWithTitle(ExpectedForecastPageTitle);
	 * WebPageLoaded.isDomInteractive(1000); forecastpage.clickOnMonthlyTab();
	 * WebPageLoaded.isDomInteractive(1000); }
	 */
	
	@Test(priority=5) public void TC5_NavigateToFutureMonthForeCast() {
		testStart("Navigate to future month forecast from current month forecast");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(ExpectedForecastPageTitle);
		//WebPageLoaded.isDomInteractive(1000);
		forecastpage.clickOnMonthlyTab();
		//WebPageLoaded.isDomInteractive(1000);
		monthlyforecast.clickOnRightArrowLink();
		//Assert.assertTrue(forecastpage.isNowTabEnabled());
		//WebPageLoaded.isDomInteractive(1000);
		String month = monthlyforecast.getGridViewMonthSubString();
		System.out.println("month month month month..... " +month);
		//int months = simpledate.CURRENT_MONTH;
		//String months = simpledate.getMonthString();
		//int months = simpledate.getMonth();
		//System.out.println("months months months... " +months);
	    }
}
