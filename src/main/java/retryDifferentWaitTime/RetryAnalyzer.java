package retryDifferentWaitTime;

import OwnerProperty.PropertyConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import java.util.concurrent.TimeUnit;

public class RetryAnalyzer implements IRetryAnalyzer {

    int counter = 0;


    int retryLimit = 2;
    int retryVal=0;


    //RemoteWebDriver driver = null;
    PropertyConfig con = ConfigFactory.create(PropertyConfig.class);

    Long wait = con.MIN_WAIT();




    @Override
    public boolean retry(ITestResult iTestResult) {
        if (counter < retryLimit) {
            counter++;

            return true;
        }
        return false;
    }

    public void setWait(RemoteWebDriver driver)
    {
        retryVal++;
        if(retryVal==1)
        driver.manage().timeouts().implicitlyWait(con.MIN_WAIT(), TimeUnit.SECONDS);
        else
        if(retryVal==2)
        {
            driver.manage().timeouts().implicitlyWait(con.MEDIUM_WAIT(), TimeUnit.SECONDS);
        }
        else if(retryVal==3) {
            driver.manage().timeouts().implicitlyWait(con.MAX_WAIT(), TimeUnit.SECONDS);
        }



    }
}


