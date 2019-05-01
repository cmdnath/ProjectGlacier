package com.chameleon.selenium;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.safari.SafariOptions;

import com.chameleon.selenium.windows.driverManager.WindowsOptions;

public class DriverOptionsManager {
    private ChromeOptions chromeOptions = null;
    private EdgeOptions edgeOptions = null;
    private FirefoxOptions firefoxOptions = null;
    private FirefoxProfile firefoxProfile = null;
    private InternetExplorerOptions internetExplorerOptions = null;
    private SafariOptions safariOptions = null;
    private WindowsOptions windowsOptions = null;
    private MutableCapabilities baseOptions = null;

    public DriverOptionsManager() {
        chromeOptions = new ChromeOptions();
        edgeOptions = new EdgeOptions();
        firefoxOptions = new FirefoxOptions();
        internetExplorerOptions = new InternetExplorerOptions();
        safariOptions = new SafariOptions();
        windowsOptions = new WindowsOptions();
        baseOptions = new MutableCapabilities();
    }

    public ChromeOptions getChromeOptions() {
        return chromeOptions;
    }

    public EdgeOptions getEdgeOptions() {
        return edgeOptions;
    }

    public FirefoxOptions getFirefoxOptions() {
        return firefoxOptions;
    }

    public InternetExplorerOptions getInternetExplorerOptions() {
        return internetExplorerOptions;
    }

    public SafariOptions getSafariOptions() {
        return safariOptions;
    }

    public WindowsOptions getWindowsOptions() {
        return windowsOptions;
    }

    public MutableCapabilities getIOSOptions() {
        return baseOptions;
    }

    public MutableCapabilities getAndroidOptions() {
        return baseOptions;
    }

    public void setBrowserVersion(DriverType driverType, String version) {
        setCapability(driverType, CapabilityType.VERSION, version);
    }

    public void setPlatform(DriverType driverType, String platform) {
        setCapability(driverType, CapabilityType.PLATFORM_NAME, Platform.fromString(platform).toString());
    }

    public void setCapability(DriverType driverType, String capabilityName, String capabilityValue) {
        switch (driverType) {
            case CHROME:
                chromeOptions.setCapability(capabilityName, capabilityValue);
                break;

            case EDGE:
                edgeOptions.setCapability(capabilityName, capabilityValue);
                break;

            case FIREFOX:
                firefoxOptions.setCapability(capabilityName, capabilityValue);
                break;

            case INTERNETEXPLORER:
                internetExplorerOptions.setCapability(capabilityName, capabilityValue);
                break;

            case SAFARI:
                safariOptions.setCapability(capabilityName, capabilityValue);
                break;

            case WINDOWS:
                windowsOptions.setCapability(capabilityName, capabilityValue);
                break;

            default:
                break;
        }
    }
}
