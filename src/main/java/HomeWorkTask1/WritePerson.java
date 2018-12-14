package HomeWorkTask1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WritePerson {
    public static void main(String[] args) throws IOException {
        Person person1 = new Person(1, "Ivan");
        Person person2 = new Person(2, "Petro");

        FileOutputStream fos = new FileOutputStream
                ("/home/yaroslav/IdeaProjects/Lesson10/src/main/resources/Person.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(person1);
        oos.writeObject(person2);
        oos.close();
    }
}
