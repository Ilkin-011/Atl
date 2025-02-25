package Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
public class Mainn {
    public static void main(String[] args) {
        Studentt studentt = new Studentt("ILkin", 11);
        Studentt studentt1 = new Studentt("Huseyn", 13);
        Studentt studentt2 = new Studentt("Emin", 12);
        var x = Arrays.asList(studentt, studentt1, studentt2);
        System.out.println(x);
        x.sort(new Comparator<Studentt>() {
            @Override
            public int compare(Studentt o1, Studentt o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        System.out.println(x);
    }
}
