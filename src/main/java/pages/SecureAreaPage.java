package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage extends Page{
    public SecureAreaPage(WebDriver driver) { super(driver); }

    // Page Locators
    private static final By successfulLoginMessage = By.id("flash");

    // Page Methods

    // Get Successful Login Confirmation Message Text
    public String getLoginConfirmationMessage(){
       String message = driver.findElement(successfulLoginMessage).getText();
        return message.split("\n")[0];
    }
}
