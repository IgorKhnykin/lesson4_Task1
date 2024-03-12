import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class ModalForCheckingSubmittedForm {
    public void checkName(String name) {
        $x("//td[text()=\"Student Name\"]").parent().shouldHave(text(name));
    }

    public void checkEmail(String email) {
        $x("//td[text()=\"Student Email\"]").parent().shouldHave(text(email));
    }

    public void checkGender(String gender) {
        $x("//td[text()=\"Gender\"]").parent().shouldHave(text(gender));
    }

    public void checkMobile(String mobile) {
        $x("//td[text()=\"Mobile\"]").parent().shouldHave(text(mobile));
    }

    public void checkDateOfBirth(String dateOfBirth) {
        $x("//td[text()=\"Date of Birth\"]").parent().shouldHave(text(dateOfBirth));
    }

    public void checkSubject(String subject) {
        $x("//td[text()=\"Subjects\"]").parent().shouldHave(text(subject));
    }

    public void checkHobbies(String hobbies) {
        $x("//td[text()=\"Hobbies\"]").parent().shouldHave(text(hobbies));
    }

    public void checkPictureName(String pictureName) {
        $x("//td[text()=\"Picture\"]").parent().shouldHave(text(pictureName));
    }

    public void checkAddress(String address) {
        $x("//td[text()=\"Address\"]").parent().shouldHave(text(address));
    }

    public void checkStateAndCity(String stateAndCity) {
        $x("//td[text()=\"State and City\"]").parent().shouldHave(text(stateAndCity));
    }

}





