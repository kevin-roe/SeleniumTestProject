package org.kevinroe;

import org.kevinroe.sdk.drivers.Driver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class TestHelper {
    Driver driver;

    @BeforeTest
    public void before() {
        driver = new Driver("chrome");
    }

    @AfterTest
    public void after() {
        driver.quit();
    }
}
