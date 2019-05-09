package com.accuweather.glacier.www.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.accuweather.glacier.BasePage;
import com.chameleon.selenium.web.WebPageLoaded;
import com.chameleon.selenium.web.elements.WebElement;

public class ThreeDayForecastPage extends BasePage {

	/*
	 * 
	 * locators
	 * 
	 */
	
	private By bynowTab=By.cssSelector("body > div.template-root > div.page-subnav > div > div > div.subnav-items > a.subnav-item.active");
	private By bycurrentWeatherCard = By.cssSelector("body > div.template-root > div.two-column-page-content > div.page-column-1 > div.flipper-panel.three-day-panel.three-day-forecast.full-mobile-width > div.scroll > a.panel.panel-fade-in.card.current > div > p:nth-child(1)");
	private By byCurrentWeatherTimeStamp = By.cssSelector("body > div.template-root > div.two-column-page-content > div.page-column-1 > div.flipper-panel.three-day-panel.three-day-forecast.full-mobile-width > div.scroll > a.panel.panel-fade-in.card.current > div > p.module-header.sub.date");
	private By byCurrentWeatherIcon = By.cssSelector("body > div.template-root > div.two-column-page-content > div.page-column-1 > div.flipper-panel.three-day-panel.three-day-forecast.full-mobile-width > div.scroll > a.panel.panel-fade-in.card.current > div > img");
	private By byCurrentWeatherTemperature = By.cssSelector("body > div.template-root > div.two-column-page-content > div.page-column-1 > div.flipper-panel.three-day-panel.three-day-forecast.full-mobile-width > div.scroll > a.panel.panel-fade-in.card.current > div > div.temp > span");
	private By byCurrentWeatherRealFeelTemperature = By.cssSelector("body > div.template-root > div.two-column-page-content > div.page-column-1 > div.flipper-panel.three-day-panel.three-day-forecast.full-mobile-width > div.scroll > a.panel.panel-fade-in.card.current > div > div.real-feel");
	private By byCurrentWeatherDescriptipn = By.cssSelector("body > div.template-root > div.two-column-page-content > div.page-column-1 > div.flipper-panel.three-day-panel.three-day-forecast.full-mobile-width > div.scroll > a.panel.panel-fade-in.card.current > div > div.cond");
	private By byTodayCard = By.cssSelector("body > div.template-root > div.two-column-page-content > div.page-column-1 > div.flipper-panel.three-day-panel.three-day-forecast.full-mobile-width > div.scroll > a:nth-child(2) > div > p:nth-child(1)");
	private By byTodaydate = By.cssSelector("body > div.template-root > div.two-column-page-content > div.page-column-1 > div.flipper-panel.three-day-panel.three-day-forecast.full-mobile-width > div.scroll > a:nth-child(2) > div > p.module-header.sub.date");
	private By byTodayWeathericon= By.cssSelector("body > div.template-root > div.two-column-page-content > div.page-column-1 > div.flipper-panel.three-day-panel.three-day-forecast.full-mobile-width > div.scroll > a:nth-child(2) > div > img");
	private By byTodayTemperature=By.cssSelector("body > div.template-root > div.two-column-page-content > div.page-column-1 > div.flipper-panel.three-day-panel.three-day-forecast.full-mobile-width > div.scroll > a:nth-child(2) > div > div.temp.has-real-feel > span.high");
	private By byTodayRealFeelTemprature =By.cssSelector("body > div.template-root > div.two-column-page-content > div.page-column-1 > div.flipper-panel.three-day-panel.three-day-forecast.full-mobile-width > div.scroll > a:nth-child(2) > div > div.real-feel");
	private By byTodayWeatherdescription =By.cssSelector("body > div.template-root > div.two-column-page-content > div.page-column-1 > div.flipper-panel.three-day-panel.three-day-forecast.full-mobile-width > div.scroll > a:nth-child(2) > div > div.cond");
	private By byTodayHighTemperature = By.cssSelector("body > div.template-root > div.two-column-page-content > div.page-column-1 > div.flipper-panel.three-day-panel.three-day-forecast.full-mobile-width > div.scroll > a:nth-child(2) > div > div.temp.has-real-feel > span.low");
	private By byTonightLowTemperatue = By.cssSelector("body > div.template-root > div.two-column-page-content > div.page-column-1 > div.flipper-panel.three-day-panel.three-day-forecast.full-mobile-width > div.scroll > a:nth-child(3) > div > div.temp.has-real-feel > span.low");
	private By byTonight = By.cssSelector("body > div.template-root > div.two-column-page-content > div.page-column-1 > div.flipper-panel.three-day-panel.three-day-forecast.full-mobile-width > div.scroll > a:nth-child(3) > div > p:nth-child(1)");
	private By byTonightdate = By.cssSelector("body > div.template-root > div.two-column-page-content > div.page-column-1 > div.flipper-panel.three-day-panel.three-day-forecast.full-mobile-width > div.scroll > a:nth-child(3) > div > p.module-header.sub.date");
	private By byTonightWeathericon= By.cssSelector("body > div.template-root > div.two-column-page-content > div.page-column-1 > div.flipper-panel.three-day-panel.three-day-forecast.full-mobile-width > div.scroll > a:nth-child(3) > div > img");
	private By byTonightTemperature=By.cssSelector("body > div.template-root > div.two-column-page-content > div.page-column-1 > div.flipper-panel.three-day-panel.three-day-forecast.full-mobile-width > div.scroll > a:nth-child(3) > div > div.temp.has-real-feel > span.high");
	private By byTonightRealFeelTemprature =By.cssSelector("body > div.template-root > div.two-column-page-content > div.page-column-1 > div.flipper-panel.three-day-panel.three-day-forecast.full-mobile-width > div.scroll > a:nth-child(3) > div > div.real-feel");
	private By byTonightWeatherdescription =By.cssSelector("body > div.template-root > div.two-column-page-content > div.page-column-1 > div.flipper-panel.three-day-panel.three-day-forecast.full-mobile-width > div.scroll > a:nth-child(3) > div > div.cond");
	private By byTomorrow = By.cssSelector("body > div.template-root > div.two-column-page-content > div.page-column-1 > div.flipper-panel.three-day-panel.three-day-forecast.full-mobile-width > div.scroll > a:nth-child(4) > div > p:nth-child(1)");
	private By byTomorrowdate = By.cssSelector("body > div.template-root > div.two-column-page-content > div.page-column-1 > div.flipper-panel.three-day-panel.three-day-forecast.full-mobile-width > div.scroll > a:nth-child(4) > div > p.module-header.sub.date");
	private By byTomorrowWeathericon= By.cssSelector("body > div.template-root > div.two-column-page-content > div.page-column-1 > div.flipper-panel.three-day-panel.three-day-forecast.full-mobile-width > div.scroll > a:nth-child(4) > div > img");
	private By byTomorrowTemperature=By.cssSelector("body > div.template-root > div.two-column-page-content > div.page-column-1 > div.flipper-panel.three-day-panel.three-day-forecast.full-mobile-width > div.scroll > a:nth-child(4) > div > div.temp > span.high");
	private By byTomorrowWeatherdescription =By.cssSelector("body > div.template-root > div.two-column-page-content > div.page-column-1 > div.flipper-panel.three-day-panel.three-day-forecast.full-mobile-width > div.scroll > a:nth-child(4) > div > div.cond");
	private By byAnimationBarForward = By.cssSelector("div.page-column-1 > div.flipper-panel.three-day-panel.three-day-forecast.full-mobile-width > div.next > div.arrow.top.card.active");  
	private By byAnimationBarBackward = By.cssSelector("div.page-column-1 > div.flipper-panel.three-day-panel.three-day-forecast.full-mobile-width > div.next > div:nth-child(2)");
	private By bynextdayheader =By.cssSelector("div.page-column-1 > div.flipper-panel.three-day-panel.three-day-forecast.full-mobile-width > div.scroll > a:nth-child(1) > div > p:nth-child(1)");
	private By forwardarrow =By.cssSelector("body > div.template-root > div.two-column-page-content > div.page-column-1 > div.flipper-panel.three-day-panel.three-day-forecast.full-mobile-width > div.next > div.arrow.top.card.active > svg");
	private By backarrow =By.cssSelector("body > div.template-root > div.two-column-page-content > div.page-column-1 > div.flipper-panel.three-day-panel.three-day-forecast.full-mobile-width > div.next > div:nth-child(2) > svg");
	private By bynextdayheaderDay =By.cssSelector("div.page-column-1 > div.flipper-panel.three-day-panel.three-day-forecast.full-mobile-width > div.scroll > a:nth-child(1) > div > p:nth-child(1)");
	private By bynextdayheaderDate=By.cssSelector("div.page-column-1 > div.flipper-panel.three-day-panel.three-day-forecast.full-mobile-width > div.scroll > a:nth-child(1) > div > p.module-header.sub.date");
	
