import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Selenide;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;

public class TestPage extends BasePage{
    private final static String baseUrl = "https://demoqa.com/automation-practice-form";

    @Test
    public void FillForm() {

        open(baseUrl);
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        new PracticeForm().fillNameAndEmail()
                .fillGenderAndMobile().
                fillDateOfBirth()
                .fillSubjectAndHobbies()
                .uploadFile()
                .fillCurrentAddressAndState()
                .testForCheckingData();

    }

}
