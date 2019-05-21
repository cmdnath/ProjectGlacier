package com.accuweather.glacier.www.pages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;

import com.accuweather.glacier.BasePage;
import com.chameleon.selenium.web.WebPageLoaded;
import com.chameleon.selenium.web.elements.WebElement;

public class LegalFooter extends BasePage{
	private By byCopyRight = By.cssSelector("body > div.template-root > div.base-footer.is-en > div.footer-legalese.footer-legalese > div.footer-copyright > span:nth-child(1)");
	private By byRegisteredTrademarks = By.cssSelector("body > div.template-root > div.base-footer.is-en > div.footer-legalese.footer-legalese > div.footer-copyright > span:nth-child(2)");
	private By byRightsReserved = By.cssSelector("body > div.template-root > div.base-footer.is-en > div.footer-legalese.footer-legalese > div.footer-copyright > span:nth-child(3)");
	private By byTermsOfUse = By.cssSelector("body > div.template-root > div.base-footer.is-en > div.footer-legalese.footer-legalese > div.footer-terms > a:nth-child(1)");
	private By byPrivacyPolicy = By.cssSelector("body > div.template-root > div.base-footer.is-en > div.footer-legalese.footer-legalese > div.footer-terms > a:nth-child(2)");
	private By byCookiePolicy = By.cssSelector("body > div.template-root > div.base-footer.is-en > div.footer-legalese.footer-legalese > div.footer-terms > a:nth-child(3)");
	private By byTAGDisclosure = By.cssSelector("body > div.template-root > div.base-footer.is-en > div.footer-legalese.footer-legalese > div.footer-terms > a:nth-child(4)");
	private By byTermsOfUseTab = By.cssSelector("body > div.template-root > div.page-subnav > div > div > div.subnav-items > a:nth-child(1)");
	private By byPrivacyPolicyTab = By.cssSelector("body > div.template-root > div.page-subnav > div > div > div.subnav-items > a:nth-child(2)");
	private By byCookiePolicyTab = By.cssSelector("body > div.template-root > div.page-subnav > div > div > div.subnav-items > a:nth-child(5)");
	private By byTAGDisclosureTab = By.cssSelector("body > div.template-root > div.page-subnav > div > div > div.subnav-items > a:nth-child(6)");
	private By byTermsOfUseHeading = By.cssSelector("body > div.template-root > div.page-content > div > div > h2");
	private By byPrivacyPolicyHeading = By.cssSelector("body > div.template-root > div.page-content > div > div > h2");
	private By byTAGDisclosureHeading = By.cssSelector("body > div.template-root > div.page-content > div > div > h2");
	private By byCookiePolicyHeading = By.cssSelector("body > div.template-root > div.page-content > div > div > h2");
	
	/**
	 * Method to validate if Terms Of Use link is present on Footer
	 * @author HFARAZ
	 * @return - Boolean value - "true if Terms of use link is present else false"
	 * */
	public Boolean isTermsOfUsePresent()
	{
		WebPageLoaded.isDomInteractive();
		WebElement termsOfUseLink = getDriver().findElement(byTermsOfUse);
		termsOfUseLink.syncVisible(30);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return termsOfUseLink.isDisplayed();
	}
	
	/**
	 * Method to get the text of Terms Of Use present on Footer
	 * @author HFARAZ
	 * @return - String value - "returns the text of Terms of Use"
	 * */
	public String getTermsOfUseText()
	{
		WebPageLoaded.isDomInteractive();
		WebElement termsOfUseText = getDriver().findElement(byTermsOfUse);
		termsOfUseText.syncVisible(30);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return termsOfUseText.getText();
	}
	
	/**
	 * Method to get the URL of Terms Of Use page
	 * @author HFARAZ
	 * @return - String value - "URL of Terms Of Use page"
	 * */
	public String getURLOfTermsOfUse()
	{
		WebPageLoaded.isDomInteractive();
		WebElement termsOfUseLink = getDriver().findElement(byTermsOfUse);
		termsOfUseLink.syncVisible(30);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		termsOfUseLink.jsClick();
		String window = getDriver().getWindowHandle();
		switchToPopUpWindow(window);
		return getDriver().getCurrentUrl();
		
	}
	
