package quandoo;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.quandoo.SearchPage;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.open;

public class QuandooTest {
    SearchPage page;

    @BeforeEach
    public void acceptCookies() {
        page = open("https://www.quandoo.de/en/berlin", SearchPage.class);
        page.acceptCookies();

    }

    @Test
    public void topRatedButton() {
        page.clickTopRatedBtn();
        page.topRatedBtnAttribute().shouldHave(attribute("data-state", "active"));
        page.topRatedFilter().should(exist);
    }


}
