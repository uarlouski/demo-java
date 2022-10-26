package com.saucelabs.selenium3.changes;

import com.saucelabs.saucebindings.junit5.SauceBaseTest;
import com.saucelabs.saucebindings.options.SauceOptions;

import org.junit.jupiter.api.Test;
public class FindByTest extends SauceBaseTest {

    @Override
    public SauceOptions createSauceOptions() {
        SauceOptions sauceOptions = SauceOptions.chrome().build();

        sauceOptions.setCapability("capturePerformance", true);
        sauceOptions.setCapability("extendedDebugging", true);
        sauceOptions.setCapability("recordVideo", true);

        return sauceOptions;
    }

    @Test
    public void findElementBy() {

        driver.navigate().to(System.getenv("APP_URL_WITH_BASIC"));
        driver.navigate().to(System.getenv("APP_URL"));

        System.out.println(driver.getTitle());
    }
}
