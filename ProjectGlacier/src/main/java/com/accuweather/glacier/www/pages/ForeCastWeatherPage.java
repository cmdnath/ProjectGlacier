package com.accuweather.glacier.www.pages;

import org.openqa.selenium.By;

import com.accuweather.glacier.BasePage;
import com.chameleon.selenium.web.WebPageLoaded;
import com.chameleon.selenium.web.elements.WebElement;
//import com.chameleon.selenium.web.elements.WebLabel;
import com.chameleon.selenium.web.elements.WebTextbox;


public class ForeCastWeatherPage extends BasePage {
	
	private By byForecastCityName = By.cssSelector("a:nth-child(3) > h1");
	
	

	public String  getforecastCityNameSubString() {
		 WebPageLoaded.isDomInteractive();
		//final WebTextbox ForecastCityName = getDriver().findTextbox(byForecastCityName);
		 final WebElement ForecastCityName = getDriver().findElement(byForecastCityName);
        //WebTextbox byForecastCityName = getDriver().getWebDriver().findElement(byForecastCityName);
        ForecastCityName.syncVisible();
        String ForecastCityNam = ForecastCityName.getText();
        System.out.println("ForecastCityNam......" +ForecastCityNam);
        String substringForecastCityName = ForecastCityNam.substring(0, ForecastCityNam.length()-4);
        return substringForecastCityName;
        }
	
	
}
