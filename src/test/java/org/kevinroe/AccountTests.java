package org.kevinroe;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.kevinroe.pages.GooglePage;

@Test(groups = { "custom", "account" })
public class AccountTests extends TestHelper {
    GooglePage google = new GooglePage();

    @Test(description = "This is a test", groups = { "tc_account_01" })
    public void tc_account_01() throws InterruptedException {
        driver.navigateTo("https://www.google.com");
        driver.setText(google.searchBar, "foobar");
        driver.sleep(1);
    }
}