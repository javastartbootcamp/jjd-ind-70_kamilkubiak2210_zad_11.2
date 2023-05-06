package pl.javastart.task;

import pl.javastart.task.exceptions.IncorrectAgeException;
import pl.javastart.task.exceptions.NameUndefinedException;

public class Main {

    public static void main(String[] args) {
        Person person = null;
        try {
            person = new Person("Jan", null, 25, "1234567890");
            System.out.println(person);
        } catch (NameUndefinedException e) {
            System.err.println(e.getMessage());
        }

        Person person2 = new Person("Jan", "Kowalski", 25, "1234567890");
        System.out.println(person2);
        try {
            person2.setAge(-10);
            System.out.println(person2);
        } catch (IncorrectAgeException e) {
            System.err.println(e.getMessage());
        }

    }
}
