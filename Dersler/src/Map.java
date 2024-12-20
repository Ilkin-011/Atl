import java.util.Arrays;
import java.util.List;

public class Map {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Samir", "Əsəd", "Mahir");
        var listString = list
                .stream()
                .map(n -> Arrays.asList(n.split(""))).toList();
        System.out.println(listString);

    }
}
