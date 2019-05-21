package com.accuweather.glacier.www.builderrorpage;

import java.net.URISyntaxException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.accuweather.glacier.www.AccuWeatherBaseTest;
import com.accuweather.glacier.www.pages.BuildErrorPage;
import com.chameleon.selenium.web.WebPageLoaded;


public class Test_BuildErrorpage extends AccuWeatherBaseTest{
	
	String expectedAccuweatherUrl="https://development.accuweather.com/";
	String expected400ErrorpageURL= "https://development.accuweather.com/tt";
	String expected500ErrorpageURL= "https://development.accuweather.com/throw-exception";
	String expectedimageurl= "url(\"https://development.accuweather.com/images/components/pages/error-bg.jpg\")"; 
	String expected400ErrorpageType= "404";
	String expected500ErrorpageType= "500";
	String expected400ErrorpageErrorText= "Whoops! This page does not exist.";
	String expected500ErrorpageErrorText= "Whoops! Something went wrong.";
	String expectedCTAtext= "Back to AccuWeather";

    private static final String ORANGE_COLOR="#f05514";
	
    private BuildErrorPage erropage = new BuildErrorPage();
	
	@Test(priority = 1 ,enabled = true)
	public void TC1_navigatingtobuild400ErrorPage() throws InterruptedException, URISyntaxException {
        testStart("Navigating to the Error Page");
		String appendedurl=erropage.addtexttoEndURL();
		WebPageLoaded.isDomInteractive(4000);
		getDriver().navigate().to(appendedurl);
		WebPageLoaded.isDomInteractive(4000);		
		Assert.assertEquals(getDriver().getCurrentUrl(), expected400ErrorpageURL,"User not navigated to 400 Error Page");
	}
	
	@Test(priority=2 ,enabled = true)
	public void TC1_errorpagecloudBackgroundimageDisplayed() throws InterruptedException, URISyntaxException {
		testStart("Navigating to the Error Page and verying cloud background is displayed");
		String appendedurl=erropage.addtexttoEndURL();			
		getDriver().navigate().to(appendedurl);
		WebPageLoaded.isDomInteractive(4000);
		String Actualimagedisplayed=erropage.errorpagebackgroundimage();
		System.out.println("Actuall image displayed is"+Actualimagedisplayed);
		Assert.assertEquals(Actualimagedisplayed, expectedimageurl,"Cloud Backgroud image displayed is not matching");
		
	}
	
	@Test(priority=3,enabled = true)
	public void TC2_navigatingtoErrorPagevalidatingCTADisplayed() throws InterruptedException, URISyntaxException {
        testStart("Navigating to the Error Page and Validating the ERROR Type Displayed ");
		String appendedurl=erropage.addtexttoEndURL();
		getDriver().navigate().to(appendedurl);
		String ErrorTypeDisplayed=erropage.errortypeDisplayed();
		WebPageLoaded.isDomInteractive(4000);
		Assert.assertEquals(ErrorTypeDisplayed, expected400ErrorpageType,"Error Type displayed is not matching ");
	}
	
	@Test(priority=4,enabled = true)
	public void TC3_navigatingtoErrorPagevalidatingerrorText() throws InterruptedException, URISyntaxException {
        testStart("Navigating to the Error Page and Validating the ERROR Text Displayed");
		String appendedurl=erropage.addtexttoEndURL();
		WebPageLoaded.isDomInteractive(4000);	
		getDriver().navigate().to(appendedurl);
		String ErrorTxetDisplayed=erropage.errorpageTextDisplayed();
		WebPageLoaded.isDomInteractive(4000);
        Assert.assertEquals(ErrorTxetDisplayed, expected400ErrorpageErrorText,"Error Type displayed is not matching ");
		
	}
	
	@Test(priority=5,enabled = true)
	public void TC4_errorpageCTATextDisplayed() throws InterruptedException, URISyntaxException {
		testStart("Navigating to the Error Page and verying cloud background dislayed");
		String appendedurl=erropage.addtexttoEndURL();
		WebPageLoaded.isDomInteractive(4000);	
		getDriver().navigate().to(appendedurl);
		String ActualCTATextdisplayed=erropage.CTABacktoAccuweatheisDisplayed();
		WebPageLoaded.isDomInteractive(4000);
		Assert.assertEquals(ActualCTATextdisplayed, expectedCTAtext,"CTA Text (Back to AccuWeather) displayed not matching");
	}
	
	@Test(priority=6,enabled = true)
	public void TC4_errorpageCTAtextDisplayedinOrange() throws InterruptedException, URISyntaxException {
		testStart("Navigating to the Error Page and verying cloud background displayed");
		String appendedurl=erropage.addtexttoEndURL();
		WebPageLoaded.isDomInteractive(4000);	
		getDriver().navigate().to(appendedurl);
		String ActualCTATextcolourdisplayed=erropage.CTABacktoAccuweathercolourDisplayed();
		Assert.assertEquals(ActualCTATextcolourdisplayed, ORANGE_COLOR, "CTA Text Back to AcuuWeater not displayed in Orange colour");
	}
	
	@Test(priority=7,enabled = true)
	public void TC4_errorpageCTAtextDisplayedwitharrow() throws InterruptedException, URISyntaxException {
		testStart("Navigating to the Error Page and verying cloud background dislayed");
		String appendedurl=erropage.addtexttoEndURL();
		WebPageLoaded.isDomInteractive(4000);	
		getDriver().navigate().to(appendedurl);
		WebPageLoaded.isDomInteractive(4000);
		Assert.assertTrue(erropage.CTABacktoAccuweatherwithArrowDisplayed());
	}

