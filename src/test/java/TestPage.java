import org.junit.jupiter.api.Test;

public class TestPage extends BasePage{
    PracticeForm practiceForm = new PracticeForm();
    @Test
    public void FillForm() {
        practiceForm.openPage()
                .fillNameAndEmail("Igor", "Khnykin", "igor@mail.ru")
                .fillGenderAndMobile("1234567890")
                .fillDateOfBirth("2000", "February", "22")
                .fillSubjectAndHobbies("Math")
                .uploadFile("1.png")
                .fillCurrentAddressAndState("Voronejskaya", "NCR", "Delhi")
                .verifyModal("Student Name", "Igor Khnykin")
                .verifyModal("Student Email", "igor@mail.ru")
                .verifyModal("Gender", "Male")
                .verifyModal("Mobile", "1234567890")
                .verifyModal("Date of Birth", "22 February,2000")
                .verifyModal("Student Name", "Igor Khnykin");

    }

}
