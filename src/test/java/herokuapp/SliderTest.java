package herokuapp;


import org.testng.annotations.Test;
import pages.SliderPage;

import static pages.Commons.BASE_URL;
import static com.codeborne.selenide.Selenide.open;

public class SliderTest extends BaseTest {

    @Test
    public void testSlider() {
        SliderPage sliderPage = open( BASE_URL + "/horizontal_slider", SliderPage.class);
        sliderPage.moveSlider("2");
    }
}