	/*
	 * 
	 * Methods
	 *
	 * 
	 */
	
	// 3day class files
	
	public void searchbyLocation(){
	
	}
	
	public void isNowTabHighlighted() {
		WebPageLoaded.isDomInteractive();
		WebElement nowTab = getDriver().findElement(bynowTab);
		nowTab.syncVisible(15);
		nowTab.isSelected();
	}
	
	
	public Boolean weatherCardIsDisplayed(String cardName){
		
		if(cardName.equalsIgnoreCase("currentWeather"))
		{
		WebPageLoaded.isDomInteractive();
		WebElement currentWeatherCard = getDriver().findElement(bycurrentWeatherCard);
		currentWeatherCard.syncVisible(20);
		currentWeatherCard.isSelected();
		return true;
		}
		
		if(cardName.equalsIgnoreCase("Today"))
		{
		WebPageLoaded.isDomInteractive();
		WebElement TodayCard = getDriver().findElement(byTodayCard);
		TodayCard.syncVisible(20);
		TodayCard.isSelected();
		return true;
		}
		
		
		if(cardName.equalsIgnoreCase("Tonight"))
		{
		WebPageLoaded.isDomInteractive();
		WebElement TonightCard = getDriver().findElement(byTonight);
		TonightCard.syncVisible(20);
		TonightCard.isSelected();
		return true;
		}
		
		
		if(cardName.equalsIgnoreCase("Tomorrow"))
		{
		WebPageLoaded.isDomInteractive();
		WebElement Tomorrow = getDriver().findElement(byTomorrow);
		Tomorrow.syncVisible(20);
		Tomorrow.isSelected();
		return true;
		}
		return false;
	}
	
	
	public void weatherCardElementsIsDisplayed(String cardName){
		WebPageLoaded.isDomInteractive();

		if (cardName.equalsIgnoreCase("Current Weather")) {
			WebPageLoaded.isDomInteractive();
			String CurrentWeather = "CURRENT WEATHER";
			Assert.assertEquals(getDriver().findElement(bycurrentWeatherCard).getText(), CurrentWeather);
			Assert.assertTrue(getDriver().findElement(byCurrentWeatherTimeStamp).isDisplayed());
			Assert.assertTrue(getDriver().findElement(byCurrentWeatherIcon).isDisplayed());
			Assert.assertTrue(getDriver().findElement(byCurrentWeatherTemperature).isDisplayed());
			Assert.assertTrue(getDriver().findElement(byCurrentWeatherRealFeelTemperature).isDisplayed());
			Assert.assertTrue(getDriver().findElement(byCurrentWeatherDescriptipn).isDisplayed());

		}
		
		if (cardName.equalsIgnoreCase("Today")) {
			WebPageLoaded.isDomInteractive();
			String Today = "TODAY";
			Assert.assertEquals(getDriver().findElement(byTodayCard).getText(), Today);
			Assert.assertTrue(getDriver().findElement(byTodaydate).isDisplayed());
			Assert.assertTrue(getDriver().findElement(byTodayWeathericon).isDisplayed());
			Assert.assertTrue(getDriver().findElement(byTodayTemperature).isDisplayed());
			Assert.assertTrue(getDriver().findElement(byTodayRealFeelTemprature).isDisplayed());
			Assert.assertTrue(getDriver().findElement(byTodayWeatherdescription).isDisplayed());

		}
		
		if (cardName.equalsIgnoreCase("Tonight")) {
			WebPageLoaded.isDomInteractive();
			String Tonight = "TONIGHT";
			Assert.assertEquals(getDriver().findElement(byTonight).getText(), Tonight);
			Assert.assertTrue(getDriver().findElement(byTonightdate).isDisplayed());
			Assert.assertTrue(getDriver().findElement(byTonightWeathericon).isDisplayed());
			Assert.assertTrue(getDriver().findElement(byTonightTemperature).isDisplayed());
			Assert.assertTrue(getDriver().findElement(byTonightRealFeelTemprature).isDisplayed());
			Assert.assertTrue(getDriver().findElement(byTonightWeatherdescription).isDisplayed());

		}
		
		
		if (cardName.equalsIgnoreCase("Tomorrow")) {
			WebPageLoaded.isDomInteractive();
			String Tomorrow = "TOMORROW";
			Assert.assertEquals(getDriver().findElement(byTomorrow).getText(),Tomorrow);
			Assert.assertTrue(getDriver().findElement(byTomorrowdate).isDisplayed());
			Assert.assertTrue(getDriver().findElement(byTomorrowWeathericon).isDisplayed());
			Assert.assertTrue(getDriver().findElement(byTomorrowTemperature).isDisplayed());
			Assert.assertTrue(getDriver().findElement(byTomorrowWeatherdescription).isDisplayed());

		}
}
	
	
	
