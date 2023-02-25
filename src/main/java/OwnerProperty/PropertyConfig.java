package OwnerProperty;

import org.aeonbits.owner.Config;

@Config.Sources(value="file:C:/Users/MOHAMED NIYAZ/Desktop/Test Architect/Assignment_RetryWithDiffBrowserAndData/src/main/java/OwnerProperty/config.properties")

public interface PropertyConfig extends Config {

    String browser();
    Long MIN_WAIT();
    Long MEDIUM_WAIT();
    Long MAX_WAIT();


}
