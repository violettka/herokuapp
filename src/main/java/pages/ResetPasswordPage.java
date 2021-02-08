package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class ResetPasswordPage {

    private static final By EMAIL = By.id("email");
    private static final By SUBMIT = By.id("form_submit");

    public EmailSentPage inputEmail(String email) {
        $(EMAIL).setValue(email);
        $(SUBMIT).click();
        return page(EmailSentPage.class);
    }
}
