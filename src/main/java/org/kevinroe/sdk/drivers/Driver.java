package org.kevinroe.sdk.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Objects;

public class Driver {
    public String browser;
    public WebDriver webdriver;
    public WebDriverWait wait;

    public Driver(String browser) {
        this.browser = browser;
    }

    public WebDriver webdriver() {
        if (webdriver == null) {
            this.webdriver = startWebdriver();
            this.wait = new WebDriverWait(this.webdriver,Duration.ofSeconds(10));
        }

        return webdriver;
    }

    public WebDriver startWebdriver() {
        if (Objects.equals(this.browser, "firefox")) {
            return new FirefoxDriver();
        }
        else {
            return new ChromeDriver();
        }
    }

    public void quit() {
        webdriver.quit();
    }

    public void sleep(int seconds) throws InterruptedException {
        Thread.sleep(seconds * 100L);
    }

    public void navigateTo(String url) {
        webdriver().get(url);
    }

    public void setText(Locator locator, String text) {
        webdriver().findElement(locator.by).sendKeys(text);
    }

    public void click(Locator locator) {
        webdriver().findElement(locator.by).click();
    }
}