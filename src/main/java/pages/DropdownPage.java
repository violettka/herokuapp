package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static pages.Commons.BASE_URL;

public class DropdownPage {

    public static final String DROPDOWN_BASE_URL = BASE_URL + "/dropdown";

    @FindBy(id = "dropdown")
    private SelenideElement dropdown;

    @FindBy(xpath = "//option[@selected=\'selected\']")
    private SelenideElement selectedOption;

    public void selectDropdownOption(String option){
        dropdown.selectOption(option);
    }

    public SelenideElement getSelectedOption(){
        return selectedOption;
    }
}
