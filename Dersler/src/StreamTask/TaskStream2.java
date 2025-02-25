package StreamTask;

import java.util.LinkedList;
import java.util.List;
public class TaskStream2 {
    public static void main(String[] args) {
        LinkedList<Integer>x=new LinkedList<>();
        x.add(4);
        x.add(5);
        x.add(15);
        x.add(16);
        x.add(18);
        x.add(19);
        x.add(20);
        x.stream().filter(n->n%2==0)
                .map(n->n*2)
                .filter(n->n>20)
                .sorted()
                .forEach(System.out::println);
    }
}
