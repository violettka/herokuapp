package herokuapp;

import org.junit.jupiter.api.Test;
import pages.HoversPage;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static pages.Commons.BASE_URL;

public class HoversTest {

    @Test
    public void testHoversOnImages() {
        //open Hovers Commons
        HoversPage hoversPage = open(BASE_URL + "/hovers", HoversPage.class);

        for (int i = 1; i < 4; i++) {
            // hover over each profile picture
            hoversPage.hoverOverProfilePics(i);
            // assertion
            assertTrue(hoversPage.isUsernamePresent("user" + i, i - 1),
                    "username user" + i + " is not displayed!");
        }
    }
}