	public void navigatingToCurrentWeatherLocationKeyPage(String weathercard ){
		if (weathercard.equalsIgnoreCase("current weather")) {
			WebPageLoaded.isDomInteractive();
			WebElement currentWeatherCard = getDriver().findElement(bycurrentWeatherCard);
			currentWeatherCard.click();
			WebPageLoaded.isDomInteractive();
			String Expectedurl = "https://development.accuweather.com/en/us/state-college/16801/current-weather/6787_pc";
			WebPageLoaded.isDomInteractive();
			String actualUrl = getDriver().getCurrentUrl();
			WebPageLoaded.isDomInteractive();
			Assert.assertEquals(actualUrl, Expectedurl);

		}
		
		else if(weathercard.equalsIgnoreCase("Today")){
			WebPageLoaded.isDomInteractive();
			WebElement currentWeatherCard = getDriver().findElement(byTodayCard);
			currentWeatherCard.click();
			WebPageLoaded.isDomInteractive();
			String Expectedurl = "https://development.accuweather.com/en/us/state-college/16801/current-weather/6787_pc";
			WebPageLoaded.isDomInteractive();
			String actualUrl = getDriver().getCurrentUrl();
			WebPageLoaded.isDomInteractive();
			Assert.assertEquals(actualUrl, Expectedurl);

		}
		
		else if(weathercard.equalsIgnoreCase("Tonight")){
			WebPageLoaded.isDomInteractive();
			WebElement currentWeatherCard = getDriver().findElement(byTonight);
			currentWeatherCard.click();
			WebPageLoaded.isDomInteractive();
			String Expectedurl = "https://development.accuweather.com/en/us/state-college/16801/current-weather/6787_pc";
			WebPageLoaded.isDomInteractive();
			String actualUrl = getDriver().getCurrentUrl();
			WebPageLoaded.isDomInteractive();
			Assert.assertEquals(actualUrl, Expectedurl);

		}
		
		else if(weathercard.equalsIgnoreCase("tomorrow")){
			WebPageLoaded.isDomInteractive();
			WebElement currentWeatherCard = getDriver().findElement(byTomorrow);
			currentWeatherCard.click();
			WebPageLoaded.isDomInteractive();
			String Expectedurl = "https://development.accuweather.com/en/us/state-college/16801/daily-weather-forecast/6787_pc?day=1";
			WebPageLoaded.isDomInteractive();
			String actualUrl = getDriver().getCurrentUrl();
			WebPageLoaded.isDomInteractive();
			Assert.assertEquals(actualUrl, Expectedurl);

		}
		
	
	}
	
	
	public void todayWeatherMax_hiTemperature() {
		WebPageLoaded.isDomInteractive();
		WebElement TodayHighTemperature = getDriver().findElement(byTodayHighTemperature);
		Assert.assertTrue(TodayHighTemperature.isDisplayed());
		
	}
	
