package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

/**
 * Hovers Commons
 */
public class HoversPage {

    private static final By imgElement = By.tagName("img");
    private static final By textElement = By.tagName("h5");

    // hover over profile pics
    public void hoverOverProfilePics(int index) {
        $$(imgElement).get(index).hover();
    }

    public boolean isUsernamePresent(String username, int index) {
        String elementsText = $$(textElement).get(index).getText();
        return elementsText.contains(username);
    }
}
