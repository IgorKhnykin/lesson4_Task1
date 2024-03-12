import static com.codeborne.selenide.Selenide.$x;

public class DateOfBirthForm {
    public void dateOfBirth(String year, String month, String day) {
        $x("//select[@class=\"react-datepicker__year-select\"]").selectOption(year);
        $x("//select[@class=\"react-datepicker__month-select\"]").selectOption(month);
        $x("//*[text()=" + day + "]").click();
    }
}