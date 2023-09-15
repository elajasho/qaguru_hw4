import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SearchSelenideTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen = false;
        Configuration.browserSize = "1300x1200";
        Configuration.pageLoadStrategy = "eager";
        Configuration.baseUrl = "https://github.com";
    }

    @Test
    void mainTest() {
        open("/selenide/selenide");

        $("#wiki-tab").click();

        $("#wiki-pages-filter").setValue("SoftAssertions");

        $(byText("Soft assertions")).shouldHave(text("Soft assertions"));

        open("/selenide/selenide/wiki/SoftAssertions");

        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));

    }
}
