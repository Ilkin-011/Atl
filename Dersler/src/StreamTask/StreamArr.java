package StreamTask;

import java.util.ArrayList;
import java.util.List;

public class StreamArr {
    public static void main(String[] args) {
        ArrayList<Integer> xx = new ArrayList<>();
        xx.add(-12);
        xx.add(9);
        xx.add(7);
        xx.add(10);
        xx.add(15);
        xx.add(22);
        xx.add(-23);
        xx.add(25);
        xx.add(36);
        buDefeQaytar(xx);
    }
    public static <T extends List<Integer>> void buDefeQaytar(T a) {
        a.stream().filter(n -> n > 0)
                .map(n -> n * n)
                .filter(n -> n > 10)
                .sorted()
                .forEach(System.out::println);
    }
}
