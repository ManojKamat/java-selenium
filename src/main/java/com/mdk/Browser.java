import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    private WebDriver driver;

    public Browser() {
        Browser("Chrome");
    }

    public Browser(final String browser) {
        switch (browser) {
            case "Chrome":
                System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "Firefox":
                System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}
