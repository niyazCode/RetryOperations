package retryDifferentBrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    int counter = 0;
    int retryLimit = 1;

    RemoteWebDriver driver=null;


    @Override
    public boolean retry(ITestResult iTestResult) {
        if (counter < retryLimit) {
            counter++;
            return true;
        }
        return false;

    }

    /*RemoteWebDriver getDriver(BrowserTypes browserName) {
        if (driver==null && browserName.toString()=="CHROME") {
             driver = new ChromeDriver();
             return driver;
        }
           else if(driver!=null && browserName.toString()=="CHROME"){
            driver = new FirefoxDriver();
            return driver;
        }
           else if(driver==null && browserName.toString()=="FIREFOX")
        {
            driver = new FirefoxDriver();
            return driver;
        }
           else if(driver!=null && browserName.toString()=="FIREFOX"){
            driver = new ChromeDriver();
            return driver;

        }
           else return null;
    }*/
}
