package com.chameleon.utils;

import java.io.File;
import java.util.logging.Level;

public class Constants {

    /*
     * File system info
     */
    public static final String DIR_SEPARATOR = File.separator;
    public static final String CURRENT_DIR = determineCurrentPath();

    /*
     * Selenium Constants
     */
    public static final String DRIVERS_PATH_LOCAL = "drivers" + DIR_SEPARATOR;
    public static final String SCREENSHOT_FOLDER = CURRENT_DIR + "selenium-reports" + DIR_SEPARATOR + "html" + DIR_SEPARATOR + "screenshots";
    public static final int DEFAULT_GLOBAL_DRIVER_TIMEOUT = 10;
    public static final int ELEMENT_TIMEOUT = 3;
    public static final int PAGE_TIMEOUT = 10;
    public static final long MILLISECONDS_TO_POLL_FOR_ELEMENT = 250L;
    public static final int MAX_SLEEP_TIME = 600;

    /*
     * Test constants
     */
    public static final String ENVIRONMENT_URL_PATH = "EnvironmentURLs";
    public static final String ENVIRONMENT_URL_PROPERTIES = "EnvironmentURLs.properties";
    public static final String USER_CREDENTIALS_PATH = "UserCredentials";
    public static final String SANDBOX_PATH = DIR_SEPARATOR + "sandbox" + DIR_SEPARATOR;
    public static final String TNSNAMES_PATH = DIR_SEPARATOR + "database" + DIR_SEPARATOR;
    public static final String TESTNG_PARAM_RUN_LOCATION = "local";
    public static final String TESTNG_PARAM_BROWSER = "CHROME";
    //public static final String TESTNG_PARAM_BROWSER = "FIREFOX";
    //public static final String TESTNG_PARAM_BROWSER = "INTERNETEXPLORER";
    //public static final String TESTNG_PARAM_BROWSER = "SAFARI";
    //public static final String TESTNG_PARAM_BROWSER = "IOS_WEB";
    //public static final String TESTNG_PARAM_BROWSER = "ANDROID_WEB";
    public static final String TESTNG_PARAM_ENVIRONMENT = "qa";
    public static final int TEST_REPORTER_DEFAULT_LEVEL = TestReporter.INFO;
    public static final boolean TEST_REPORTER_DEFAULT_CONSOLE_PRINT = true;

    /*
     * Default Browser Console logging level to report in TestReporter.logConsoleLogging
     */
    public static final Level DEFAULT_BROWSER_LOGGING_LEVEL = Level.SEVERE;

    /**
     * Defaults to "./" if there's an exception of any sort.
     *
     * @warning Exceptions are swallowed.
     * @return Constants.DIR_SEPARATOR
     */
    private static final String determineCurrentPath() {
        try {
            return (new File(".").getCanonicalPath()) + Constants.DIR_SEPARATOR;
        } catch (Exception ex) {
        }
        return "." + Constants.DIR_SEPARATOR;
    }

}
