import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class ModalForCheckingSubmittedForm {

    public void verifyField(String key, String value) {
        $x("//td[text()=" + "\"" +  key + "\"" + "]").parent().shouldHave(text(value));
    }

}





