package herokuapp;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

import static org.openqa.selenium.remote.DesiredCapabilities.*;

public class BaseTest {

    @BeforeTest
    public void setupGrid() throws MalformedURLException {
        System.setProperty("selenide.remote", "http://192.168.178.38:4444/wd/hub");
        Configuration.browser = "safari";
    }
}
