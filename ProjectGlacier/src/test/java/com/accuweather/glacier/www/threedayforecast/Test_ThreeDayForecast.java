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
	String actualForecastPageTitle;
	String expectedForecastPageTitle = "State College Weather - AccuWeather Forecast for PA 16801";
	String pageTitle3day = "Weather in State College - AccuWeather Forecast for PA 16805";
	private LandingPage landingpage = new LandingPage();
	private ForeCastWeatherPage forecastpage = new ForeCastWeatherPage();
	private MonthlyForeCastPage monthlyforecast = new MonthlyForeCastPage();
	private SimpleDate simpledate = new SimpleDate();
	ThreeDayForecastPage threeDayForecastPage = new ThreeDayForecastPage();

	@Test(priority = 1)
	public void TC1_nowTabOnCityForecastPage() {
		testStart("Navigate to city forecast page and Verfiy Now Tab highlighted");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		threeDayForecastPage.isnowTabHighlighted();
	}
	
	@Test(priority = 2)
	public void TC1_nowTabHighlighted() {
		String ExpectedNowtabcolour = "#f05514";
		testStart("Navigate to city forecast and Validate Now tab highlightded in orange colour");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		String Actualtabcolour = threeDayForecastPage.nowTabcolour();
		Assert.assertEquals(Actualtabcolour, ExpectedNowtabcolour, "Tab not highlighted in orange");
	}

	@Test(priority = 3)
	public void TC2_verifyingFourWeatherCardsDisplayed() {
		testStart("Navigate to city day forecast page and Validate 4 weather cards are displayed ");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		Assert.assertTrue(threeDayForecastPage.fourWeathercardisDisplayed());
	}

	@Test(priority = 4)
	public void TC2_verifyingCurrentWeatherisDisplayed() {
		testStart("Navigate to city day forecast page and Validating Current Weather card is displayed ");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		Assert.assertTrue(threeDayForecastPage.currentWeathercardisDisplayed());
	}

	@Test(priority = 5)
	public void TC2_verifyingToadyWeatherisDisplayed() {
		testStart("Navigate to city day forecast page and Validate Today Weather card is displayed ");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		Assert.assertTrue(threeDayForecastPage.todayWeathercardisDisplayed());
	}

	@Test(priority = 6)
	public void TC2_verifyingTonightWeatherisDisplayed() {
		String ExpectedTonightcardtitle = "TONIGHT";
		testStart("Navigate to city day forecast page and Validate Tonight Weather card is displayed ");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		Assert.assertTrue(threeDayForecastPage.tonightWeathercardisDisplayed());
	}

	@Test(priority = 7)
	public void TC2_verifyingTomorrowWeatherisDisplayed() {
		String ExpectedTomorrowcardtitle = "TOMORROW";
		testStart("Navigate to city day forecast page and Validate Tomorrow Weather card is displayed ");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		Assert.assertTrue(threeDayForecastPage.tomorrowWeathercardisDisplayed());
		String tomorrowcardTitle = threeDayForecastPage.tomorrowweathercardTitle();
		Assert.assertEquals(tomorrowcardTitle, ExpectedTomorrowcardtitle);
	}

	@Test(priority = 8)
	public void TC3_verifyingCurrentWeatherTitleDisplayed() {
		String Expectedcurrentcardtitle = "CURRENT WEATHER";
		testStart("Navigate to city day forecast page and Validating Current Weather card Title displayed ");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		String currentweathercardtitle = threeDayForecastPage.currentWeathercardTitle();
		Assert.assertEquals(currentweathercardtitle, Expectedcurrentcardtitle);
	}

	@Test(priority = 9)
	public void TC3_verifyingCurrentWeatherTimeDisplayed() {
		testStart("Navigate to city day forecast page and Validating Time stamp displayed ");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		System.out.println(threeDayForecastPage.weatherCardElementsDetailsDisplayed("Current Weather Time Stamp"));
	}

	@Test(priority = 10)
	public void TC3_verifyingCurrentWeatherIconDisplayed() {
		testStart("Navigate to city day forecast page and Validating Time stamp displayed ");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		System.out.println(threeDayForecastPage.weatherCardElementsDetailsDisplayed("Current Weather Time Stamp"));
	}

	@Test(priority = 11)
	public void TC3_verifyingCurrentWeathercardTemperatureisDisplayed() {
		testStart("Navigate to city day forecast page and Validating Time stamp displayed ");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		System.out.println(threeDayForecastPage.weatherCardElementsDetailsDisplayed("Current Weather Temperature"));
	}

	@Test(priority = 12)
	public void TC3_verifyingCurrentWeathercardRealfeelTempisDisplayed() {
		testStart("Navigate to city day forecast page and Validating Current Weather RealFee Temperature displayed ");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		System.out.println(
		threeDayForecastPage.weatherCardElementsDetailsDisplayed("Current Weather Real FeelTemperature"));
	}

	@Test(priority = 13)
	public void TC3_verifyingCurrentWeathercardWeatherDescriptionisDisplayed() {
		testStart("Navigate to city day forecast page and Validating Current Weather Current Weather Description is Displayed ");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		System.out.println(threeDayForecastPage.weatherCardElementsDetailsDisplayed("Current Weather Description"));
	}

	@Test(priority = 14)
	public void TC4_verfyingisclickedonCurrentweathercard() {
		String ExpectedUrl = "https://development.accuweather.com/en/us/state-college/16801/current-weather/6787_pc";
		testStart("Navigate to city day forecast page and click on Current weather card and validating URL");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		threeDayForecastPage.isclickedonCurrentWeather();
	}
	@Test(priority = 15)
	public void TC4_verifyingnavigatingtoCurrentWeatherlocationpage() {
		String ExpectedUrl = "https://development.accuweather.com/en/us/state-college/16801/current-weather/6787_pc";
		testStart("Navigate to city day forecast page and click on Current weather card and validating URL");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		String ActualUrldisplayed = threeDayForecastPage.CurrentWeatherurldisplayed();
		Assert.assertEquals(ActualUrldisplayed, ExpectedUrl);
	}
	
	@Test(priority = 16)
	public void TC5_verifyingToadycardWeathercardisDisplayed() {
		testStart("Navigate to city day forecast page and Validate Today Weather card Title is displayed ");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		Assert.assertTrue(threeDayForecastPage.weatherCardElementsDetailsDisplayed("Today"));
	}

	@Test(priority = 17)
	public void TC5_verifyingToadycardTitle() {
		String ExpectedTodaycardtitle = "TODAY";
		testStart("Navigate to city day forecast page and Validate Today Weather card Title is displayed ");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		String Actualcardtitle = threeDayForecastPage.TodayweathercardTitle();
		Assert.assertEquals(Actualcardtitle, ExpectedTodaycardtitle, "Card Title mismatch");
	}

	@Test(priority = 18)
	public void TC5_verifyingToadycardWeatherDateisDisplayed() {
		testStart("Navigate to city day forecast page and Validate Today Weather card has current Date displayed ");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		Assert.assertTrue(threeDayForecastPage.weatherCardElementsDetailsDisplayed("Current date"));
	}

	@Test(priority = 19)
	public void TC5_verifyingToadycardWeathericonisDisplayed() {
		testStart("Navigate to city day forecast page and Validate Today Weather card has Weather icon displayed ");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		Assert.assertTrue(threeDayForecastPage.weatherCardElementsDetailsDisplayed("Today Weather icon"));
	}

	@Test(priority = 20)
	public void TC5_verifyingtodaycardTemperatureisDisplayed() {
		testStart("Navigate to city day forecast page and Validate Today Weather card has High Temperature displayed ");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		Assert.assertTrue(threeDayForecastPage.weatherCardElementsDetailsDisplayed("Today High Temperature"));
	}

	@Test(priority = 21)
	public void TC5_verifyingtodaycardRealfeeltempisDisplayed() {
		testStart("Navigate to city day forecast page and Validate Today Weather card has Real feel Temperature with trademark displayed ");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		Assert.assertTrue(
		threeDayForecastPage.weatherCardElementsDetailsDisplayed("Today RealFeelTemperature with trademark"));
	}

	@Test(priority = 22)
	public void TC5_verifyingtodaycardWeatherdescriptionisDisplayed() {
		testStart("Navigate to city day forecast page and Validate Today Weather card has Weather description displayed ");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		Assert.assertTrue(threeDayForecastPage.weatherCardElementsDetailsDisplayed("Today Weather Description"));
	}

	@Test(priority = 23)
	public void TC6_verifyingTonightWeatherisDisplayed() {
		testStart("Navigate to city day forecast page and Validate Tonight Weather card is displayed ");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		Assert.assertTrue(threeDayForecastPage.tonightWeathercardisDisplayed());
	}

	@Test(priority = 24)
	public void TC6_verifyingTonightWeathercadrTitle() {
		String ExpectedTonightcardtitle = "TONIGHT";
		testStart("Navigate to city day forecast page and Validate Tonight Weather card is displayed ");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		String tonightcardTitle = threeDayForecastPage.tonightweathercardTitle();
		Assert.assertEquals(tonightcardTitle, ExpectedTonightcardtitle);
	}

	@Test(priority = 25)
	public void TC6_verifyingTonightcarddateDisplayed() {
		testStart("Navigate to city day forecast page and Validate Tonight Weather card has current Date displayed ");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		Assert.assertTrue(threeDayForecastPage.weatherCardElementsDetailsDisplayed("Tonight Current date"));
	}

	@Test(priority = 26)
	public void TC6_verifyingTonightcardWeathericonisDisplayed() {
		testStart("Navigate to city day forecast page and Validate Tonight Weather card has Weather icon displayed ");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		Assert.assertTrue(threeDayForecastPage.weatherCardElementsDetailsDisplayed("Tonight Weather icon"));
	}

	@Test(priority = 27)
	public void TC6_verifyingtonightcardTemperatureisDisplayed() {
		testStart(
				"Navigate to city day forecast page and Validate Tonight Weather card has High Temperature displayed ");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		Assert.assertTrue(threeDayForecastPage.weatherCardElementsDetailsDisplayed("Tonight Low Temperature"));
	}

	@Test(priority = 28)
	public void TC6_verifyingtonightcardRealfeeltempisDisplayed() {
		testStart("Navigate to city day forecast page and Validate Tonight Weather card has Real feel Temperature with trademark displayed ");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		Assert.assertTrue(threeDayForecastPage.weatherCardElementsDetailsDisplayed("Tonight RealFeelTemperature with trademark"));
	}

	@Test(priority = 29)
	public void TC6_verifyingtonightcardWeatherdescriptionisDisplayed() {
		testStart("Navigate to city day forecast page and Validate Tonight Weather card has Weather description displayed ");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		Assert.assertTrue(threeDayForecastPage.weatherCardElementsDetailsDisplayed("Tonight Weather Description"));
	}

	@Test(priority = 30)
	public void TC7_verfyingisclickedonTodayweathercard() {
		String ExpectedUrl="https://development.accuweather.com/en/us/state-college/16801/current-weather/6787_pc";
		testStart("Navigate to city day forecast page and click on Current weather card and validating URL");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		threeDayForecastPage.isclickedonTodayWeather();
	}

	@Test(priority = 31)
	public void TC7_verifyingnavigatingtoCurrentWeatherlocationpage() throws InterruptedException {
		String ExpectedUrl = "https://development.accuweather.com/en/us/state-college/16801/current-weather/6787_pc";
		testStart("Navigate to city day forecast page and click on Current weather card and validating URL");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		String ActualUrldisplayed = threeDayForecastPage.todayWeatherurldisplayed();
		Thread.sleep(5000);
		Assert.assertEquals(ActualUrldisplayed, ExpectedUrl);
	}

	@Test(priority = 32)
	public void TC8_verifyingTomorrowtWeatherisDisplayed() {
		testStart("Navigate to city day forecast page and Validate Tonight Weather card is displayed ");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		Assert.assertTrue(threeDayForecastPage.tomorrowWeathercardisDisplayed());
	}

	@Test(priority = 33)
	public void TC8_verifyingTomorrowWeathercadrTitle() {
		String ExpectedTonightcardtitle = "TOMORROW";
		testStart("Navigate to city day forecast page and Validate Tonight Weather card is displayed ");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		String tonightcardTitle = threeDayForecastPage.tomorrowweathercardTitle();
		Assert.assertEquals(tonightcardTitle, ExpectedTonightcardtitle);
	}

	@Test(priority = 34)
	public void TC8_verifyingTomorrowcarddateDisplayed() {
		testStart("Navigate to city day forecast page and Validate Tomorrow Weather card has current Date displayed ");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		Assert.assertTrue(threeDayForecastPage.weatherCardElementsDetailsDisplayed("Tomorrow Current date"));
	}

	@Test(priority = 35)
	public void TC8_verifyingTomorrowcardWeathericonisDisplayed() {
		testStart("Navigate to city day forecast page and Validate Tomorrow Weather card has Weather icon displayed ");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		Assert.assertTrue(threeDayForecastPage.weatherCardElementsDetailsDisplayed("Tomorrow  Weather icon"));
	}

	@Test(priority = 36)
	public void TC8_verifyingTomorrowcardTemperatureisDisplayed() {
		testStart("Navigate to city day forecast page and Validate Tomorrow Weather card has High and Low Temperature displayed ");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		Assert.assertTrue(threeDayForecastPage.weatherCardElementsDetailsDisplayed("Tomorrow High and Low Temperature"));
	}

	@Test(priority = 37)
	public void TC8_verifyingTomorrowcardWeatherdescriptionisDisplayed() {
		testStart("Navigate to city day forecast page and Validate Tomorrow Weather card has Weather description displayed ");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		Assert.assertTrue(threeDayForecastPage.weatherCardElementsDetailsDisplayed("Tomorrow  Weather Description"));
	}

	@Test(priority = 38)
	public void TC9_verfyingisclickedonTomorrowweathercard() {
		String ExpectedUrl="https://development.accuweather.com/en/us/state-college/16801/current-weather/6787_pc";
		testStart("Navigate to city day forecast page and click on Current weather card and validating URL");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		threeDayForecastPage.isclickedonTomorrowWeather();
	}

	@Test(priority = 39)
	public void TC9_verifyingnavigatingtoCurrentWeatherlocationpage() throws InterruptedException {
		String ExpectedUrl = "https://development.accuweather.com/en/us/state-college/16801/daily-weather-forecast/6787_pc?day=1";
		testStart("Navigate to city day forecast page and click on Current weather card and validating URL");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		waitUntilElementIsDisplayedOrClickable();
		waitUntilWindowExistsWithTitle(expectedForecastPageTitle);
		String ActualUrldisplayed=threeDayForecastPage.tomorrowWeatherurldisplayed();
		Thread.sleep(5000);
		Assert.assertEquals(ActualUrldisplayed, ExpectedUrl);
	}

	@Test(priority = 40)
	public void TC10_VerifyingnArrowsonThreeDayForecast() {
		String ExpectedForwardarroworange = "#f59721"; // Forward arrow Orange Active on City forecast page
		testStart("Navigate to city forecast page and validate forward arrow Active and highlighted");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		String Forwardarrowcolour=threeDayForecastPage.Forwardarrowcolour();
		Assert.assertEquals(Forwardarrowcolour, ExpectedForwardarroworange);
	}

	@Test(priority = 41)
	public void TC10_VerifyingnForwardactiveandBackArrowinactiveonThreeDayForecast() {
		String ExpectedBackarrowGreyColour = "#878787"; // Back arrow Grey Inactive on City forecast page
		testStart("Navigate city forecast page and verfiying Backward arrow inactive and displayed in Grey ");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		String backarowcolour = threeDayForecastPage.Backarrowcolour();
		System.out.println("Back arrow colour displayed is" + backarowcolour);
		Assert.assertEquals(backarowcolour, ExpectedBackarrowGreyColour);
	}

	@Test(priority = 42)
	public void TC11_VerifyingnFourfuturedays() throws InterruptedException {
		testStart("Navigate to city forecast city page and Click on forward arrow verfiy four future days displayed");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		threeDayForecastPage.animationforwardarrowclick();
		Thread.sleep(3000);
		Assert.assertTrue(threeDayForecastPage.nextfourdaysforecast());
	}

	@Test(priority = 43)
	public void TC11_VerifyingnbackarrowActive() throws InterruptedException {
		String ExpectedForwardarroworange = "#f59721"; // Back arrow active and enabled after forward click
		testStart("Navigate to city forecast city page and Click on forward arrow verfiy Backarrow enabled and displayed in orange colour");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		threeDayForecastPage.animationforwardarrowclick();
		Thread.sleep(3000);
		String backarowcolour2 = threeDayForecastPage.Backarrowcolour2();
		Assert.assertEquals(backarowcolour2, ExpectedForwardarroworange);
	}

	@Test(priority = 44)
	public void TC11_VerifyingpastfourdaysDisplayed() throws InterruptedException {
		testStart("Navigate to city forecast city page,Click on forward arrow verfiy future days displayed,click on Back arrow to  past days ");
		landingpage.enterZipcodeInSearchField(zipcode);
		landingpage.clickOnZipcodeSearchIcon();
		threeDayForecastPage.animationforwardarrowclick();
		Thread.sleep(3000);
		threeDayForecastPage.animationBackwardarrowclick();
		Thread.sleep(3000);
		Assert.assertTrue(threeDayForecastPage.fourWeathercardisDisplayed());
	}
}
