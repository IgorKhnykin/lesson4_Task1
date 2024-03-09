
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class Lesson6_selende1 extends BasePage {
    @Test
    public void autoTest() {
        //    - Откройте страницу Selenide в Github
        open("https://github.com/selenide/selenide");



        // - Перейдите в раздел Wiki проекта
        $x("//a[@id=\"wiki-tab\"]").click();
        // - Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $x("//li[@class=\"Box-row wiki-more-pages-link\"]/button").click();
        $x("//div[@class=\"Box Box--condensed color-shadow-small\"]").shouldHave(text("SoftAssertions"));
        // - Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
        $x("//span/a[@href=\"/selenide/selenide/wiki/SoftAssertions\"]").click();
        $x("//div[@class=\"Layout-main\"]").shouldHave(text("Using JUnit5 extend test "));
        sleep(5000);
    }

}
