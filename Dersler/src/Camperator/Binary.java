package Camperator;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Binary {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 89, 4, 45, 9, 8, 66, 6, 5, 5446, 0, 46};
        int search = 3;
        int first = 0;
        int last = arr.length - 1;
        int count = 0;
        boolean found = false;

        for (count = 0; first <= last; count++) {
            int mid = (first + last) / 2;
            if (search == arr[mid]) {
                System.out.println("element tapildi : " + arr[mid]);
                found = true;
                break;
            } else if (search > arr[mid]) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        if (!found) {
            System.out.println("element tapilmadi !!");
        }
        System.out.println("dovr sayi :" + count);
    }
}
