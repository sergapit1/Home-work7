
import java.io.*;
import java.util.*;


public class MainRead {
    public static void main(String[] args) throws IOException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person4.bin"));
        List<Person> person1 = new ArrayList<>();
        try {

            person1 = Arrays.asList((Person[]) ois.readObject());
            ois.close();

        } catch (ClassCastException | ClassNotFoundException | InvalidClassException e) {
        }

        System.out.println("Before sort by nick " + person1);

        person1.sort((o1, o2) -> o2.getNick().charAt(0) - o1.getNick().charAt(0));

        System.out.println("After sort by nick " + person1);


        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("sortperson.txt"));
        String space = " ";
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < person1.size() - 1) {
            sb.append(person1.get(i));
            sb.append(space);
            i++;
        }
        sb.append(person1.get(i));

        String person2 = sb.toString();
        System.out.println("String : " + person2);
        // oos.writeUTF(person2);
        oos.writeBytes(person2);
        oos.close();

    }
}

