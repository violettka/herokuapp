package herokuapp.steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.SecureAreaPage;
import utils.PropertiesLoader;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static pages.LoginPage.successfulLoginMessage;


public class LoginSteps {
    public LoginPage loginPage;
    public SecureAreaPage secureAreaPage;
    public ChromeDriver driver;

    @Before
    public void setupDriver() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
    }

    @Given("I am on the Login page")
    public void openLoginPage() {
        loginPage.goToLoginPage();
    }

    @When("I login with {} credentials")
    public void loginWithCredentials(String credentials) {
        loginPage.insertCredentials(credentials);
    }

    @When("I click Login button")
    public void clickLoginButton() {
        secureAreaPage = loginPage.clickLogin();
    }

    @Then("I observe the {} login message")
    public void verifyMessage(String message) {
        String pageMessage = null;
        String expectedMessage = null;

        if (message.equals("successful")) {
            pageMessage = secureAreaPage.getLoginConfirmationMessage();
            expectedMessage = successfulLoginMessage;
        } else {
            pageMessage = loginPage.getValidationMessageText();
            expectedMessage = PropertiesLoader.loadProperty(message);
        }
        assertEquals(expectedMessage, pageMessage);
    }

    @After
    public void closeBrowser(Scenario scenario) {
        driver.quit();
    }

}
