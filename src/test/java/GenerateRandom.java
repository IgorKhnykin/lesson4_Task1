import com.github.javafaker.Faker;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class GenerateRandom {
    public static Random random = new Random();
    public static Faker faker = new Faker();
    static String fakeFirstName = faker.name().firstName();
    static String fakeLastName = faker.name().lastName();
    static String fakeEmail = faker.internet().emailAddress();
    static String fakeNumber = 8 + faker.phoneNumber().subscriberNumber(9);
    static String fakeSubject = faker.options().option("Accounting", "Maths", "Arts", "English", "Physics", "Chemistry",
            "Computer Science", "Economics", "Social Studies", "History", "Civics", "Commerce", "Hindi", "Biology");
    static String fakeCurrentAddress = faker.address().streetAddress();
    public static int getRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
    public static void getRandomItemFromArray(String[] subjects) {
        int index = getRandomInt(0, subjects.length - 1);
    }

}
