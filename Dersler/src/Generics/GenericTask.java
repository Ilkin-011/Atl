package Generics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class GenericTask {
    public static void main(String[] args) {
        List<Integer> x = Arrays.asList(21, 3, 12, 24, 4, 34, 35, 546, 5, 67);
        List<String> x1 = Arrays.asList("Salam", "Aysel", "Gulu", "Aynur");
        List<Double> x2 = Arrays.asList(2.5, 0.5, 3.2, 0.4);
        System.out.println("Yalnız cüt ədədlər çapa verilsin :");
        one(x,  e -> e % 2 == 0);
        System.out.println("Siyahıdan ancaq ilk hərfi `A` olanları çapa verin :");
        one(x1, e -> e.startsWith("A"));
        System.out.println("2-dən böyük olanlar :");
        one(x2,  e -> e > 2.0);
    }

    public static <T> void one(List<T> list, Predicate<T> predicate) {
        list.stream().filter(predicate).forEach(System.out::println);
    }


//    public static <T extends List<String>> void two(T b) {
//        b.stream().filter(m -> m.startsWith("A")).forEach(System.out::println);
//    }
//
//    public static <T extends List<Double>> void three(T c) {
//    c.stream().filter(n->n>1).forEach(System.out::println);
//    }
//        public static <T> void sum(List<T> list) {
//            if (list.isEmpty()) {
//                return;
//            }
//
//            T firstElement = list.get(0);
//
//            if (firstElement instanceof Integer) {
//                one((List<Integer>) list);
//            } else if (firstElement instanceof String) {
//                two((List<String>) list);
//            } else if (firstElement instanceof Double) {
//               three ((List<Double>) list);
//            }
//    }

}