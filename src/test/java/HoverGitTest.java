import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HoverGitTest {

    @Test
    void hoverGitTest() {
        open("https://github.com/");
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();

        $(".font-mktg").shouldHave(Condition.text("Build like the best"));

    }

}
