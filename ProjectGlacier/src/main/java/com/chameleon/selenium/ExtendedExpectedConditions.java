package com.chameleon.selenium;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExtendedExpectedConditions {
    /**
     * Loop through windows for duration to see if it finds a title with exact queried text
     *
     * @param title
     *            - Exact title of the Window to find
     * @return true once a window is found with exact title
     */
    public static ExpectedCondition<Boolean> findWindowWithTitleAndSwitchToIt(final String title) {
        return new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                try {
                    for (String handle : driver.getWindowHandles()) {
                        driver.switchTo().window(handle);
                        if (driver.getTitle().equals(title)) {
                            return true;
                        }
                    }
                } catch (WebDriverException e) {
                    return null;
                }

                return false;
            }

            @Override
            public String toString() {
                return String.format("text ('%s') to be present in window", title);
            }
        };
    }

    /**
     * Loop through windows for duration to see if it finds a title that contains queried text
     *
     * @param title
     *            - Partial title of the Window to find
     * @return WindowExistsWithTitle - Expected Condition to find window with title part
     */
    public static ExpectedCondition<Boolean> findWindowContainsTitleAndSwitchToIt(final String title) {
        return new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                try {
                    for (String handle : driver.getWindowHandles()) {
                        driver.switchTo().window(handle);
                        if (driver.getTitle().contains(title)) {
                            return true;
                        }
                    }
                } catch (WebDriverException e) {
                    return null;
                }
                return false;
            }

            @Override
            public String toString() {
                return String.format("text ('%s') to be present in window", title);
            }
        };
    }

    /**
     * Loop through windows for duration to see if it finds a title with the matching regex pattern
     *
     * @param regex
     *            - Regex of title of the Window to find
     * @return WindowExistsWithTitle - Expected Condition to find window with title regex
     */
    public static ExpectedCondition<Boolean> findWindowMatchesTitleAndSwitchToIt(final String regex) {
        return new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                try {
                    for (String handle : driver.getWindowHandles()) {
                        driver.switchTo().window(handle);
                        if (driver.getTitle().matches(regex)) {
                            return true;
                        }
                    }
                } catch (WebDriverException e) {
                    return null;
                }
                return false;
            }

            @Override
            public String toString() {
                return String.format("regex ('%s') to be in window", regex);
            }
        };
    }

    /**
     * An expectation for checking if the given text is present in the specified element.
     *
     * @param element
     *            the WebElement
     * @param text
     *            to be present in the element
     * @return true once the element contains the given text
     */
    public static ExpectedCondition<Boolean> textToMatchInElement(
            final WebElement element, final String regex) {

        return new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                try {
                    String elementText = element.getText();
                    return elementText.matches(regex);
                } catch (StaleElementReferenceException e) {
                    return false;
                }
            }

            @Override
            public String toString() {
                return String.format("regex pattern ('%s') to be match in element %s", regex, element);
            }
        };
    }

    /**
     * An expectation for checking if the given text is present in the specified
     * elements value attribute.
     *
     * @param element
     *            the WebElement
     * @param attribute
     *            to search in
     * @param text
     *            to be present in the element's value attribute
     * @return true once the element's value attribute contains the given text
     */
    public static ExpectedCondition<Boolean> textToBePresentInElementAttribute(
            final WebElement element, final String attribute, final String text) {

        return new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                try {
                    String elementText = element.getAttribute(attribute);
                    if (elementText != null) {
                        return elementText.contains(text);
                    } else {
                        return false;
                    }
                } catch (StaleElementReferenceException e) {
                    return false;
                }
            }

            @Override
            public String toString() {
                return String.format("text ('%s') to be the value attribute ('%s') in element %s", text, attribute, element);
            }
        };
    }

    /**
     * An expectation for checking if the given regex matches the given element attribute.
     *
     * @param webelement
     *            to retrieve attribute
     * @param attribute
     *            to retrieve
     * @param text
     *            to be present in the attribute found by the locator
     * @return true once the regex matches given text in element attribute
     */
    public static ExpectedCondition<Boolean> textToMatchInElementAttribute(
            final WebElement element, final String attribute, final String regex) {

        return new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                try {
                    String elementText = element.getAttribute(attribute);
                    if (elementText != null) {
                        return elementText.matches(regex);
                    } else {
                        return false;
                    }
                } catch (StaleElementReferenceException e) {
                    return false;
                }
            }

            @Override
            public String toString() {
                return String.format("attribute ('%s') to  match regex pattern ('%s') in element %s", attribute, regex, element);
            }
        };
    }

    /**
     * An expectation for checking if the given text is present in CSS property the specified
     * elements value attribute.
     *
     * @param element
     *            the WebElement
     * @param CSS
     *            property to search in
     * @param text
     *            to be present in the element's CSS property value
     * @return true once the element's value CSS property contains the given text
     */
    public static ExpectedCondition<Boolean> textToBePresentInElementCssProperty(
            final WebElement element, final String cssProperty, final String text) {

        return new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                try {
                    String elementText = element.getCssValue(cssProperty);
                    if (elementText != null) {
                        return elementText.contains(text);
                    } else {
                        return false;
                    }
                } catch (StaleElementReferenceException e) {
                    return false;
                }
            }

            @Override
            public String toString() {
                return String.format("value ('%s') to be the value CSS Property ('%s') in element %s", text, cssProperty, element);
            }
        };
    }

    /**
     * An expectation for checking if the given regex matches the given element CSS Property.
     *
     * @param webelement
     *            to retrieve CSS property
     * @param cssProperty
     *            to retrieve
     * @param text
     *            to be present in the CSS property value found by the locator
     * @return true once the regex matches given text in element CSS Property
     */
    public static ExpectedCondition<Boolean> textToMatchInElementCssProperty(
            final WebElement element, final String cssProperty, final String regex) {

        return new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                try {
                    String elementText = element.getCssValue(cssProperty);
                    if (elementText != null) {
                        return elementText.matches(regex);
                    } else {
                        return false;
                    }
                } catch (StaleElementReferenceException e) {
                    return false;
                }
            }

            @Override
            public String toString() {
                return String.format("value ('%s') to match regex pattern of value CSS Property ('%s') in element %s", regex, cssProperty, element);
            }
        };
    }

    public static ExpectedCondition<Boolean> elementToBeVisible(final By by) {
        return new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                try {
                    // System.out.println();
                    WebElement element = DriverManager.getDriver().getWebDriver().findElement(by);
                    Point location = element.getLocation();
                    Dimension size = element.getSize();
                    if ((location.getX() > 0 && location.getY() > 0) || (size.getHeight() > 0 && size.getWidth() > 0)) {
                        if (element.getAttribute("hidden") != null && (element.getAttribute("hidden").equalsIgnoreCase("true") || element.getAttribute("type").equals("hidden"))) {
                            return false;
                        }
                        return true;
                    } else {
                        return false;
                    }
                } catch (WebDriverException | ClassCastException | NullPointerException sere) {
                    throw sere;
                }
            }

            @Override
            public String toString() {
                return String.format("element ('%s') to be visible", by.toString());
            }
        };
    }

    public static ExpectedCondition<Boolean> elementToBeHidden(final By by) {
        return new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                try {
                    WebElement element = DriverManager.getDriver().getWebDriver().findElement(by);
                    if (element.getAttribute("hidden") != null && (element.getAttribute("hidden").equalsIgnoreCase("true") || element.getAttribute("type").equals("hidden"))) {
                        return true;
                    }

                    Point location = element.getLocation();
                    Dimension size = element.getSize();

                    if ((location.getX() <= 0 && location.getY() <= 0) || (size.getHeight() <= 0 && size.getWidth() <= 0)) {
                        return true;
                    }

                } catch (WebDriverException | ClassCastException | NullPointerException e) {
                    return false;
                }
                return false;
            }

            @Override
            public String toString() {
                return String.format("element ('%s') to be visible", by.toString());
            }
        };
    }

    public static ExpectedCondition<Boolean> elementToFoundInFrame(final By by) {
        return new ExpectedCondition<Boolean>() {
            private int level = 0;
            private Map<Integer, WebElement> frameMap = new HashMap<>();

            @Override
            public Boolean apply(WebDriver driver) {
                WebDriverWait wait = new WebDriverWait(driver, 0);

                // try to find element in current frame
                try {
                    wait.until(ExpectedConditions.elementToBeClickable(by));
                    return true;
                } catch (Exception throwAway) {
                    // Element not found in current frame
                }

                // Switch to main default frame
                driver.switchTo().defaultContent();

                try {
                    wait.until(ExpectedConditions.elementToBeClickable(by));
                    return true;
                } catch (Exception throwAway) {
                    // Element not found in default frame
                }

                return crawl(driver, by);
            }

            @Override
            public String toString() {
                return String.format("element with by ('%s') to be found in a frame", by.toString());
            }

            private boolean crawl(WebDriver driver, By by) {
                level++;
                List<WebElement> frameList = DriverManager.getDriver().getWebDriver().findElements(By.xpath("//iframe"));
                if (frameList.isEmpty()) {
                    frameList = DriverManager.getDriver().getWebDriver().findElements(By.xpath("//frame"));
                }

                for (WebElement frame : frameList) {
                    frameMap.put(level, frame);
                    driver.switchTo().defaultContent();

                    for (int i = 1; i <= level; i++) {
                        driver.switchTo().frame(frameMap.get(i));
                    }

                    WebDriverWait wait = new WebDriverWait(driver, 0);
                    try {
                        wait.until(ExpectedConditions.elementToBeClickable(by));
                        return true;
                    } catch (WebDriverException throwAway) {
                    }

                    if (crawl(driver, by)) {
                        return true;
                    }

                    driver.switchTo().defaultContent();
                    level--;
                    frameMap.remove(level);
                }

                return false;
            }
        };
    }
}