	/**
	 * Method to get the title of Terms Of Use page
	 * @author HFARAZ
	 * @return - String value - "title of Terms Of Use page"
	 * */
	public String getTitleOfTermsOfUse()
	{
		WebPageLoaded.isDomInteractive();
		WebElement termsOfUseLink = getDriver().findElement(byTermsOfUse);
		termsOfUseLink.syncVisible(30);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		termsOfUseLink.jsClick();
		String window = getDriver().getWindowHandle();
		switchToPopUpWindow(window);
		return getDriver().getTitle();
		
	}
	
	/**
	 * Method to get the value of Terms Of Use tab
	 * @author HFARAZ
	 * @return - String value - "name of the Terms of Use Tab"
	 * */
	public String getNameOfTermsOfUseTab()
	{
		WebPageLoaded.isDomInteractive();
		WebElement termsOfUseLink = getDriver().findElement(byTermsOfUse);
		termsOfUseLink.syncVisible(30);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		termsOfUseLink.jsClick();
		String window = getDriver().getWindowHandle();
		switchToPopUpWindow(window);
		WebElement termsOfUseTab = getDriver().findElement(byTermsOfUseTab);
		return termsOfUseTab.getText();
		
	}
	
	/**
	 * Method to get the heading of Terms Of Use page
	 * @author HFARAZ
	 * @return - String value - "heading of Terms Of Use page"
	 * */
	public String getHeadingOfTermsOfUse()
	{
		WebPageLoaded.isDomInteractive();
		WebElement termsOfUseLink = getDriver().findElement(byTermsOfUse);
		termsOfUseLink.syncVisible(30);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		termsOfUseLink.jsClick();
		String window = getDriver().getWindowHandle();
		switchToPopUpWindow(window);
		WebElement termsOfUseHeading = getDriver().findElement(byTermsOfUseHeading);
		return termsOfUseHeading.getText();
		
	}
	
	/**
	 * Method to get the color of the Active Tab
	 * @author HFARAZ
	 * @return - Color value of the Active tab
	 * */
	public String getTopBorderColor_Of_TermsOfUseTab()
	{
		WebPageLoaded.isDomInteractive();
		WebElement termsOfUseLink = getDriver().findElement(byTermsOfUse);
		termsOfUseLink.syncVisible(30);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		termsOfUseLink.jsClick();
		String window = getDriver().getWindowHandle();
		switchToPopUpWindow(window);
		String color = getDriver().findElement(byTermsOfUseTab).getCssValue("border-top-color");
		return Color.fromString(color).asHex();
	}
	
	
	/**
	 * Method to switch to a different window
	 * @author HFARAZ
	 * */
	public void switchToPopUpWindow(String webPage) {
		
		Set<String> windows = getDriver().getWindowHandles();
		System.out.println(windows.size());
		Iterator iterator = windows.iterator();
		String currentwindowId;
		while(iterator.hasNext()) 
		{
			currentwindowId = iterator.next().toString();
			if(!currentwindowId.equals(webPage))
				getDriver().switchTo().window(currentwindowId);
			
		}
	}
	
	/**
	 * Method to get the title of Privacy Policy page
	 * @author HFARAZ
	 * @return - String value - "title of Privacy Policy page"
	 * */
	public String getTitleOfPrivacyPolicy()
	{
		WebPageLoaded.isDomInteractive();
		WebElement privacyPolicyLink = getDriver().findElement(byPrivacyPolicy);
		privacyPolicyLink.syncVisible(30);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		privacyPolicyLink.jsClick();
		String window = getDriver().getWindowHandle();
		switchToPopUpWindow(window);
		return getDriver().getTitle();
		
	}
	
	/**
	 * Method to validate if Privacy Policy link is present on Footer
	 * @author HFARAZ
	 * @return - Boolean value - "true if Privacy Policy link is present else false"
	 * */
	public Boolean isPrivacyPolicyPresent()
	{
		WebPageLoaded.isDomInteractive();
		WebElement termsOfUseLink = getDriver().findElement(byPrivacyPolicy);
		termsOfUseLink.syncVisible(30);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return termsOfUseLink.isDisplayed();
	}
	
