import com.codeborne.selenide.commands.PressEnter;
import org.openqa.selenium.Keys;

import java.awt.image.Kernel;
import java.io.File;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class PracticeForm {
    public PracticeForm fillNameAndEmail() {
        $x("//input[@placeholder=\"First Name\"]").setValue("Igor");
        $x("//input[@placeholder=\"Last Name\"]").setValue("Khnykin");
        $x("//input[@placeholder=\"name@example.com\"]").setValue("igor@mail.ru");
        return this;
        //*[text()="2001"]
    }
    public PracticeForm fillGenderAndMobile() {
        $x("//label[@for=\"gender-radio-1\"]").click();
        $x("//input[@placeholder=\"Mobile Number\"]").setValue("9384816311");
        return this;
    }
    public PracticeForm fillDateOfBirth() {
        $x("//input[@id=\"dateOfBirthInput\"]").click();
        $x("//select[@class=\"react-datepicker__year-select\"]").selectOption("2001");
        $x("//select[@class=\"react-datepicker__month-select\"]").selectOption("February");
        $x("//*[text()=\"22\"]").click();
        return this;
    }
    public PracticeForm fillSubjectAndHobbies() {
        $x("//input[@id=\"subjectsInput\"]").setValue("Maths").pressEnter();
        $x("//label[@for=\"hobbies-checkbox-1\"]").click();
        $x("//label[@for=\"hobbies-checkbox-2\"]").click();
        $x("//label[@for=\"hobbies-checkbox-3\"]").click();
        return this;
    }
    public PracticeForm uploadFile() {

        //$x("//input[@id=\"uploadPicture\"]").uploadFile(new File("src/test/resources/1.png"));
        $x("//input[@id=\"uploadPicture\"]").uploadFromClasspath("1.png");


        return this;
    }
    public PracticeForm fillCurrentAddressAndState() {

        $x("//textarea[@id=\"currentAddress\"]").setValue("Voronejskaya");
        $x("//input[@id=\"react-select-3-input\"]").setValue("NCR").pressEnter();
        $x("//input[@id=\"react-select-4-input\"]").setValue("Delhi").pressEnter();
        $x("//button[@id=\"submit\"]").click();
        return this;
    }
    public PracticeForm testForCheckingData() {
        $x("//div[@class=\"table-responsive\"]").shouldHave(text("Igor"));
        $x("//div[@class=\"table-responsive\"]").shouldHave(text("Khnykin"));
        $x("//div[@class=\"table-responsive\"]").shouldHave(text("igor@mail.ru"));
        $x("//div[@class=\"table-responsive\"]").shouldHave(text("Male"));
        $x("//div[@class=\"table-responsive\"]").shouldHave(text("9384816311"));
        $x("//div[@class=\"table-responsive\"]").shouldHave(text("22 February,2001"));
        $x("//div[@class=\"table-responsive\"]").shouldHave(text("Maths"));
        $x("//div[@class=\"table-responsive\"]").shouldHave(text("Sports, Reading, Music"));
        $x("//div[@class=\"table-responsive\"]").shouldHave(text("1.PNG"));
        $x("//div[@class=\"table-responsive\"]").shouldHave(text("NCR"));
        $x("//div[@class=\"table-responsive\"]").shouldHave(text("Delhi"));
        return this;
    }
 }
