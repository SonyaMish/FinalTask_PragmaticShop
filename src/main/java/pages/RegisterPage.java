package pages;

import org.openqa.selenium.By;

public class RegisterPage extends BasePage{
    private static final By FIRST_NAME_INPUT_FIELD = By.id("input-firstname");
    private static final By LAST_NAME_INPUT_FIELD = By.id("input-lastname");
    private static final By EMAIL_INPUT_FIELD = By.id("input-email");
    private static final By TELEPHONE_INPUT_FIELD = By.id("input-telephone");
    private static final By PASSWORD_INPUT_FIELD = By.id("input-password");
    private static final By PASSWORD_CONFIRMATION_INPUT_FIELD = By.id("input-confirm");
    private static final By CHECKBOX = By.xpath("//input[@type='checkbox' and @name='agree']");
    private static final By CONTINUE_BUTTON = By.className("btn-primary");

    public static void writeTextInFirstName(String text){
        writeTextInWebElement(FIRST_NAME_INPUT_FIELD, text);
    }

    public static void writeTextInLastName(String text){
        writeTextInWebElement(LAST_NAME_INPUT_FIELD, text);
    }

    public static void writeTextInEmail(String text){
        writeTextInWebElement(EMAIL_INPUT_FIELD, text);
    }

    public static void writeTextInTelephone(String text){
        writeTextInWebElement(TELEPHONE_INPUT_FIELD, text);
    }

    public static void writeTextInPassword(String text){
        writeTextInWebElement(PASSWORD_INPUT_FIELD, text);
    }

    public static void writeTextInPasswordConfirmation(String text){
        writeTextInWebElement(PASSWORD_CONFIRMATION_INPUT_FIELD, text);
    }

    public static void checkPrivacyPolicyCheckbox(){
        if (!isCheckboxSelected(CHECKBOX)) {
            clickOnWebElementByLocator(CHECKBOX);
        }
    }

    public static void clickOnContinueButton() {
        driver.findElement(CONTINUE_BUTTON).click();
    }
}