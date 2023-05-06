package pl.javastart.task;

import pl.javastart.task.exceptions.IncorrectAgeException;
import pl.javastart.task.exceptions.NameUndefinedException;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private final String pesel;

    public Person(String firstName, String lastName, int age, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;

        checkFirstName(firstName);
        checkLastName(lastName);
        checkAge(age);
        this.age = age;
        this.pesel = pesel;
    }

    private static void checkFirstName(String firstName) {
        if (firstName == null || firstName.length() < 2) {
            throw new NameUndefinedException("Imię nieprawidłowe " + firstName + "\nKoniec programu");
        }
    }

    private static void checkLastName(String lastName) {
        if (lastName == null || lastName.length() < 2) {
            throw new NameUndefinedException("Nazwisko nieprawidłowe " + lastName + "\nKoniec programu");
        }
    }

    private static void checkAge(int age) {
        if (age < 1) {
            throw new IncorrectAgeException("Nieprawidłowy wiek" + "\nKoniec programu");
        }
    }

    public void setFirstName(String firstName) {
        checkFirstName(firstName);
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        checkLastName(lastName);
        this.lastName = lastName;
    }

    public void setAge(int age) {
        checkAge(age);
        this.age = age;

    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
