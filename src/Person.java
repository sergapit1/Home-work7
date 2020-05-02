import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Person implements Serializable {
    public String nick;
    public int age;
    public LocalDate registration;

    public Person(String nick, int age, LocalDate registration) {
        this.nick = nick;
        this.age = age;
        this.registration = registration;

    }

    public String getNick() {
        return nick;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nick='" + nick + '\'' +
                ", age=" + age +
                ", registration=" + registration +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(nick, person.nick) &&
                Objects.equals(registration, person.registration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nick, age, registration);
    }

}
