package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class JQueryMenuPage extends Page {

    public JQueryMenuPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.LINK_TEXT, using = "Menu")
    @CacheLookup
    private WebElement menuText;

    public boolean isMenuVisible() {
        return menuText.isDisplayed();
    }
}
