package pages.quandoo;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {

    @FindBy(xpath = "//button[@data-qa='filter-button-top-rated']")
    private SelenideElement topRatedBtn;

    @FindBy(id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    private SelenideElement okBtn;

    @FindBy(xpath = "//span[contains(.,'Review score: 4-6')]")
    private SelenideElement topRatedFilter;

    public void clickTopRatedBtn() {
        topRatedBtn.click();
    }

    public SelenideElement topRatedBtnAttribute() {
        return topRatedBtn;
    }

    public void acceptCookies() {
        okBtn.click();

    }

    public SelenideElement topRatedFilter() {
        return topRatedFilter;
    }
}
