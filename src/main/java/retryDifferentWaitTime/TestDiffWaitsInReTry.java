package retryDifferentWaitTime;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import retryDifferentBrowser.BrowserConfig;
import retryDifferentBrowser.BrowserTypes;
import OwnerProperty.PropertyConfig;
import retryDifferentBrowser.RetryAnalyzer;

import java.util.concurrent.TimeUnit;

public class TestDiffWaitsInReTry extends retryDifferentWaitTime.RetryAnalyzer {



    RemoteWebDriver driver;




    @Test(retryAnalyzer = retryDifferentWaitTime.RetryAnalyzer.class)
    public void checkBrowserLaunch(){
       // System.out.println(con.MAX_WAIT());
        driver = new ChromeDriver();
        setWait(driver);
        driver.get("https://leafground.com/waits.xhtml;jsessionid=node0n1apapq344zk3r2260raxnxf123329.node0");
        driver.findElement(By.xpath("//button[contains(@class,'ui-button-secondary mr-2 mb-2')]")).click();


        driver.findElement(By.id("abc123")).click();

    }
}