	/**
	 * Method to get the text of Privacy Policy present on Footer
	 * @author HFARAZ
	 * @return - String value - "returns the text of Privacy Policy"
	 * */
	public String getPrivacyPolicyText()
	{
		WebPageLoaded.isDomInteractive();
		WebElement termsOfUseText = getDriver().findElement(byPrivacyPolicy);
		termsOfUseText.syncVisible(30);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return termsOfUseText.getText();
	}
	
	/**
	 * Method to get the URL of Privacy Policy page
	 * @author HFARAZ
	 * @return - String value - "URL of Privacy Policy page"
	 * */
	public String getURLOfPrivacyPolicy()
	{
		WebPageLoaded.isDomInteractive();
		WebElement termsOfUseLink = getDriver().findElement(byPrivacyPolicy);
		termsOfUseLink.syncVisible(30);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		termsOfUseLink.jsClick();
		String window = getDriver().getWindowHandle();
		switchToPopUpWindow(window);
		return getDriver().getCurrentUrl();
		
	}
	
	
	/**
	 * Method to get the value of Privacy Policy tab
	 * @author HFARAZ
	 * @return - String value - "name of the Privacy Policy Tab"
	 * */
	public String getNameOfPrivacyPolicyTab()
	{
		WebPageLoaded.isDomInteractive();
		WebElement termsOfUseLink = getDriver().findElement(byPrivacyPolicy);
		termsOfUseLink.syncVisible(30);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		termsOfUseLink.jsClick();
		String window = getDriver().getWindowHandle();
		switchToPopUpWindow(window);
		WebElement termsOfUseTab = getDriver().findElement(byPrivacyPolicyTab);
		return termsOfUseTab.getText();
		
	}
	
	/**
	 * Method to get the heading of Privacy page
	 * @author HFARAZ
	 * @return - String value - "heading of Privacy Policy page"
	 * */
	public String getHeadingOfPrivacyPolicy()
	{
		WebPageLoaded.isDomInteractive();
		WebElement termsOfUseLink = getDriver().findElement(byPrivacyPolicy);
		termsOfUseLink.syncVisible(30);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		termsOfUseLink.jsClick();
		String window = getDriver().getWindowHandle();
		switchToPopUpWindow(window);
		WebElement termsOfUseHeading = getDriver().findElement(byPrivacyPolicyHeading);
		return termsOfUseHeading.getText();
		
	}
	
	/**
	 * Method to get the color of the Active Tab
	 * @author HFARAZ
	 * @return - Color value of the Active tab
	 * */
	public String getTopBorderColor_Of_PrivacyPolicyTab()
	{
		WebPageLoaded.isDomInteractive();
		WebElement termsOfUseLink = getDriver().findElement(byPrivacyPolicy);
		termsOfUseLink.syncVisible(30);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		termsOfUseLink.jsClick();
		String window = getDriver().getWindowHandle();
		switchToPopUpWindow(window);
		String color = getDriver().findElement(byPrivacyPolicyTab).getCssValue("border-top-color");
		return Color.fromString(color).asHex();
	}
	
	/**
	 * Method to get the title of Cookie Policy page
	 * @author HFARAZ
	 * @return - String value - "title of Cookie Policy page"
	 * */
	public String getTitleOfCookiePolicy()
	{
		WebPageLoaded.isDomInteractive();
		WebElement cookiePolicyLink = getDriver().findElement(byCookiePolicy);
		cookiePolicyLink.syncVisible(30);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cookiePolicyLink.jsClick();
		String window = getDriver().getWindowHandle();
		switchToPopUpWindow(window);
		return getDriver().getTitle();
		
	}
	
	/**
	 * Method to validate if Cookie Policy link is present on Footer
	 * @author HFARAZ
	 * @return - Boolean value - "true if Cookie Policy link is present else false"
	 * */
	public Boolean isCookiePolicyPresent()
	{
		WebPageLoaded.isDomInteractive();
		WebElement cookiePolicyLink = getDriver().findElement(byCookiePolicy);
		cookiePolicyLink.syncVisible(30);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return cookiePolicyLink.isDisplayed();
	}
	
