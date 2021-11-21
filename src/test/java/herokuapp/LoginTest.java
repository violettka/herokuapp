package herokuapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest extends BaseTest {

    @Test
    public void positiveLogin() {
        // open Login page
        loginPage.goToLoginPage();
        // insert credentials
        loginPage.insertCredentials("tomsmith", "SuperSecretPassword!");
        // click on Login button and initiate Secure Area Page
        secureAreaPage = loginPage.clickLogin();
        // assert Secure Area Page is open
        String message = secureAreaPage.getLoginConfirmationMessage();
        // assert that messages are equal
        assertEquals("You logged into a secure area!", message);
    }

    @Test
    public void negativeLogin() {
        // open Login page
        loginPage.goToLoginPage();
        // insert credentials
        loginPage.insertCredentials("tomsmit", "SuperSecretPassword!");
        // click on Login button and initiate Secure Area Page
        loginPage.clickLogin();
        // assert Secure Area Page is open
        String message = loginPage.getValidationMessageText();
        // assert that messages are equal
        assertEquals("Your username is invalid!", message);
    }
}
