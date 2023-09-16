import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.DragAndDropOptions.to;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DragnDropTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1300x900";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void dragnDropTest() {

        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").$("header").shouldHave(text("A"));
        $("#column-a").dragAndDrop(to("#column-b"));
        $("#column-a").$("header").shouldHave(text("B"));
    }
}
