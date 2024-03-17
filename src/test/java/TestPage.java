import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;


public class TestPage extends BasePage{
    PracticeForm practiceForm = new PracticeForm();
    GenerateRandom generateRandom;



    @ParameterizedTest
    @Tag("Change photos")
    @ValueSource(strings = {
            "1.png",
            "2.png",
            "3.png"})
    public void FillFormValueSource(String uploadFile) {
        practiceForm.openPage()
                .fillNameAndEmail(GenerateRandom.fakeFirstName, GenerateRandom.fakeLastName, GenerateRandom.fakeEmail)
                .fillGenderAndMobile(GenerateRandom.fakeNumber)
                .fillDateOfBirth("2000", "February", "22")
                .fillSubjectAndHobbies(GenerateRandom.fakeSubject)
                .uploadFile(uploadFile)
                .fillCurrentAddressAndState(GenerateRandom.fakeCurrentAddress, "NCR", "Delhi")

                .verifyModal("Student Name", GenerateRandom.fakeFirstName + " " + GenerateRandom.fakeLastName)
                .verifyModal("Student Email", GenerateRandom.fakeEmail)
                .verifyModal("Gender", "Male")
                .verifyModal("Mobile", GenerateRandom.fakeNumber)
                .verifyModal("Date of Birth", "22 February,2000")
                .verifyModal("Subjects", GenerateRandom.fakeSubject)
                .verifyModal("Hobbies", "Sports, Reading, Music")
                .verifyModal("Picture", uploadFile)
                .verifyModal("Address", GenerateRandom.fakeCurrentAddress)
                .verifyModal("State and City", "NCR Delhi");

    }
    @ParameterizedTest(name = "Отображение локализованных веденных данных {0} при регистрации")
    @Tag("Change date")
    @CsvFileSource(resources = "/cvsTable.csv")
    public void FillFormCsvSource(String year, String month, String date, String photo) {
        practiceForm.openPage()
                .fillNameAndEmail(GenerateRandom.fakeFirstName, GenerateRandom.fakeLastName, GenerateRandom.fakeEmail)
                .fillGenderAndMobile(GenerateRandom.fakeNumber)
                .fillDateOfBirth(year, month, date)
                .fillSubjectAndHobbies(GenerateRandom.fakeSubject)
                .uploadFile(photo)
                .fillCurrentAddressAndState(GenerateRandom.fakeCurrentAddress, "NCR", "Delhi")

                .verifyModal("Student Name", GenerateRandom.fakeFirstName + " " + GenerateRandom.fakeLastName)
                .verifyModal("Student Email", GenerateRandom.fakeEmail)
                .verifyModal("Gender", "Male")
                .verifyModal("Mobile", GenerateRandom.fakeNumber)
                .verifyModal("Date of Birth", date + " " + month + "," + year)
                .verifyModal("Subjects", GenerateRandom.fakeSubject)
                .verifyModal("Hobbies", "Sports, Reading, Music")
                .verifyModal("Picture", photo)
                .verifyModal("Address", GenerateRandom.fakeCurrentAddress)
                .verifyModal("State and City", "NCR Delhi");

    }
    @ParameterizedTest(name = "Отображение локализованных веденных данных {0} при регистрации")
    @Tag("Change date")
    @CsvFileSource(resources = "/cvsTable.csv")
    public void FillFormEnumSource(String year, String month, String date) {
        practiceForm.openPage()
                .fillNameAndEmail(GenerateRandom.fakeFirstName, GenerateRandom.fakeLastName, GenerateRandom.fakeEmail)
                .fillGenderAndMobile(GenerateRandom.fakeNumber)
                .fillDateOfBirth(year, month, date)
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
