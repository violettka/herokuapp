package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.PropertiesLoader;

public class LoginPage extends Page{
    public LoginPage(WebDriver driver) { super(driver); }

    // Page URL
    private static final String LOGIN_URL = BASE_URL + "/login";

    // Page Locators
    private static final By usernameField = By.id("username");
    private static final By passwordField = By.id("password");
    private static final By loginButton = By.className("radius");
    private static final By validationMessage = By.id("flash");

    // Properties

    public static String existingUsername = PropertiesLoader.loadProperty("existing.username");
    public static String existingPassword = PropertiesLoader.loadProperty("existing.password");
    public static String successfulLoginMessage = PropertiesLoader.loadProperty("positive.login.message");

    // Page Methods

    // Open Login Page
    public void goToLoginPage() {
        driver.navigate().to(LOGIN_URL);
    }

    // Insert Credentials
    public void insertCredentials(String credentials){
        String usernameValue = null;
        String passwordValue = null;
        if (credentials.equals("existing")) {
           usernameValue = existingUsername;
           passwordValue = existingPassword;
        }
        if (credentials.equals("wrong.username")) {
            usernameValue = PropertiesLoader.loadProperty(credentials);
            passwordValue = existingPassword;
        }
        if (credentials.equals("wrong.password")) {
            usernameValue = existingUsername;
            passwordValue = PropertiesLoader.loadProperty(credentials);
        }
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
