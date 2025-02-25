package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

    public class Product {
        String name;
        double price;

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{name='" + name + "', price=" + price + "}";
        }
    }
