import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainRead {


    public static void main(String[] args) throws IOException, ClassNotFoundException {


        ObjectInputStream ois =new ObjectInputStream(new FileInputStream("person.txt"));
        Object obj=ois.readObject();
       // Person=(TestClass[])obj;
        ois.close();


        System.out.println(ois);
    }
}


