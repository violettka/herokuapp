package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

/**
 * Hovers Page
 */
public class HoversPage extends Page {

    public HoversPage(WebDriver driver) {
        super(driver);
    }

    private static final String HOVER_URL = "http://the-internet.herokuapp.com/hovers";

    public void goToHoversPage() {
        driver.navigate().to(HOVER_URL);
    }

    public void hoverOverProfilePics(int index) {
        Actions builder = new Actions(driver);
        List<WebElement> hoverElements = driver.findElements(By.tagName("img"));
        builder.moveToElement(hoverElements.get(index)).click().perform();
    }

    public boolean isUsernamePresent(String username, int index) {
        List<WebElement> textElements = driver.findElements(By.tagName("h5"));
        String elementsText = textElements.get(index).getText();
        return elementsText.contains(username);
    }
}
