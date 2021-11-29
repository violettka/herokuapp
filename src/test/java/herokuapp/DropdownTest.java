package herokuapp;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pages.DropdownPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static pages.DropdownPage.DROPDOWN_BASE_URL;

public class DropdownTest {
    DropdownPage dropdownPage;

    @Test
    public void dropdownTest(){
        String option = "Option 1";
        dropdownPage = open(DROPDOWN_BASE_URL, DropdownPage.class);
        dropdownPage.selectDropdownOption(option);
        dropdownPage.getSelectedOption().shouldHave(text(option));
    }
}
