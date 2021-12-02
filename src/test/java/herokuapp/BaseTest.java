package herokuapp;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {

    @Parameters("browser")
    @BeforeTest
    public void setupBrowser(String browser){
        System.setProperty("selenide.browser", browser);
        Configuration.browser = browser;
    }

    @AfterTest
    public void closeBrowser(){
         //getWebDriver().close();
    }
}
