import static com.codeborne.selenide.Selenide.*;

public class PracticeForm {
    DateOfBirthForm dateOfBirthForm = new DateOfBirthForm();
    ModalForCheckingSubmittedForm modalForCheckingSubmittedForm = new ModalForCheckingSubmittedForm();
    private final static String baseUrl = "https://demoqa.com/automation-practice-form";

    public PracticeForm openPage() {
        open(baseUrl);
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;

    }
    public PracticeForm fillNameAndEmail(String name, String lastName, String email) {
        $x("//input[@placeholder=\"First Name\"]").setValue(name);
        $x("//input[@placeholder=\"Last Name\"]").setValue(lastName);
        $x("//input[@placeholder=\"name@example.com\"]").setValue(email);
        return this;
    }
    public PracticeForm fillGenderAndMobile(String phoneNumber) {
        $x("//label[@for=\"gender-radio-1\"]").click();
        $x("//input[@placeholder=\"Mobile Number\"]").setValue(phoneNumber);
        return this;
    }
    public PracticeForm fillDateOfBirth(String year, String month, String day) {
        $x("//input[@id=\"dateOfBirthInput\"]").click();
        dateOfBirthForm.dateOfBirth(year, month, day);
        return this;
    }
    public PracticeForm fillSubjectAndHobbies(String subjectName) {
        $x("//input[@id=\"subjectsInput\"]").setValue(subjectName).pressEnter();
        $x("//label[@for=\"hobbies-checkbox-1\"]").click();
        $x("//label[@for=\"hobbies-checkbox-2\"]").click();
        $x("//label[@for=\"hobbies-checkbox-3\"]").click();
        return this;
    }
    public PracticeForm uploadFile(String fileNameAndExtension) {

        //$x("//input[@id=\"uploadPicture\"]").uploadFile(new File("src/test/resources/1.png"));
        $x("//input[@id=\"uploadPicture\"]").uploadFromClasspath(fileNameAndExtension);
        return this;
    }
    public PracticeForm fillCurrentAddressAndState(String address, String state, String city)  {

        $x("//textarea[@id=\"currentAddress\"]").setValue(address);
        $x("//input[@id=\"react-select-3-input\"]").setValue(state).pressEnter();
        $x("//input[@id=\"react-select-4-input\"]").setValue(city).pressEnter();
        $x("//button[@id=\"submit\"]").click();
        return this;
    }
    public PracticeForm verifyModal(String key, String value) {
        modalForCheckingSubmittedForm.verifyField(key, value);
        return this;
    }
 }
