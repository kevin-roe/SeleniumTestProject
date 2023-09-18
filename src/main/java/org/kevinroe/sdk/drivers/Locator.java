package org.kevinroe.sdk.drivers;

import org.openqa.selenium.By;

public class Locator {

    public By by;
    public String description;

    public Locator(By by, String description) {
        this.by = by;
        this.description = description;
    }

    public Locator(By by) {
        this.by = by;
    }

    public static Locator name(String name) {
        return new Locator(By.name(name));
    }

    public static Locator name(String name, String description) {
        return new Locator(By.name(name), description);
    }

    public static Locator dataTestId(String dataTestId) {
        return new Locator(By.xpath(String.format("//*[@data-testid='%s']", dataTestId)));
    }

    public static Locator dataTestId(String dataTestId, String description) {
        return new Locator(By.xpath(String.format("//*[@data-testid='%s']", dataTestId)), description);
    }

    public static Locator xpath(String xpath) {
        return new Locator(By.xpath(xpath));
    }

    public static Locator xpath(String xpath, String description) {
        return new Locator(By.xpath(xpath), description);
    }
}
