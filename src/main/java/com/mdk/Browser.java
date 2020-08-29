package com.mdk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
    private WebDriver driver;

    /* Default Chrome instance will be created */
    Browser() throws Exception {
        this("Chrome");
    }

    Browser(String browser) throws Exception {
        switch (browser) {
            case "Chrome":
                System.setProperty("webdriver.chrome.driver",
                        "C:\\Users\\mdkamat\\Downloads\\chromedriver_win32\\chromedriver.exe");
                this.driver = new ChromeDriver();
                break;
            case "Firefox":
                System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
                this.driver = new FirefoxDriver();
                break;
            default:
                throw new Exception("Browser not handled.");
        }
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    private WebDriver get(String url) {
        this.driver.get(url);
        return driver;
    }
}
