package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Page{
    public LoginPage(WebDriver driver) { super(driver); }

    // Page URL
    private static final String LOGIN_URL = BASE_URL + "/login";

    // Page Locators
    private static final By usernameField = By.id("username");
    private static final By passwordField = By.id("password");
    private static final By loginButton = By.className("radius");
    private static final By validationMessage = By.id("flash");

    // Page Methods

    // Open Login Page
    public void goToLoginPage() {
        driver.navigate().to(LOGIN_URL);
    }

    // Insert Credentials
    public void insertCredentials(String usernameValue, String passwordValue){
        driver.findElement(usernameField).sendKeys(usernameValue);
        driver.findElement(passwordField).sendKeys(passwordValue);
    }

    // Click on Login Button and move to Secure Area Page
    public SecureAreaPage clickLogin() {
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }

    // Get validation message text
    public String getValidationMessageText(){
        String message = driver.findElement(validationMessage).getText();
        return message.split("\n")[0];
    }

}
