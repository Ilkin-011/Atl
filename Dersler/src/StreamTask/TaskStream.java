package StreamTask;

import java.io.PrintStream;
import java.util.*;

public class TaskStream {
    public static void main(String[] args) {
        Set<String> x = new HashSet<>();
        x.add("Kia");
        x.add("Merc");
        x.add("Cadillac");
        x.add("Porsche");
        x.add("Bugatti");
        x.add("Rolls-Royce");
        System.out.println(x);

        List<String> xx = new ArrayList<>(x);
        xx.stream().filter(n -> n.length() >= 5)
                .sorted()
                .forEach(System.out::println);
    }
}

