package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class DropdownPage {

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
