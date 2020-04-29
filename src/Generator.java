import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class Generator {


    public String getName() {

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int letterNumber;
        char letter;
        String word = new String();
        for (int l = 0; l < 6; l++) {
            letterNumber = (int) (Math.random() * 26);
            letter = alphabet.charAt(letterNumber);
            word += letter;

        }
        // System.out.println(word);
        return word;

    }

    public int age;

    public int getAge() {
        age = (int) (Math.random() * 16 + 1);
        // System.out.println(age);
        return age;
    }

    public LocalDate getDate() {
        long minDay = LocalDate.of(1985, 1, 1).toEpochDay();
        long maxDay = LocalDate.of(2020, 12, 31).toEpochDay();
        long randomDay = ThreadLocalRandom.current().nextLong(minDay, maxDay);
        LocalDate date = LocalDate.ofEpochDay(randomDay);
        //  System.out.println(date);

        return date;
    }

}
