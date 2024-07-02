package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Browser;

public class Header {
    private static WebDriver driver;

    static {
        driver = Browser.getDriver();
    }

    private static final By MY_ACCOUNT = By.xpath("//div[@id='top-links']/ul/li[2]/a/span[1]");
    private static final By REGISTER_BUTTON = By.xpath("//div[@id='top-links']//ul[@class='dropdown-menu dropdown-menu-right']/li[1]/a");

    public static void clickOnMyAccount() {
        driver.findElement(MY_ACCOUNT).click();
    }

    public static void clickOnRegisterButton() {
        driver.findElement(REGISTER_BUTTON).click();
    }
}