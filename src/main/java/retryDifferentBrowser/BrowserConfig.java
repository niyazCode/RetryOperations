package retryDifferentBrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserConfig {

    RemoteWebDriver driver=null;

    public RemoteWebDriver getDriver(BrowserTypes browserName) {
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
    }
}