	@Test(priority=8,enabled = true)
	public void TC5_errorpageCTABacktoAccuweatherisclicked() throws InterruptedException, URISyntaxException {
		testStart("Navigating to the Error Page and verying cloud background dislayed");
		String appendedurl=erropage.addtexttoEndURL();
		WebPageLoaded.isDomInteractive(4000);	
		getDriver().navigate().to(appendedurl);
		WebPageLoaded.isDomInteractive(4000);	
		erropage.CTABacktoAccuweatherisClicked();
		WebPageLoaded.isDomInteractive(4000);
		Assert.assertEquals(getDriver().getCurrentUrl(), expectedAccuweatherUrl,"User not redirected to Acuweather Home page");
	}
	
	@Test(priority=9,enabled = true)
	public void TC6_navigatingtoBuild500ErrorPage() throws InterruptedException, URISyntaxException {
        testStart("Navigating to the 500 Error Page");
		String appendedurl=erropage.apendtexttoEndURL2();
		WebPageLoaded.isDomInteractive(4000);	
		getDriver().navigate().to(appendedurl);
		WebPageLoaded.isDomInteractive(4000);	
		Assert.assertEquals(getDriver().getCurrentUrl(), expected500ErrorpageURL,"User not navigated to 500 Error Page");
	}
	
	@Test(priority=10,enabled = true)
	public void TC6_navigatingto500ErrorPageandvalidatingErrortype() throws InterruptedException, URISyntaxException {
        testStart("Navigating to the 500 Error Page and validating Error Type displayed ");
		String appendedurl=erropage.apendtexttoEndURL2();
		WebPageLoaded.isDomInteractive(4000);	
		getDriver().navigate().to(appendedurl);
		String ErrorTypeDisplayed=erropage.errortypeDisplayed();
		WebPageLoaded.isDomInteractive(4000);
		Assert.assertEquals(ErrorTypeDisplayed, expected500ErrorpageType,"Error Type 500 displayed is not matching ");
	}
	
	@Test(priority=11,enabled = true)
	public void TC7_navigatingto500ErrorPageandvalidatingErrortextdisplayed() throws InterruptedException, URISyntaxException {
        testStart("Navigating to the 500 Error Page and validating Error Type displayed ");
		String appendedurl=erropage.apendtexttoEndURL2();
		WebPageLoaded.isDomInteractive(4000);	
		getDriver().navigate().to(appendedurl);
		String ErrorTextDisplayed=erropage.errorpageTextDisplayed();
		WebPageLoaded.isDomInteractive(4000);
		Assert.assertEquals(ErrorTextDisplayed, expected500ErrorpageErrorText,"Error Type 500 displayed is not matching ");
	}
	
	@Test(priority=12,enabled = true)
	public void TC8_navigatingto500errorpagevalidatingCTATextDisplayed() throws InterruptedException, URISyntaxException {
		testStart("Navigating to 500 Error Page and validating Text Back to AccuWeather is dislayed");
		String appendedurl=erropage.apendtexttoEndURL2();
		WebPageLoaded.isDomInteractive(4000);	
		getDriver().navigate().to(appendedurl);
		String ActualCTATextdisplayed=erropage.CTABacktoAccuweatheisDisplayed();WebPageLoaded.isDomInteractive(4000);
		Assert.assertEquals(ActualCTATextdisplayed, expectedCTAtext,"CTA Text (Back to AccuWeather) displayed not matching");
	}
	
	@Test(priority=13,enabled = true)
	public void TC8_navigatingto500errorpagevalidatingCTAtextDisplayedinOrange() throws InterruptedException, URISyntaxException {
		testStart("Navigating to 500 Error Page and validating CTAtext Displayed in Orange");
		String appendedurl=erropage.apendtexttoEndURL2();
		WebPageLoaded.isDomInteractive(4000);	
		getDriver().navigate().to(appendedurl);
		String ActualCTATextcolourdisplayed=erropage.CTABacktoAccuweathercolourDisplayed();
		WebPageLoaded.isDomInteractive(4000);
		Assert.assertEquals(ActualCTATextcolourdisplayed, ORANGE_COLOR, "CTA Text Back to AcuuWeater not displayed in Orange colour");
	}
	
	@Test(priority=14,enabled = true)
	public void TC8_navigatingto500errorpagevalidatingCTAtextDisplayedwitharrow() throws InterruptedException, URISyntaxException {
		testStart("Navigating to the Error Page and validating CTAtext Displayed with arrow");
		String appendedurl=erropage.apendtexttoEndURL2();
		WebPageLoaded.isDomInteractive(4000);	
		getDriver().navigate().to(appendedurl);
		WebPageLoaded.isDomInteractive(4000);
		Assert.assertTrue(erropage.CTABacktoAccuweatherwithArrowDisplayed());
	}

	@Test(priority=15,enabled = true)
	public void TC8_navigatingto500errorpageandvalidatingCTABacktoAccuweatherisclicked() throws InterruptedException, URISyntaxException {
		testStart("Navigating to the Error Page and validating CTA BacktoAccuweather isclicked and navigated to Home page");
		String appendedurl=erropage.apendtexttoEndURL2();
		WebPageLoaded.isDomInteractive(4000);	
		getDriver().navigate().to(appendedurl);
		WebPageLoaded.isDomInteractive(4000);	
		erropage.CTABacktoAccuweatherisClicked();
		WebPageLoaded.isDomInteractive(4000);	
		Assert.assertEquals(getDriver().getCurrentUrl(), expectedAccuweatherUrl,"User not redirected to Acuweather Home page");
	}

	
	
}
