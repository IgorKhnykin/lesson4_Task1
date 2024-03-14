import org.junit.jupiter.api.Test;
public class TestPage extends BasePage{
    PracticeForm practiceForm = new PracticeForm();
    GenerateRandom generateRandom;


    @Test
    public void test() {
        practiceForm.openPage().fillDateOfBirth("2000", "February", "22");
    }
    @Test
    public void FillForm() {
        practiceForm.openPage()
                .fillNameAndEmail("GenerateRandom.fakeFirstName", GenerateRandom.fakeLastName, GenerateRandom.fakeEmail)
                .fillGenderAndMobile(GenerateRandom.fakeNumber)
                .fillDateOfBirth("2000", "February", "22")
                .fillSubjectAndHobbies(GenerateRandom.fakeSubject)
                .uploadFile("1.png")
                .fillCurrentAddressAndState(GenerateRandom.fakeCurrentAddress, "NCR", "Delhi")

                .verifyModal("Student Name", GenerateRandom.fakeFirstName + " " + GenerateRandom.fakeLastName)
                .verifyModal("Student Email", GenerateRandom.fakeEmail)
                .verifyModal("Gender", "Male")
                .verifyModal("Mobile", GenerateRandom.fakeNumber)
                .verifyModal("Date of Birth", "22 February,2000")
                .verifyModal("Subjects", GenerateRandom.fakeSubject)
                .verifyModal("Hobbies", "Sports, Reading, Music")
                .verifyModal("Picture", "1.png")
                .verifyModal("Address", GenerateRandom.fakeCurrentAddress)
                .verifyModal("State and City", "NCR Delhi");

    }

}
