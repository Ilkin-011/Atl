package Streamm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {
    private String name;
    private List<Phone> number;

    public Person(String name, List<Phone> number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public List<Phone> getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    public static void main(String[] args) {
        List<Phone> ilkinNumber = new ArrayList<>();
        ilkinNumber.add(new Phone("0555452121"));
        ilkinNumber.add(new Phone("0555452120"));
        List<Phone> samirNumber = new ArrayList<>();
        samirNumber.add(new Phone("055553121"));
        samirNumber.add(new Phone("0556452120"));
        List<Person> user = new ArrayList<>();
        user.add(new Person("Ilkin", ilkinNumber));
        user.add(new Person("Samir", samirNumber));
        List<String> all = user.stream().flatMap(l -> l.getNumber()
                        .stream())
                .map(Phone::getNumber)
                .toList();
        all.forEach(System.out::println);

    }
}
