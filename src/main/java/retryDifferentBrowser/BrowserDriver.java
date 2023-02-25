package retryDifferentBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public interface BrowserDriver {

    RemoteWebDriver launchDriver();
}
