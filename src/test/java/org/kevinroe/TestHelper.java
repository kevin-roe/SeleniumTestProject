package org.kevinroe;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestHelper {
    Driver driver;

    @BeforeTest
    public void before() {
        driver = new Driver();
    }

    @AfterTest
    public void after() {
        driver.quit();
    }
}
