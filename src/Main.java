import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {


        Generator r =new Generator();
        Person[] person=new Person[10];
        for (int i = 0; i <person.length ; i++) {
            person[i] = new Person(r.getName(), r.getAge(), r.getDate());
         //   System.out.println(person[i]);

        }
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person2.txt"));

                oos.writeObject(person);
                oos.writeUTF(String.valueOf(r));
                oos.close();


        }

        }


