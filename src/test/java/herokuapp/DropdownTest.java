package herokuapp;

import org.junit.jupiter.api.Test;
import pages.DropdownPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static pages.Commons.BASE_URL;

public class DropdownTest {
    DropdownPage dropdownPage;

    @Test
    public void dropdownTest(){
        String option = "Option 1";
        dropdownPage = open(BASE_URL + "/dropdown", DropdownPage.class);
        dropdownPage.selectDropdownOption(option);
        dropdownPage.getSelectedOption().shouldHave(text(option));
    }
}
