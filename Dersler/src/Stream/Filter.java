package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        Customer customer = new Customer("Vaqif", 300);
        Customer customer1 = new Customer("Aqil", 301);
        Customer customer2 = new Customer("Asif", 500);
        var myList = Arrays.asList(customer, customer1, customer2);
        System.out.println(myList);
        var x = myList.stream().filter(n -> n.getDebt() > 300).map(n -> {
            n.setDebt((int) (n.getDebt() * 1.5));
            return n;
        }).toList();
        System.out.println(x);
    }
}