	public void tonightWeatherMin_loTemperature() {

		WebPageLoaded.isDomInteractive();
		WebElement TonightLowTemperatue = getDriver().findElement(byTonightLowTemperatue);
		Assert.assertTrue(TonightLowTemperatue.isDisplayed());

	}
	
	
	
	
	public void animationBarForwardarrowActive() {
		WebPageLoaded.isDomInteractive();
		WebElement AnimationBarForward = getDriver().findElement(byAnimationBarForward);
		Assert.assertTrue(AnimationBarForward.isEnabled(),"Forward Arrow Active");
		
	}

	public void animationBarBackwardarrowActive() {
		WebPageLoaded.isDomInteractive();
		WebElement AnimationBarBackward = getDriver().findElement(byAnimationBarBackward);
		Assert.assertTrue(AnimationBarBackward.isEnabled(),"Backward Arrow Active");
		
	}
	
	public void animationforwardarrowclick()
	{
		WebPageLoaded.isDomInteractive();
		 getDriver().findElement(byAnimationBarForward).click();
		 
		
	}
	
	public String Nextfourdaysday()
	{
		WebPageLoaded.isDomInteractive();
		getDriver().findElement(byAnimationBarForward).click();
		String Day= getDriver().findElement(bynextdayheaderDay).getText();
		return Day;
		
		
	}
	
	public String Nextfourdaysdate()
	{
		WebPageLoaded.isDomInteractive();
		getDriver().findElement(byAnimationBarForward).click();
		String date =getDriver().findElement(bynextdayheaderDate).getText();
		return date;
	}

	public void animationBackwardarrowclick()
	{
		WebPageLoaded.isDomInteractive();
		 getDriver().findElement(byAnimationBarBackward).click();
	}

	public  String Backwardarrowcolour()
	{
		WebPageLoaded.isDomInteractive();
		String bc = getDriver().findElement(backarrow).getCssValue("fill");
        return bc;
	}
	
	public  String Forwardarrowcolour()
	{
		WebPageLoaded.isDomInteractive();
		String Forwardarrowcsscolour=getDriver().findElement(forwardarrow).getCssValue("color");
		String fc = getDriver().findElement(forwardarrow).getCssValue("fill");
		 return Forwardarrowcsscolour;
				
	}

	
	
	
	
}