	/**
	 * Method to get the text of Cookie Policy present on Footer
	 * @author HFARAZ
	 * @return - String value - "returns the text of Cookie Policy"
	 * */
	public String getCookiePolicyText()
	{
		WebPageLoaded.isDomInteractive();
		WebElement cookiePolicyText = getDriver().findElement(byCookiePolicy);
		cookiePolicyText.syncVisible(30);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return cookiePolicyText.getText();
	}
	
	/**
	 * Method to get the URL of Cookie Policy page
	 * @author HFARAZ
	 * @return - String value - "URL of Cookie Policy page"
	 * */
	public String getURLOfCookiePolicy()
	{
		WebPageLoaded.isDomInteractive();
		WebElement cookiePolicyLink = getDriver().findElement(byCookiePolicy);
		cookiePolicyLink.syncVisible(30);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cookiePolicyLink.jsClick();
		String window = getDriver().getWindowHandle();
		switchToPopUpWindow(window);
		return getDriver().getCurrentUrl();
		
	}
	
	
	/**
	 * Method to get the value of Cookie Policy tab
	 * @author HFARAZ
	 * @return - String value - "name of the Cookie Policy Tab"
	 * */
	public String getNameOfCookiePolicyTab()
	{
		WebPageLoaded.isDomInteractive();
		WebElement cookiePolicyLink = getDriver().findElement(byCookiePolicy);
		cookiePolicyLink.syncVisible(30);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cookiePolicyLink.jsClick();
		String window = getDriver().getWindowHandle();
		switchToPopUpWindow(window);
		WebElement cookiePolicyTab = getDriver().findElement(byCookiePolicyTab);
		return cookiePolicyTab.getText();
		
	}
	
	/**
	 * Method to get the heading of Cookie Policy page
	 * @author HFARAZ
	 * @return - String value - "heading of Cookie Policy page"
	 * */
	public String getHeadingOfCookiePolicy()
	{
		WebPageLoaded.isDomInteractive();
		WebElement cookiePolicyLink = getDriver().findElement(byCookiePolicy);
		cookiePolicyLink.syncVisible(30);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cookiePolicyLink.jsClick();
		String window = getDriver().getWindowHandle();
		switchToPopUpWindow(window);
		WebElement cookiePolicyHeading = getDriver().findElement(byCookiePolicyHeading);
		return cookiePolicyHeading.getText();
		
	}
	
	/**
	 * Method to get the color of the Active Tab
	 * @author HFARAZ
	 * @return - Color value of the Active tab
	 * */
	public String getTopBorderColor_Of_CookiePolicyTab()
	{
		WebPageLoaded.isDomInteractive();
		WebElement cookiePolicyLink = getDriver().findElement(byCookiePolicy);
		cookiePolicyLink.syncVisible(30);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cookiePolicyLink.jsClick();
		String window = getDriver().getWindowHandle();
		switchToPopUpWindow(window);
		String color = getDriver().findElement(byCookiePolicyTab).getCssValue("border-top-color");
		return Color.fromString(color).asHex();
	}

	/**
	 * Method to get the title of TAG Disclosure page
	 * @author HFARAZ
	 * @return - String value - "title of TAG Disclosure page"
	 * */
	public String getTitleOfTAGDisclosure()
	{
		WebPageLoaded.isDomInteractive();
		WebElement tagDisclosureLink = getDriver().findElement(byTAGDisclosure);
		tagDisclosureLink.syncVisible(30);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		tagDisclosureLink.jsClick();
		String window = getDriver().getWindowHandle();
		switchToPopUpWindow(window);
		return getDriver().getTitle();
		
	}
	
	/**
	 * Method to validate if TAG Disclosure link is present on Footer
	 * @author HFARAZ
	 * @return - Boolean value - "true if TAG Disclosure link is present else false"
	 * */
	public Boolean isTAGDisclosurePresent()
	{
		WebPageLoaded.isDomInteractive();
		WebElement tagDisclosureLink = getDriver().findElement(byTAGDisclosure);
		tagDisclosureLink.syncVisible(30);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return tagDisclosureLink.isDisplayed();
	}
	
