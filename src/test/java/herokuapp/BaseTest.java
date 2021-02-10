package herokuapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.JQueryMenuPage;
import pages.JQueryPage;
import pages.HoversPage;

public class BaseTest {

    private ChromeDriver driver;
    HoversPage hoversPage;
    JQueryPage jQueryPage;
    JQueryMenuPage jQueryMenuPage;

    @BeforeEach
    public void initPageObjects() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        initPages();

    }

    private void initPages() {
        hoversPage = new HoversPage(driver);
        jQueryPage = new JQueryPage(driver);
        jQueryMenuPage = new JQueryMenuPage(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.close();
        driver.quit();
    }

}
