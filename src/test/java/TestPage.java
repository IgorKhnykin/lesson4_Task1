import org.junit.jupiter.api.Test;

public class TestPage extends BasePage{
    @Test
    public void FillForm() {
        new PracticeForm().openPage()
                .fillNameAndEmail("Igor", "Khnykin", "igor@mail.ru")
                .fillGenderAndMobile("1234567890")
                .fillDateOfBirth("2000", "February", "22")
                .fillSubjectAndHobbies("Math")
                .uploadFile("1.png")
                .fillCurrentAddressAndState("Voronejskaya", "NCR", "Delhi")
                .testForCheckingData();

    }

}
