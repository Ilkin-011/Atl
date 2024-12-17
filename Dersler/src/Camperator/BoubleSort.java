package Camperator;
public class BoubleSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 89, 4, 45, 8, 66, 6, 5, 5446, 0, 46};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                int first = 0;
                if (arr[j] > arr[j + 1]) {
                    first = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = first;
                }
            }
        }
        for (int i : arr) {
            System.out.print ( i + " ");
        }
    }
}

