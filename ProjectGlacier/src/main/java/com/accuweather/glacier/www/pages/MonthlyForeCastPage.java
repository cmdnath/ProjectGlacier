package com.accuweather.glacier.www.pages;

import org.openqa.selenium.By;

import com.accuweather.glacier.BasePage;
import com.chameleon.selenium.web.WebPageLoaded;
import com.chameleon.selenium.web.elements.WebElement;

public class MonthlyForeCastPage extends BasePage {

private By byMonthTab = By.cssSelector("div.page-subnav > div > div > div.subnav-items > a:nth-child(6)");
private By byListViewCurrentMonth = By.cssSelector("div.page-column-1 > div.monthly-tools > div.card-button.monthly-nav.centered > span");
private By byListViewLeftArrow = By.cssSelector("div.page-column-1 > div.monthly-tools > div.card-button.monthly-nav.centered > a:nth-child(1) > svg > path");
private By byListViewTodaySection = By.cssSelector("div.page-column-1 > div.monthly-component > a.forecast-list-card.monthly-list-card.today");
private By byListViewRightArrow = By.cssSelector("div.page-column-1 > div.monthly-tools > div.card-button.monthly-nav.centered > a.arrow-wrap.is-next > svg > path");
private By byListViewGridIcon = By.cssSelector("div.page-column-1 > div.monthly-tools > div.layout-selector > a.grid-button > svg > g > path.p2");
private By byListViewIcon = By.cssSelector("div.page-column-1 > div.monthly-tools > div.layout-selector > a:nth-child(2) > svg > path");
private By byListViewEntireMonthDayRows = By.cssSelector("div.two-column-page-content > div.page-column-1 > div.monthly-component");

/*
 * Method to click Month tab on the AW Monthly Forecast page
 */
public void clickOnMethodTab() {
	WebPageLoaded.isDomInteractive();
	WebElement methodtab = getDriver().findElement(byMonthTab);
	methodtab.syncVisible(15);
	methodtab.hover();
	methodtab.click();
	}

/*
 * Method to click On Right Arrow on the AW Monthly Forecast page
 */
public void clickOnRightArrowLink() {
	WebPageLoaded.isDomInteractive();
	WebElement methodtab = getDriver().findElement(byListViewRightArrow);
	methodtab.syncVisible(15);
	methodtab.hover();
	methodtab.click();
	}

}
