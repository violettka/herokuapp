package herokuapp;

import org.junit.jupiter.api.Test;
import pages.EmailSentPage;
import pages.ResetPasswordPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static pages.Commons.BASE_URL;

public class ForgotPassword {

    @Test
    public void resetPasswordPositive() {
        ResetPasswordPage resPwdPage = open(BASE_URL + "/forgot_password", ResetPasswordPage.class);
        EmailSentPage sentPage = resPwdPage.inputEmail("test@test.com");
        sentPage.confirmationText().shouldHave(text("Your e-mail's been sent!\n"));
    }
}