	/**
	 * Method to get the text of TAG Disclosure present on Footer
	 * @author HFARAZ
	 * @return - String value - "returns the text of TAG Disclosure"
	 * */
	public String getTAGDisclosureText()
	{
		WebPageLoaded.isDomInteractive();
		WebElement tagDisclosureText = getDriver().findElement(byTAGDisclosure);
		tagDisclosureText.syncVisible(30);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return tagDisclosureText.getText();
	}
	
	/**
	 * Method to get the URL of TAG Disclosure page
	 * @author HFARAZ
	 * @return - String value - "URL of TAG Disclosure page"
	 * */
	public String getURLOfTAGDisclosure()
	{
		WebPageLoaded.isDomInteractive();
		WebElement tagDisclosureLink = getDriver().findElement(byTAGDisclosure);
		tagDisclosureLink.syncVisible(30);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		tagDisclosureLink.jsClick();
		String window = getDriver().getWindowHandle();
		switchToPopUpWindow(window);
		return getDriver().getCurrentUrl();
		
	}
	
	
	/**
	 * Method to get the value of TAG Disclosure tab
	 * @author HFARAZ
	 * @return - String value - "name of the TAG Disclosure Tab"
	 * */
	public String getNameOfTAGDisclosureTab()
	{
		WebPageLoaded.isDomInteractive();
		WebElement tagDisclosureLink = getDriver().findElement(byTAGDisclosure);
		tagDisclosureLink.syncVisible(30);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		tagDisclosureLink.jsClick();
		String window = getDriver().getWindowHandle();
		switchToPopUpWindow(window);
		WebElement cookiePolicyTab = getDriver().findElement(byTAGDisclosureTab);
		return cookiePolicyTab.getText();
		
	}
	
	/**
	 * Method to get the heading of TAG Disclosure page
	 * @author HFARAZ
	 * @return - String value - "heading of TAG Disclosure page"
	 * */
	public String getHeadingOfTAGDisclosure()
	{
		WebPageLoaded.isDomInteractive();
		WebElement tagDisclosureLink = getDriver().findElement(byTAGDisclosure);
		tagDisclosureLink.syncVisible(30);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		tagDisclosureLink.jsClick();
		String window = getDriver().getWindowHandle();
		switchToPopUpWindow(window);
		WebElement cookiePolicyHeading = getDriver().findElement(byTAGDisclosureHeading);
		return cookiePolicyHeading.getText();
		
	}
	
	/**
	 * Method to get the color of the Active Tab
	 * @author HFARAZ
	 * @return - Color value of the Active tab
	 * */
	public String getTopBorderColor_Of_TAGDisclosureTab()
	{
		WebPageLoaded.isDomInteractive();
		WebElement tagDisclosureLink = getDriver().findElement(byTAGDisclosure);
		tagDisclosureLink.syncVisible(30);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		tagDisclosureLink.jsClick();
		String window = getDriver().getWindowHandle();
		switchToPopUpWindow(window);
		String color = getDriver().findElement(byTAGDisclosureTab).getCssValue("border-top-color");
		return Color.fromString(color).asHex();
	}

	/**
	 * Method to get the text for copyRight information
	 * @author HFARAZ
	 * @return - String: text for copyright information
	 * */
	public String getCopyRightInformation()
	{
		WebPageLoaded.isDomInteractive();
		WebElement copyRightInfo = getDriver().findElement(byCopyRight);
		copyRightInfo.syncVisible(30);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return copyRightInfo.getText();
	}
	
	/**
	 * Method to get the text for Registered Trademarks information
	 * @author HFARAZ
	 * @return - String: text for Registered Trademarks information
	 * */
	public String getRegisteredTrademarksInformation()
	{
		WebPageLoaded.isDomInteractive();
		WebElement copyRightInfo = getDriver().findElement(byRegisteredTrademarks);
		copyRightInfo.syncVisible(30);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return copyRightInfo.getText();
	}
	
	/**
	 * Method to get the text for copyRight information
	 * @author HFARAZ
	 * @return - String: text for copyright information
	 * */
	public String getAllRightsReservedInformation()
	{
		WebPageLoaded.isDomInteractive();
		WebElement copyRightInfo = getDriver().findElement(byRightsReserved);
		copyRightInfo.syncVisible(30);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return copyRightInfo.getText();
	}
}
