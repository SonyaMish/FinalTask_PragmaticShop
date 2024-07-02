package pages;

import org.openqa.selenium.By;
import utils.WaitTool;

public class SuccessRegisterPage extends BasePage{
    private static final By CONFIRMATION_MESSAGE = By.cssSelector("#content > h1");

    public static String getConfirmationMessageText() {
        WaitTool.waitForElementVisibility(CONFIRMATION_MESSAGE, 10);
        return driver.findElement(CONFIRMATION_MESSAGE).getText();
    }
}