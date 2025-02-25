package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CustomDistinctExample {
        public static void main(String[] args) {
            List<Product> products = Arrays.asList(
                    new Product("Apple", 1.0),
                    new Product("Banana", 2.0),
                    new Product("Apple", 1.5),
                    new Product("Cherry", 3.0)
            );
            List<Product> uniqueByName = products.stream()
                    .collect(Collectors.toMap(
                            Product::getName,
                            product -> product,
                            (existing, replacement) -> existing))
                    .values()
                    .stream()
                    .collect(Collectors.toList());
            uniqueByName.forEach(System.out::println);
        }
    }
