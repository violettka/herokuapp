package herokuapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class JQueryUITest extends BaseTest {

    @Test
    public void clickOnJQuery(){
        jQueryPage.goToJQueryPage();
        jQueryPage.clickOnJQueryMenu();
        assertTrue(jQueryMenuPage.isMenuVisible());
    }
}
