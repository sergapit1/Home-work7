
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainRead {
    public static void main(String[] args) throws IOException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person4.bin"));
        List<Person> person1 = new ArrayList<>();
        try {

            person1 = Arrays.asList((Person[]) ois.readObject());
            ois.close();

        } catch (ClassCastException | ClassNotFoundException e) {
        }

        System.out.print(person1);
    }
}

