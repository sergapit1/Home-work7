import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {


        Generator r = new Generator();
        Person[] person = new Person[100];
        for (int i = 0; i < person.length; i++) {
            person[i] = new Person(r.getName(), r.getAge(), r.getDate());
           // System.out.println(person[i]);


        }
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person4.bin"));


        oos.writeObject(person);
        oos.close();
    }


}


