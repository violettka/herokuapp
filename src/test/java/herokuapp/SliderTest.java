package herokuapp;

import org.junit.jupiter.api.Test;
import pages.SliderPage;

import static pages.Commons.BASE_URL;
import static com.codeborne.selenide.Selenide.open;

public class SliderTest {

    @Test
    public void testSlider() {
        SliderPage sliderPage = open( BASE_URL + "/horizontal_slider", SliderPage.class);
        sliderPage.moveSlider("2");
    }
}
