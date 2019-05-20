package com.accuweather.glacier.www.landingpage;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.accuweather.glacier.www.AccuWeatherBaseTest;
import com.accuweather.glacier.www.pages.LandingPage;
import com.accuweather.glacier.www.pages.NavigationBar;
import com.chameleon.selenium.web.WebPageLoaded;

public class Test_AccuWeatherLandingPage extends AccuWeatherBaseTest {
	int ActualLocationSize;
	int ExpectedLocationSize;
	String zipcode = "16803";
	String zip = "60606";
	String ActualLocationName;
	String CrumbLocationName;
	String LocationName = "Cambridge";
	String ExpectedCtaTitle = "United States Weather Radar";
	Object ActualJWPlayerStatus;
	String ActualWeatherRadarTitle;
	String actualCTATitle;
	String ExpectedJWPlayerStatus = "jwplayer jw-reset jw-state-playing ";
	String ExpectedForecastPageTitle = "State College Weather - AccuWeather Forecast for PA 16801";
	String ExpectedWeatherRadarTitle = "United States Doppler Weather Radar Map - AccuWeather.com";
	private LandingPage landingpage = new LandingPage();
	private NavigationBar navBar = new NavigationBar();
	
		
	
	  @Test(priority=1) public void TC1_VerifyRecentFirstLocationIsDisplayed() {
	  testStart("Is First Location Displayed Under Recent Location Section");
	  landingpage.isRecentLocationDisplayed(); ExpectedLocationSize = 1;
	  ActualLocationSize = landingpage.getAllLocationsSize();
	  Assert.assertEquals(ActualLocationSize, ExpectedLocationSize); }
	  
	  
	  @Test(priority=2) public void
	  TC1_VerifyDefaultLocationNameAndAkamaiNameAreNotSame() {
	  testStart("Default Location names are not same Under Recent Location Section"
	  ); landingpage.isRecentLocationDisplayed(); ActualLocationName =
	  landingpage.getDefaultLocationName();
	  Assert.assertNotSame(ActualLocationName, LocationName); }
	  
	  @Test(priority=3) public void TC1_VerifyDefaultLocationAndCrumbNamesAreSame()
	  { testStart("Are Default Location and Crumb names are same");
	  landingpage.isRecentLocationDisplayed(); ActualLocationName =
	  landingpage.getDefaultLocationName(); CrumbLocationName =
	  landingpage.getCrumbLocationName(); Assert.assertNotSame(ActualLocationName,
	  CrumbLocationName); }
	  
	  @Test(priority=4) public void TC2_VerifyRecentTwoLocationsAreDisplayed() {
	  testStart("Are Two recent locations Displayed Under Recent Location Section"
	  ); landingpage.enterZipcodeInSearchField(zip);
	  landingpage.clickOnZipcodeSearchIcon();
	  waitUntilElementIsDisplayedOrClickable();
	  waitUntilWindowExistsWithTitle(ExpectedForecastPageTitle);
	  navBar.navigateToHome(); WebPageLoaded.isDomInteractive(1000);
	  landingpage.isRecentLocationDisplayed();
	  landingpage.isSecondLocationDisplayed();
	  landingpage.getHrefAttributeOfRecentLocation(); ExpectedLocationSize = 2;
	  ActualLocationSize = landingpage.getAllLocationsSize();
	  Assert.assertEquals(ActualLocationSize, ExpectedLocationSize); }
	  
	  @Test(priority=5) public void TC3_VerifyRecentThreeLocationsAreDisplayed() {
	  testStart("Are Three recent locations Displayed Under Recent Location Section"
	  ); landingpage.enterZipcodeInSearchField(zip);
	  landingpage.clickOnZipcodeSearchIcon();
	  waitUntilElementIsDisplayedOrClickable();
	  waitUntilWindowExistsWithTitle(ExpectedForecastPageTitle);
	  navBar.navigateToHome(); WebPageLoaded.isDomInteractive(1000);
	  landingpage.enterZipcodeInSearchField(zipcode);
	  landingpage.clickOnZipcodeSearchIcon();
	  waitUntilElementIsDisplayedOrClickable();
	  waitUntilWindowExistsWithTitle(ExpectedForecastPageTitle);
	  navBar.navigateToHome(); WebPageLoaded.isDomInteractive(1000);
	  landingpage.isRecentLocationDisplayed();
	  landingpage.isSecondLocationDisplayed();
	  landingpage.isThirdLocationDisplayed(); ExpectedLocationSize = 3;
	  ActualLocationSize = landingpage.getAllLocationsSize();
	  Assert.assertEquals(ActualLocationSize, ExpectedLocationSize); }
	  
	  
	  @Test(priority=6) public void TC2_VerifyCTATitleAreSame() {
	  testStart("Verify CTA Title"); actualCTATitle =
	  landingpage.getCTATitle(); Assert.assertEquals(actualCTATitle,
	  ExpectedCtaTitle); }
	 
	  	  	  
	/*
	 * @Test(priority=7) public void TC9_IsVideoAutoPlayedOnHomePage() throws
	 * InterruptedException {
	 * testStart("Verify Video is autoplayed on the landing page");
	 * WebPageLoaded.isDomInteractive(5000);
	 * waitUntilElementIsDisplayedOrClickable(); ActualJWPlayerStatus =
	 * landingpage.getVideoClassAttribute();
	   Assert.assertEquals(ActualJWPlayerStatus,
	 * ExpectedJWPlayerStatus); WebPageLoaded.isDomInteractive(2000); }
	 * 
	 * 
	 * @Test(priority=8) public void TC10_IsStickyVideoAutoPlayedOnHomePage() throws
	 * InterruptedException {
	 * testStart("Verify Sticky Video is autoplayed on the landing page");
	 * WebPageLoaded.isDomInteractive(5000);
	 * waitUntilElementIsDisplayedOrClickable(); ActualJWPlayerStatus =
	 * landingpage.getStickyVideoClassAttribute();
	 * Assert.assertEquals(ActualJWPlayerStatus,
	 * ExpectedJWPlayerStatus); WebPageLoaded.isDomInteractive(3000); }
	 */
	 
	
	  
	
	  @Test(priority=9) public void TC11_IsWeatherRadarImageDisplayedPOnHomePage()
	  { testStart("Verify Weather Radar Image Displayed on the landing page");
	  WebPageLoaded.isDomInteractive(1000);
	  waitUntilElementIsDisplayedOrClickable();
	  Assert.assertTrue(landingpage.isWeatherRadarImageDisplayed()); }
	  
	  
	  @Test(priority=10) public void TC12_IsWeatherRadarDisplayedFromMoreMapsLink()
	  { testStart("Verify Weather Radar Page displayed landing page");
	  WebPageLoaded.isDomInteractive(1000);
	  waitUntilElementIsDisplayedOrClickable(); landingpage.clickMoreMapsLink();
	  WebPageLoaded.isDomInteractive(1000);
	  waitUntilElementIsDisplayedOrClickable(); ActualWeatherRadarTitle =
	  getDriver().getTitle(); Assert.assertEquals(ActualWeatherRadarTitle,
	  ExpectedWeatherRadarTitle); }
	 
	
	  
	 
}
