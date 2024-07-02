package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Browser;

public class BasePage {
    protected static WebDriver driver;

    static {
        driver = Browser.getDriver();
    }

    public static void clickOnWebElementByLocator(By locator) {
        driver.findElement(locator).click();
    }

    public static void writeTextInWebElement(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }

    public static boolean isCheckboxSelected(By locator){
        return driver.findElement(locator).isSelected();
    }
}