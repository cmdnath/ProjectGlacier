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
private By byGridViewRightArrow = By.cssSelector("div.two-column-page-content > div.page-column-1 > div.monthly-tools > div.card-button.monthly-nav.centered > a.arrow-wrap.is-next > svg");
private By byGridViewLeftArrow = By.cssSelector("div.two-column-page-content > div.page-column-1 > div.monthly-tools > div.card-button.monthly-nav.centered > a:nth-child(1) > svg");
private By byListViewGridIcon = By.cssSelector("div.page-column-1 > div.monthly-tools > div.layout-selector > a.grid-button > svg > g > path.p2");
private By byListViewIcon = By.cssSelector("div.page-column-1 > div.monthly-tools > div.layout-selector > a:nth-child(2) > svg > path");
private By byListViewEntireMonthDayRows = By.cssSelector("div.two-column-page-content > div.page-column-1 > div.monthly-component");
private By byGridViewMonthYearText = By.cssSelector("div.two-column-page-content > div.page-column-1 > div.monthly-tools > div.card-button.monthly-nav.centered > span");



/*
 * Method to click On Right Arrow under Grid View of the AW Monthly Forecast page
 */
public void clickOnRightArrowLink() {
	WebPageLoaded.isDomInteractive();
	WebElement rightarrowlink = getDriver().findElement(byGridViewRightArrow);
	rightarrowlink.syncVisible(15);
	rightarrowlink.hover();
	rightarrowlink.click();
	}

/*
 * Method to click On Left Arrow on the AW Monthly Forecast page
 */
public void clickOnLeftArrowLink() {
	WebPageLoaded.isDomInteractive();
	WebElement leftarrowlink = getDriver().findElement(byListViewLeftArrow);
	leftarrowlink.syncVisible(15);
	leftarrowlink.hover();
	leftarrowlink.click();
	}

/*
 * Method to get Substring of Month from Month Year Span
 * under Grid View on AW Monthly Forecast page
 */
public String  getGridViewMonthSubString() {
	 WebPageLoaded.isDomInteractive();
	 final WebElement gridviewmonthText = getDriver().findElement(byGridViewMonthYearText);
	 gridviewmonthText.syncVisible();
    String gridviewmonth = gridviewmonthText.getText();
    String substringmonthname = gridviewmonth.substring(0, gridviewmonth.length()-4).trim();
    System.out.println("substringmonthname substringmonthname... " +substringmonthname);
    return substringmonthname;
    }
}
