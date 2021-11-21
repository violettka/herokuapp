package herokuapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HoversPage;
import pages.LoginPage;
import pages.SecureAreaPage;
import static org.junit.jupiter.api.Assertions.*;

public class BaseTest {

    HoversPage hoversPage;
    LoginPage loginPage;
    SecureAreaPage secureAreaPage;
    private ChromeDriver driver;

    @BeforeEach
    public void initPageObjects() {
        // brew install chromedriver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        driver = new ChromeDriver();
        hoversPage = new HoversPage(driver);
        loginPage = new LoginPage(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
