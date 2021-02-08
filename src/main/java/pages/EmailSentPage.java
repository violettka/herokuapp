package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class EmailSentPage {

    private static final By TEXT = By.id("content");

    public SelenideElement confirmationText() {
        return $(TEXT);
    }
}
