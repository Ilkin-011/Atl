package Ders20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Map {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Samir", "Əsəd", "Mahir");
        var listString = list
                .stream()
                .map(n -> Arrays.asList(n.split(""))).toList();
        System.out.println(listString);
        List<String> ab = list.stream().flatMap(n -> Arrays.stream(n.split(""))).toList();
        System.out.println(ab);
    }
}
