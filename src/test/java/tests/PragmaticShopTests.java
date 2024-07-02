package tests;

import components.Header;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegisterPage;
import pages.ShopPragmaticPage;
import pages.SuccessRegisterPage;


public class PragmaticShopTests extends BaseTest{
    @Test
    public void testSuccessfulRegistration() {
        ShopPragmaticPage.goToShopPragmaticPage();
        Header.clickOnMyAccount();
        Header.clickOnRegisterButton();

        RegisterPage.writeTextInFirstName("Sonya");
        RegisterPage.writeTextInLastName("Mishineva");
        RegisterPage.writeTextInEmail("skm@kls88993.com");
        RegisterPage.writeTextInTelephone("56789");
        RegisterPage.writeTextInPassword("skm@666");
        RegisterPage.writeTextInPasswordConfirmation("skm@666");
        RegisterPage.checkPrivacyPolicyCheckbox();
        RegisterPage.clickOnContinueButton();

        String actualConfirmationMessage = SuccessRegisterPage.getConfirmationMessageText();
        Assert.assertEquals(actualConfirmationMessage, "Your Account Has Been Created!");
    }
}