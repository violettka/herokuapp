package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class JQueryPage extends Page{

    public JQueryPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//a[@id='ui-id-2']/span")
    private WebElement backToJQueryUI;

    @FindBy(how = How.ID, using = "ui-id-5")
    private WebElement menu;

    private static final String JQERY_URL = BASE_URL + "/jqueryui/menu";

    public void goToJQueryPage() {
        driver.get(JQERY_URL);
    }

    public JQueryMenuPage clickOnJQueryMenu(){
       backToJQueryUI.click();
       menu.click();
       return new JQueryMenuPage(driver);
    }
}
