package retryDifferentBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestRetryDiffBrowser extends RetryAnalyzer{

RemoteWebDriver driver;

BrowserConfig config = new BrowserConfig();


@Test(retryAnalyzer = RetryAnalyzer.class)
    public void checkBrowserLaunch(){

        driver = config.getDriver(BrowserTypes.FIREFOX);
        driver.get("http://www.google.com");
        driver.findElement(By.id("abc123")).click();

    }



}
