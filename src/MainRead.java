import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainRead {


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person4.bin"));

        ArrayList<Person> person1 = new ArrayList<>();

        try {

            person1.add((Person) ois.readObject());
            ois.close();

        } catch (ClassCastException e) {
        }

        System.out.println(person1);
    }
}

