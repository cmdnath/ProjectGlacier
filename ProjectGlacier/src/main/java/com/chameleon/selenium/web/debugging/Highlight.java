package com.chameleon.selenium.web.debugging;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import com.chameleon.selenium.DriverManager;
import com.chameleon.selenium.elements.Element;
import com.chameleon.selenium.web.ExtendedWebDriver;
import com.chameleon.utils.Sleeper;

public class Highlight {

    private static Colors defaultHighlightColor = Colors.RED;
    private static Colors defaultErrorColor = Colors.RED;
    private static Colors defaultDebugColor = Colors.YELLOW;
    private static Colors defaultSuccessColor = Colors.GREEN;

    private static boolean debugMode = false;

    private static String jsHighlight = "arguments[0].style.border='3px solid <COLOR>'";
    private static String jsClearHighlight = "arguments[0].style.border='0px'";

    public static void setHighlightColor(Colors color) {
        defaultHighlightColor = color;
    }

    public static void setDebugColor(Colors color) {
        defaultDebugColor = color;
    }

    public static void setErrorColor(Colors color) {
        defaultErrorColor = color;
    }

    public static void setDebugMode(boolean mode) {
        debugMode = mode;
    }

    public static boolean getDebugMode() {
        return debugMode;
    }

    public static void highlight(By element) {
        highlight(DriverManager.getDriver().findElement(element));
    }

    public static void highlight(Element element) {
        highlight(DriverManager.getWebDriver(), element, jsHighlight, defaultHighlightColor);
    }

    public static void highlight(WebDriver driver, WebElement element) {
        highlight(driver, element, jsHighlight, defaultHighlightColor);
    }

    public static void highlightError(WebDriver driver, WebElement element) {
        highlight(driver, element, jsHighlight, defaultErrorColor);
    }

    public static void highlightSuccess(WebDriver driver, WebElement element) {
        highlight(driver, element, jsHighlight, defaultSuccessColor);
    }

    public static void flashHighlightSuccess(WebDriver driver, WebElement element) {
        highlight(driver, element, jsHighlight, defaultSuccessColor);
        Sleeper.sleep(.5);
        highlight(driver, element, jsHighlight, Colors.NONE);
    }

    public static void highlightDebug(WebDriver driver, WebElement element) {
        highlight(driver, element, jsHighlight, defaultDebugColor);
    }

    public static void clearHighlight(WebDriver driver, WebElement element) {
        highlight(driver, element, jsClearHighlight, Colors.NONE);
    }

    private static void highlight(WebDriver driver, WebElement element, String js, Colors color) {
        if (color != Colors.NONE) {
            js = js.replace("<COLOR>", color.toString());
        }

        if (DriverManager.isWebBrowserDriver()) {
            try {
                if (driver instanceof ExtendedWebDriver) {
                    ((ExtendedWebDriver) driver).executeJavaScript(js, element);
                } else {
                    ((JavascriptExecutor) driver).executeScript(js, element);
                }
            } catch (WebDriverException throwAway) {
            }
        }
    }

}
