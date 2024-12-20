package Ders20;

import java.util.Arrays;
import java.util.List;

public class LIstInt {
    public static void main(String[] args) {
        List<Integer>a= Arrays.asList(12,32,43,54,65,8655,4632,42,1432,5,353,554);
        List<Integer>a1= Arrays.asList(12,32,43);
        var aList=a
                .stream()
                .map(m ->Arrays.asList(a,a1))
                .toList();
        System.out.println(aList);

    }
}
